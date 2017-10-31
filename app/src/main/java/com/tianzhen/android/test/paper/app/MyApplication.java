package com.tianzhen.android.test.paper.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getMyContext(){
        return context;
    }
}
