package com.example.myjetpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myjetpack.lifecycle.LifeCycleActivity;
import com.example.myjetpack.navigation.NavigationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.bt_life_cycle).setOnClickListener(this);
        findViewById(R.id.bt_navigation).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_life_cycle:
                startActivity(new Intent(MainActivity.this, LifeCycleActivity.class));
                break;
            //bt_navigation
            //NavigationActivity
            case R.id.bt_navigation:
                startActivity(new Intent(MainActivity.this, NavigationActivity.class));
                break;
        }
    }
}