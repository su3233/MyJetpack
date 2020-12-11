package com.example.myjetpack.lifecycle;

import android.content.Intent;
import android.view.View;

import com.example.myjetpack.BaseActivity;
import com.example.myjetpack.R;

/**
 * activity默认已经实现了LifecycleOwnew（被观察者），内部有一个getLifecycle方法接收一个LifecycleObserver（观察者）
 * Fragment同样也是
 */
public class LifeCycleActivity extends BaseActivity {

    private MyLocationListener myLocationListener;

    @Override
    protected int getLayout() {
        return R.layout.activity_life_cycle;
    }

    @Override
    protected void initView() {
        myLocationListener = new MyLocationListener(this, new MyLocationListener.OnLocationChangedListener() {
            @Override
            public void onLocatinChaged(int latitude, int longitude) {

            }
        });
        //将注册的监听器与activity进行绑定，观察者模式
        getLifecycle().addObserver(myLocationListener);

        findViewById(R.id.bt_start_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, MyLifeService.class);
                startService(intent);
            }
        });

        findViewById(R.id.bt_stop_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LifeCycleActivity.this, MyLifeService.class);
                stopService(intent);
            }
        });
    }

}