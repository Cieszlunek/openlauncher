package com.benny.openlauncher.widget;

import android.content.Context;
import android.util.AttributeSet;

public class SecretAppDrawerPage extends AppDrawerPage {

    public SecretAppDrawerPage(Context context, AttributeSet attr) {
        super(context, attr);
    }

    public SecretAppDrawerPage(Context context) {
        super(context);
    }

    @Override
    protected boolean isAppShouldBeDisplayed(boolean isSecretApp) {
        return isSecretApp;
    }
}
