/*
-----------------------------------------------------------------------------
This source file is part of OGRE
(Object-oriented Graphics Rendering Engine)
For the latest info, see http://www.ogre3d.org

Copyright (c) 2000-2014 Torus Knot Software Ltd
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
-----------------------------------------------------------------------------
*/

//----------------------------------------------------------------------------- 
// Program Name: SGXLib_NormalMapLighting 
// Program Desc: Normal map lighting functions. 
// Program Type: Vertex/Pixel shader 
// Language: GLSL
//-----------------------------------------------------------------------------

//-----------------------------------------------------------------------------
void SGX_ConstructTBNMatrix(in vec3 vNormal, 
				   in vec3 vTangent, 
				   out mat3 vOut)
{
	vec3 vBinormal = cross(vTangent, vNormal);

	vOut[0][0] = vTangent.x;
	vOut[1][0] = vTangent.y;
	vOut[2][0] = vTangent.z;	

	vOut[0][1] = vBinormal.x;
	vOut[1][1] = vBinormal.y;
	vOut[2][1] = vBinormal.z;

	vOut[0][2] = vNormal.x;
	vOut[1][2] = vNormal.y;
	vOut[2][2] = vNormal.z;
}

//-----------------------------------------------------------------------------
void SGX_TransformNormal(in mat3 m, 
				   in vec3 v, 
				   out vec3 vOut)
{
	vOut = (m * v) ;
}

//-----------------------------------------------------------------------------
void SGX_TransformNormal(in mat4 m, 
				   in vec3 v, 
				   out vec3 vOut)
{
	vOut = (m * vec4(v, 1.0)).xyz ;
}

//-----------------------------------------------------------------------------
void SGX_TransformPosition(in mat4 m, 
				   in vec4 v, 
				   out vec3 vOut)
{
	vOut = (m * v).xyz;
}

//-----------------------------------------------------------------------------
void SGX_FetchNormal(in sampler2D s, 
				   in vec2 uv, 
				   out vec3 vOut)
{
	vOut = 2.0 * texture2D(s, uv).xyz - 1.0;
}

void SGX_FetchNormal(in sampler2D s, 
				   in vec2 uv, 
				   out vec4 vOut)
{
	
	vec4 color = texture2D(s, uv);
	vOut = vec4(2.0 * color.xyz - 1.0,color.w);
}


	

//-----------------------------------------------------------------------------
void SGX_Light_Directional_Diffuse(
				   in vec4 vTSNormal,
				   in vec3 vTSNegLightDir,
				   in vec3 vDiffuseColour, 
				   in vec3 vBaseColour, 
				   out vec3 vOut)
{
	vec3 vTSNegLightDirNorm	= normalize(vTSNegLightDir);		
	float nDotL					= dot(vTSNormal.xyz, vTSNegLightDirNorm);
	
	vOut = vBaseColour + vDiffuseColour * clamp(nDotL, 0.0, 1.0);
}

//-----------------------------------------------------------------------------
void SGX_Generate_Parallax_Texcoord(in sampler2D normalHeightMap,
						in vec2 texCoord,
						in vec3 eyeVec,
						in vec2 scaleBias,
						out vec2 newTexCoord)
{
	eyeVec = normalize(eyeVec);
	float height = texture2D(normalHeightMap, texCoord).a;
	float displacement = (height * scaleBias.x) + scaleBias.y;
	vec3 scaledEyeDir = eyeVec * displacement;
	newTexCoord = (scaledEyeDir  + vec3(texCoord, 1.0)).xy;
}





