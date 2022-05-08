package com.benny.openlauncher.feature.hide;

import java.util.ArrayList;
import java.util.List;

public class SecretAppsProvider {
    private final List<String> secretApps;

    public SecretAppsProvider() {
        secretApps = new ArrayList<>();
        secretApps.add(new HiddenApp("pl.allegro", "pl.allegro.Allegro").toString());
        secretApps.add(new HiddenApp("pl.ballegro", "pl.allegro.BAllegro").toString());
    }

    public ArrayList<String> getSecretHiddenApps() {
        return new ArrayList<>(secretApps);
    }
}