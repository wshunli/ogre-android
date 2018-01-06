#version 100

precision mediump int;
precision mediump float;

uniform sampler2D Image;
uniform float scale;
uniform float pixelSize;
varying vec2 oUv0;

// The Laplace filter approximates the second order derivate,
// that is, the rate of change of slope in the image. It can be
// used for edge detection. The Laplace filter gives negative
// response on the higher side of the edge and positive response
// on the lower side.

// This is the filter kernel:
// 0  1  0
// 1 -4  1
// 0  1  0

void main()
{
    vec2 samples[4];
	samples[0] = vec2(0, -1);
	samples[1] = vec2(-1, 0);
	samples[2] = vec2(1, 0);
	samples[3] = vec2(0, 1);

    mediump vec4 tc = texture2D(Image, oUv0);
    vec4 laplace = -4.0 * tc;

    // Sample the neighbor pixels
    for (int i = 0; i < 4; i++){
       laplace += texture2D(Image, oUv0 + pixelSize * samples[i]);
    }

    gl_FragColor = (0.5 + scale * laplace);
}