//-----------------------------------------------------------------------------
void SGX_Light_Directional_DiffuseSpecular(
					in vec4 vTSNormal,
					in vec3 vTSView,					
					in vec3 vTSNegLightDir,
					in vec3 vDiffuseColour, 
					in vec3 vSpecularColour, 
					in float fSpecularPower, 
					in vec3 vBaseDiffuseColour,
					in vec3 vBaseSpecularColour,					
					out vec3 vOutDiffuse,
					out vec3 vOutSpecular)
{
	vOutDiffuse  = vBaseDiffuseColour;
	vOutSpecular = vBaseSpecularColour;
		
	vec3 vTSNegLightDirNorm		= normalize(vTSNegLightDir);		
	float nDotL		   			= dot(vTSNormal.xyz, vTSNegLightDirNorm);		
	vec3 vTSViewNorm 			= normalize(vTSView);
	vec3 vHalfWay    			= normalize(vTSView + vTSNegLightDir);
	float nDotH        			= dot(vTSNormal.xyz, vHalfWay);
	
	if (nDotL > 0.0)
	{
		vOutDiffuse  += vDiffuseColour * nDotL;		
		vOutSpecular += vSpecularColour * pow(clamp(nDotH, 0.0, 1.0), fSpecularPower) * vTSNormal.w;						
	}
}



//-----------------------------------------------------------------------------
void SGX_Light_Point_Diffuse(
				    in vec4 vTSNormal,				    
				    in vec3 vTSToLight,
				    in vec4 vAttParams,
				    in vec3 vDiffuseColour, 
				    in vec3 vBaseColour, 
				    out vec3 vOut)
{
	vOut = vBaseColour;		
	
	float fLightD      = length(vTSToLight);	
	float nDotL        = dot(vTSNormal.xyz, normalize(vTSToLight));
	
	if (nDotL > 0.0 && fLightD <= vAttParams.x)
	{
		float fAtten	   = 1.0 / (vAttParams.y + vAttParams.z*fLightD + vAttParams.w*fLightD*fLightD);
			
		vOut += vDiffuseColour * nDotL * fAtten;
	}		
}

//-----------------------------------------------------------------------------
#define M_PI 3.141592653589793
#define ROUGHNESS_MIN 0.04

// The following equation models the Fresnel reflectance term of the spec equation (aka F())
// Implementation of fresnel from [4], Equation 15
vec3 specularReflection(vec3 reflectance0, vec3 reflectance90, float VdotH)
{
    return reflectance0 + (reflectance90 - reflectance0) * pow(clamp(1.0 - VdotH, 0.0, 1.0), 5.0);
}

// This calculates the specular geometric attenuation (aka G()),
// where rougher material will reflect less light back to the viewer.
// This implementation is based on [1] Equation 4, and we adopt their modifications to
// alphaRoughness as input as originally proposed in [2].
float geometricOcclusion(float NdotL, float NdotV, float alphaRoughness)
{
    float r = alphaRoughness;

    float attenuationL = 2.0 * NdotL / (NdotL + sqrt(r * r + (1.0 - r * r) * (NdotL * NdotL)));
    float attenuationV = 2.0 * NdotV / (NdotV + sqrt(r * r + (1.0 - r * r) * (NdotV * NdotV)));
    return attenuationL * attenuationV;
}

// The following equation(s) model the distribution of microfacet normals across the area being drawn (aka D())
// Implementation from "Average Irregularity Representation of a Roughened Surface for Ray Reflection" by T. S. Trowbridge, and K. P. Reitz
// Follows the distribution function recommended in the SIGGRAPH 2013 course notes from EPIC Games [1], Equation 3.
float microfacetDistribution(float NdotH, float alphaRoughness)
{
    float roughnessSq = alphaRoughness * alphaRoughness;
    float f = (NdotH * roughnessSq - NdotH) * NdotH + 1.0;
    return roughnessSq / (M_PI * f * f);
}

// Basic Lambertian diffuse
// Implementation from Lambert's Photometria https://archive.org/details/lambertsphotome00lambgoog
// See also [1], Equation 1
vec3 diffuse(vec3 diffuseColor)
{
    return diffuseColor / M_PI;
}

