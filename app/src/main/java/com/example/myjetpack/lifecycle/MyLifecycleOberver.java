package com.example.myjetpack.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author SuTs
 * @create 2020/12/11 17:04
 * @Describe
 */
class MyLifecycleOberver implements LifecycleObserver {
    private static final String TAG = "MyLifecycleOberver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void getLocation() {
        Log.e(TAG, "getLocation: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stopLocation() {
        Log.e(TAG, "stopLocation: ");
    }
}
