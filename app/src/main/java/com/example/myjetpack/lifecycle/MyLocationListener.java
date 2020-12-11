package com.example.myjetpack.lifecycle;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @author SuTs
 * @create 2020/12/11 16:23
 * @Describe
 */
public class MyLocationListener implements LifecycleObserver {
    private static final String TAG = "MyLocationListener";

    public MyLocationListener(Context context, OnLocationChangedListener locationChangedListener) {
        //初始化位置服务
    }

    //注册在acitivty中，当activity执行o'nResume时自动调用这个方法
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void startGetLocation() {
        Log.e(TAG, "startGetLocation: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void stopGetLocation() {
        Log.e(TAG, "stopGetLocation: ");
    }

    public interface OnLocationChangedListener {
        void onLocatinChaged(int latitude, int longitude);
    }
}