vec3 getIBLContribution(vec3 diffuseColor, vec3 specularColor, float NdotV, float perceptualRoughness, vec3 n, vec3 reflection)
{
    /*float mipCount = 9.0; // resolution of 512x512
    float lod = (perceptualRoughness * mipCount);
    // retrieve a scale and bias to F0. See [1], Figure 3
    vec3 brdf = texture2D(u_brdfLUT, vec2(NdotV, 1.0 - perceptualRoughness)).rgb;

    //vec3 diffuseLight = textureCube(u_DiffuseEnvSampler, n).rgb;

    vec3 specularLight = textureCubeLod(u_SpecularEnvSampler, reflection, lod).rgb;

    vec3 diffuse = diffuseLight * diffuseColor;
    vec3 specular = specularLight * (specularColor * brdf.x + brdf.y);

    return diffuse + specular;*/
	return vec3(0);
}

void SGX_Light_Point_DiffuseSpecular(
				    in vec4 vTSNormal,
				    in vec3 vTSView,
				    in vec3 vTSToLight,				  
				    in vec4 vAttParams,
				    in vec3 vDiffuseColour, 
				    in vec3 vAlbedoColour, 
					in float fSpecularPower, 
				    in vec3 vBaseDiffuseColour,
					in vec3 vBaseSpecularColour,					
					out vec3 vOutDiffuse,
					out vec3 vOutSpecular)
{
	vOutDiffuse  = vBaseDiffuseColour;
	vOutSpecular = vBaseSpecularColour;

	// missing inputs
	float perceptualRoughness = sqrt(2.0/(fSpecularPower + 2.0));
	float metallic = 0.0;

    metallic = clamp(metallic, 0.0, 1.0);

	// PBR equations
    perceptualRoughness = clamp(perceptualRoughness, ROUGHNESS_MIN, 1.0);

	// Roughness is authored as perceptual roughness; as is convention,
    // convert to material roughness by squaring the perceptual roughness [2].
	float alphaRoughness = perceptualRoughness * perceptualRoughness;

	float fLightD				= length(vTSToLight);
	vec3 vTSNegLightDirNorm	    = normalize(vTSToLight);		

	float NdotL					= clamp(dot(vTSNormal.xyz, vTSNegLightDirNorm), 0.001, 1.0);	
		
	if (NdotL < 0.0 || fLightD >= vAttParams.x)
		return;

	vec3 baseColorFactor = vec3(M_PI);
	//vec3 baseColorFactor = vec3(0);

	vec3 f0 = vec3(ROUGHNESS_MIN);
	vec3 diffuseColor = vAlbedoColour * baseColorFactor * (1.0 - f0) * (1.0 - metallic);

	vec3 specularColor = mix(f0, diffuseColor, metallic);
	// Compute reflectance.
	float reflectance = max(max(specularColor.r, specularColor.g), specularColor.b);

    // For typical incident reflectance range (between 4% to 100%) set the grazing reflectance to 100% for typical fresnel effect.
    // For very low reflectance range on highly diffuse objects (below 4%), incrementally reduce grazing reflecance to 0%.
    float reflectance90 = clamp(reflectance * 25.0, 0.0, 1.0);
    vec3 specularEnvironmentR0 = specularColor;
    vec3 specularEnvironmentR90 = vec3(1.0, 1.0, 1.0) * reflectance90;

	// old way
	vec3 vTSViewNorm   = normalize(vTSView);	
	vec3 h             = normalize(vTSViewNorm + vTSNegLightDirNorm);		
	float nDotH        = clamp(dot(vTSNormal.xyz, h), 0.0, 1.0);
	float LdotH        = clamp(dot(vTSNegLightDirNorm, h), 0.0, 1.0);
	float NdotV 	   = abs(dot(vTSNormal.xyz, vTSViewNorm)) + 0.001;
	float VdotH        = clamp(dot(vTSViewNorm, h), 0.0, 1.0);

	vec3 reflection = -normalize(reflect(vTSViewNorm, vTSNormal.xyz));

	float fAtten	   = 1.0 / (vAttParams.y + vAttParams.z*fLightD + vAttParams.w*fLightD*fLightD);					

	vec3 F = specularReflection(specularEnvironmentR0, specularEnvironmentR90, VdotH);
	float G = geometricOcclusion(NdotL, NdotV, alphaRoughness);
	float D = microfacetDistribution(nDotH, alphaRoughness);

	vec3 diffuseContrib = (1.0 - F) * diffuse(diffuseColor);
	vec3 specContrib = F * G * D / (4.0 * NdotL * NdotV);

	vOutDiffuse  += diffuseContrib * NdotL * fAtten * vDiffuseColour;	
	vOutSpecular += specContrib * NdotL * fAtten * vDiffuseColour;
}

