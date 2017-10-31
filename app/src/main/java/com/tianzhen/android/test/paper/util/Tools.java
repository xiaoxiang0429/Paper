package com.tianzhen.android.test.paper.util;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/9/13 0013.
 */

public class Tools {
    public static void showLog(String content){
        Log.i("tianzhentest",content);
    }

    public  static void showToast(Context context,String title){
        Toast.makeText(context,title,Toast.LENGTH_LONG).show();
    }
}
