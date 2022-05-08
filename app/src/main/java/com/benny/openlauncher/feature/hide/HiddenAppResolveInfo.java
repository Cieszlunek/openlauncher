package com.benny.openlauncher.feature.hide;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

class HiddenAppResolveInfo extends ResolveInfo {
    public HiddenAppResolveInfo(String packageName, String className) {
        this.activityInfo = new ActivityInfo();
        this.activityInfo.packageName = packageName;
        this.activityInfo.name = className;
    }

    @Override
    public CharSequence loadLabel(PackageManager pm) {
        return "";
    }

    @Override
    public Drawable loadIcon(PackageManager pm) {
        return null;
    }
}
