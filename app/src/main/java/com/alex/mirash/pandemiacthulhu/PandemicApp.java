package com.alex.mirash.pandemiacthulhu;

import android.app.Application;

/**
 * @author Mirash
 */

public class PandemicApp extends Application {
    private static PandemicApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static PandemicApp getInstance() {
        return instance;
    }
}
