package com.example.myjetpack.base;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

/**
 * @author SuTs
 * @create 2020/12/11 17:30
 * @Describe
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppObserver());
    }
}
