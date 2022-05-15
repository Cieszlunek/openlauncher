package com.benny.openlauncher.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.benny.openlauncher.R;
import com.benny.openlauncher.manager.Setup;

public class SecretAppDrawerController extends AppDrawerController {

    public SecretAppDrawerController(Context context) {
        super(context);
    }

    public SecretAppDrawerController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SecretAppDrawerController(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void init() {
        if (isInEditMode()) return;
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        _drawerMode = Setup.appSettings().getDrawerStyle();
        setVisibility(GONE);
        setBackgroundColor(Setup.appSettings().getDrawerBackgroundColor());
        switch (_drawerMode) {
            case Mode.GRID:
                _drawerViewGrid = new SecretAppDrawerGrid(getContext());
                addView(_drawerViewGrid);
                break;
            case Mode.PAGE:
            default:
                _drawerViewPage = (SecretAppDrawerPage) layoutInflater.inflate(R.layout.view_secret_app_drawer_page, this, false);
                addView(_drawerViewPage);
                PagerIndicator indicator = (PagerIndicator) layoutInflater.inflate(R.layout.view_drawer_indicator, this, false);
                addView(indicator);
                _drawerViewPage.withHome(indicator);
                break;
        }
    }

}
