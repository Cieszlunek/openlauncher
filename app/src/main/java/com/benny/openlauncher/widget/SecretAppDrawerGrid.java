package com.benny.openlauncher.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

import com.benny.openlauncher.R;
import com.benny.openlauncher.feature.secretapps.SecretAppsSettings;
import com.benny.openlauncher.interfaces.AppUpdateListener;
import com.benny.openlauncher.manager.Setup;
import com.benny.openlauncher.model.App;
import com.benny.openlauncher.model.Item;
import com.benny.openlauncher.util.AppManager;
import com.benny.openlauncher.util.DragAction;
import com.benny.openlauncher.util.DragHandler;
import com.benny.openlauncher.util.Tool;
import com.benny.openlauncher.viewutil.IconLabelItem;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.turingtechnologies.materialscrollbar.AlphabetIndicator;
import com.turingtechnologies.materialscrollbar.DragScrollBar;
import com.turingtechnologies.materialscrollbar.INameableAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SecretAppDrawerGrid extends AppDrawerGrid {
    public SecretAppDrawerGrid(Context context) {
        super(context);
    }

    @Override
    protected List<App> filterApps(List<App> apps) {
        Set<String> secretApps = SecretAppsSettings.getSecretApps();
        List<App> filteredApps = new ArrayList<>();
        for (App app : apps) {
            boolean isSecretApp = secretApps.contains(app.getComponentName());
            if (isSecretApp) {
                filteredApps.add(app);
            }
        }
        filteredApps.addAll(AppManager.getInstance(null).getFilteredOutApps());
        return filteredApps;
    }
}
