package com.androiddesdecero.dagger2cursofinal.di;

import android.app.Application;

/**
 * Created by albertopalomarrobledo on 6/1/19.
 */

public class BaseApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpGraph();
    }

    private void setUpGraph(){
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
