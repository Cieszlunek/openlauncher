package com.benny.openlauncher.feature.secretapps;

import android.content.pm.ResolveInfo;

import com.benny.openlauncher.model.App;

public class SecretApp {
    private final App wrappedApp;

    public SecretApp(String packageName, String className) {
        ResolveInfo resolveInfo = new SecretAppResolveInfo("pl.allegro", "pl.allegro.Allegro");
        wrappedApp = new App(null, resolveInfo, null);
    }

    @Override
    public String toString() {
        return wrappedApp.getComponentName();
    }
}
