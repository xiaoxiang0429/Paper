package com.tianzhen.android.test.paper.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.tianzhen.android.test.paper.util.Tools;

/**
 * Created by Administrator on 2017/9/13 0013.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Tools.showLog("MyView==dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Tools.showLog("MyView==onTouchEvent");
        return super.onTouchEvent(event);
    }
}
