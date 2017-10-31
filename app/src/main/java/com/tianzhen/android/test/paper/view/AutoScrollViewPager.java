package com.tianzhen.android.test.paper.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.tianzhen.android.test.paper.R;

import static android.view.Gravity.CENTER;

/**
 * Created by Administrator on 2017/9/22 0022.
 */

public class AutoScrollViewPager extends RelativeLayout {
    private AutoViewPager mViewPager;

    private Context mContext;

    private LinearLayout layout;

    public AutoScrollViewPager(Context context) {
        super(context);
        init(context);
    }

    public AutoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        mViewPager = new AutoViewPager(context);
        layout = new LinearLayout(mContext);
        addView(mViewPager);
    }

    public void setAdapter(BaseViewPagerAdapter adapter) {
        if (mViewPager != null) {
            mViewPager.init(mViewPager, adapter);
        }
    }

    public AutoViewPager getViewPager() {
        return mViewPager;
    }

    public void initPointView(int size) {

        layout = new LinearLayout(mContext);
        for (int i = 0; i < size; i++) {
            ImageView imageView = new ImageView(mContext);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(15, 15);
            params.leftMargin = 8;
            params.gravity = CENTER;
            imageView.setLayoutParams(params);
            if (i == 0) {
                imageView.setBackgroundResource(R.drawable.img_focus);
            } else {
                imageView.setBackgroundResource(R.drawable.img_unfocus);
            }

            layout.addView(imageView);
        }

        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(ALIGN_PARENT_RIGHT);
        layoutParams.setMargins(12, 20, 12, 20);
        layout.setLayoutParams(layoutParams);
        addView(layout);
    }


    public void updatePointView(int position) {
        int size = layout.getChildCount();
        for (int i = 0; i < size; i++) {
            ImageView imageView = (ImageView) layout.getChildAt(i);
            if (i == position) {
                imageView.setBackgroundResource(R.drawable.img_focus);
            } else {
                imageView.setBackgroundResource(R.drawable.img_unfocus);
            }

        }
    }

    public void onDestroy() {
        if (mViewPager != null) {
            mViewPager.onDestroy();
        }
    }

}
