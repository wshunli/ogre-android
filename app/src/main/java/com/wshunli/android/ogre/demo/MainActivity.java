package com.wshunli.android.ogre.demo;

import android.content.res.AssetManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import org.Ogre.ApplicationContext;
import org.Ogre.Camera;
import org.Ogre.ColourValue;
import org.Ogre.Entity;
import org.Ogre.Light;
import org.Ogre.SceneManager;
import org.Ogre.SceneNode;
import org.Ogre.ShaderGenerator;
import org.Ogre.Viewport;

public class MainActivity extends AppCompatActivity {

    protected Handler handler = null;
    protected SurfaceView surfaceView = null;
    protected Surface lastSurface = null;

    private Runnable renderer = null;
    private boolean paused = false;
    private boolean initOGRE = false;
    private AssetManager assetMgr = null;

    org.Ogre.ApplicationContext ogreApp = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handler = new Handler();
        sysInit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(renderer);
        paused = true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        paused = false;
        handler.post(renderer);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Runnable destroyer = new Runnable() {
            public void run() {
                ogreApp.shutdown();
            }
        };
        handler.post(destroyer);
    }

    private void sysInit() {
        final Runnable initRunnable = new Runnable() {
            public void run() {
                if (!initOGRE) {
                    initOGRE = true;

                    if (assetMgr == null) {
                        assetMgr = getResources().getAssets();
                    }

                    renderer = new Runnable() {
                        public void run() {

                            if (paused)
                                return;

                            if (!wndCreate && lastSurface != null) {
                                wndCreate = true;

                                if (ogreApp == null) {
                                    ogreApp = new ApplicationContext();
                                    ogreApp.initAppForAndroid(assetMgr, lastSurface);

                                    SceneManager scnMgr = ogreApp.getRoot().createSceneManager();
                                    ShaderGenerator.getSingleton().addSceneManager(scnMgr);

                                    Light light = scnMgr.createLight("MainLight");
                                    SceneNode lightnode = scnMgr.getRootSceneNode().createChildSceneNode();
                                    lightnode.setPosition(0, 10, 15);
                                    lightnode.attachObject(light);

                                    Camera cam = scnMgr.createCamera("myCam");
                                    cam.setNearClipDistance(5);
                                    cam.setAutoAspectRatio(true);

                                    SceneNode camnode = scnMgr.getRootSceneNode().createChildSceneNode();
                                    camnode.attachObject(cam);
                                    camnode.setPosition(0, 0, 15);

                                    Entity ent = scnMgr.createEntity("Sinbad.mesh");
                                    SceneNode node = scnMgr.getRootSceneNode().createChildSceneNode();
                                    node.attachObject(ent);

                                    Viewport vp = ogreApp.getRenderWindow().addViewport(cam);
                                    vp.setBackgroundColour(new ColourValue(0.3f, 0.3f, 0.3f));
                                } else {
                                    ogreApp.getRenderWindow()._notifySurfaceCreated(lastSurface);
                                }

                                handler.post(this);
                                return;
                            }

                            if (initOGRE && wndCreate) {
                                ogreApp.getRoot().renderOneFrame();
                            }

                            handler.post(this);
                        }
                    };

                    handler.post(renderer);
                }
            }

        };

        SurfaceView view = new SurfaceView(this);
        SurfaceHolder holder = view.getHolder();
        surfaceView = view;

        holder.addCallback(new SurfaceHolder.Callback() {
            public void surfaceCreated(SurfaceHolder holder) {
                if (holder.getSurface() != null
                        && holder.getSurface().isValid()) {
                    lastSurface = holder.getSurface();
                    handler.post(initRunnable);
                }
            }

            public void surfaceDestroyed(SurfaceHolder holder) {
                if (initOGRE && wndCreate) {
                    wndCreate = false;
                    lastSurface = null;
                    handler.post(new Runnable() {
                        public void run() {
                            ogreApp.getRenderWindow()._notifySurfaceDestroyed();
                        }
                    });
                }
            }

            public void surfaceChanged(SurfaceHolder holder, int format,
                                       int width, int height) {

            }
        });
        setContentView(surfaceView);
    }

    boolean wndCreate = false;

    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
        }
    }

    static {
        System.loadLibrary("OgreJNI");
    }
}
