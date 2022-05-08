package com.benny.openlauncher;

import android.app.Application;

import com.benny.openlauncher.util.AppSettings;
import com.benny.openlauncher.util.LauncherAction;

public class AppObject extends Application {
    private static AppObject _instance;

    public static AppObject get() {
        return _instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        _instance = this;

        setOpenAppDrawerOnPinchIn();
    }

    private void setOpenAppDrawerOnPinchIn() {
        AppSettings.get().setString(R.string.pref_key__gesture_pinch_in, LauncherAction.Action.AppDrawer.toString());
    }
}