//-----------------------------------------------------------------------------
void SGX_Light_Spot_Diffuse(
				    in vec4 vTSNormal,
				    in vec3 vTSToLight,
				    in vec3 vTSNegLightDir,				  
				    in vec4 vAttParams,
				    in vec3 vSpotParams,
				    in vec3 vDiffuseColour, 
				    in vec3 vBaseColour, 
				    out vec3 vOut)
{
	vOut = vBaseColour;
	
	float fLightD			= length(vTSToLight);
	vec3 vTSToLightNorm	= normalize(vTSToLight);
	float nDotL				= dot(vTSNormal.xyz, vTSToLightNorm);
	
	if (nDotL > 0.0 && fLightD <= vAttParams.x)
	{
		vec3 vTSNegLightDirNorm	= normalize(vTSNegLightDir);
		float fAtten	= 1.0 / (vAttParams.y + vAttParams.z*fLightD + vAttParams.w*fLightD*fLightD);
		float rho		= dot(vTSNegLightDirNorm, vTSToLightNorm);
		float fSpotE	= clamp((rho - vSpotParams.y) / (vSpotParams.x - vSpotParams.y), 0.0, 1.0);
		float fSpotT	= pow(fSpotE, vSpotParams.z);
		
		vOut += vDiffuseColour * nDotL * fAtten * fSpotT;
	}		
}

//-----------------------------------------------------------------------------
void SGX_Light_Spot_DiffuseSpecular(
				    in vec4 vTSNormal,
				    in vec3 vTSView,
				    in vec3 vTSToLight,					    
				    in vec3 vTSNegLightDir,		
				    in vec4 vAttParams,
				    in vec3 vSpotParams,
				    in vec3 vDiffuseColour, 
				    in vec3 vSpecularColour, 
					in float fSpecularPower, 
				    in vec3 vBaseDiffuseColour,
					in vec3 vBaseSpecularColour,					
					out vec3 vOutDiffuse,
					out vec3 vOutSpecular)
{
	vOutDiffuse  = vBaseDiffuseColour;
	vOutSpecular = vBaseSpecularColour;
	
	float fLightD			= length(vTSToLight);
	vec3 vTSToLightNorm	= normalize(vTSToLight);
	float nDotL				= dot(vTSNormal.xyz, vTSToLightNorm);
	
	if (nDotL > 0.0 && fLightD <= vAttParams.x)
	{
		vec3 vTSNegLightDirNorm	= normalize(vTSNegLightDir);
		vec3 vTSViewNorm = normalize(vTSView);
		vec3 vHalfWay    = normalize(vTSViewNorm + vTSNegLightDirNorm);	
		float nDotH        = dot(vTSNormal.xyz, vHalfWay);
		float fAtten	= 1.0 / (vAttParams.y + vAttParams.z*fLightD + vAttParams.w*fLightD*fLightD);
		float rho		= dot(vTSNegLightDirNorm, vTSToLightNorm);
		float fSpotE	= clamp((rho - vSpotParams.y) / (vSpotParams.x - vSpotParams.y), 0.0, 1.0);
		float fSpotT	= pow(fSpotE, vSpotParams.z);

		vOutDiffuse  += vDiffuseColour * nDotL * fAtten * fSpotT;
		vOutSpecular += vSpecularColour * pow(clamp(nDotH, 0.0, 1.0), fSpecularPower) * fAtten * fSpotT * vTSNormal.w;
	}	
}

