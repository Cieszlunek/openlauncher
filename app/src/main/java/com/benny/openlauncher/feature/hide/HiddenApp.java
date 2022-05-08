package com.benny.openlauncher.feature.hide;

import android.content.pm.ResolveInfo;

import com.benny.openlauncher.model.App;

public class HiddenApp {
    private final App wrappedApp;

    public HiddenApp(String packageName, String className) {
        ResolveInfo resolveInfo = new HiddenAppResolveInfo("pl.allegro", "pl.allegro.Allegro");
        wrappedApp = new App(null, resolveInfo, null);
    }

    @Override
    public String toString() {
        return wrappedApp.getComponentName();
    }
}
