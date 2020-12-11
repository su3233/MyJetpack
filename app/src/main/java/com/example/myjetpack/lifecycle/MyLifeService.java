package com.example.myjetpack.lifecycle;

import androidx.lifecycle.LifecycleService;

/**
 * @author SuTs
 * @create 2020/12/11 17:03
 * @Describe
 */
public class MyLifeService extends LifecycleService {

    private final MyLifecycleOberver lifecycleOberver;

    public MyLifeService() {
        lifecycleOberver = new MyLifecycleOberver();
        getLifecycle().addObserver(lifecycleOberver);
    }
}
