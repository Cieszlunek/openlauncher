package com.benny.openlauncher.feature.secretapps;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecretAppsSettings {
    private static final int DESKTOP_NUMBER_WITH_SECRET_ONLY_PAGES = 2; // numeration starts from 0

    private static final Set<String> secretApps;

    static {
        Set<String> secretAppsTemp = new HashSet<>();
        secretAppsTemp.add(new SecretApp("pl.allegro", "pl.allegro.Allegro").toString());
        secretAppsTemp.add(new SecretApp("pl.ballegro", "pl.allegro.BAllegro").toString());
        secretApps = Collections.unmodifiableSet(secretAppsTemp);
    }

    public static Set<String> getSecretApps() {
        return secretApps;
    }

    public static boolean isDesktopPageWithSecretApps(int currentPage) {
        return currentPage == DESKTOP_NUMBER_WITH_SECRET_ONLY_PAGES;
    }
}