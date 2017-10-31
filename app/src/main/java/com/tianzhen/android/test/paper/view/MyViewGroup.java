package com.tianzhen.android.test.paper.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.tianzhen.android.test.paper.util.Tools;

/**
 * Created by Administrator on 2017/9/13 0013.
 */

public class MyViewGroup extends LinearLayout {
    public final String TAG = "tianzhentest";
    public MyViewGroup(Context context) {
        super(context);

    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Tools.showLog("MyViewGroup==dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Tools.showLog("MyViewGroup==onTouchEvent");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Tools.showLog("MyViewGroup==onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }
}
