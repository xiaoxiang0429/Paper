package com.tianzhen.android.test.paper.viewtouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.tianzhen.android.test.paper.R;
import com.tianzhen.android.test.paper.view.MyView;
import com.tianzhen.android.test.paper.view.MyViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ViewTouchActivity extends AppCompatActivity {

    @BindView(R.id.my_view)
    MyView myView;
    @BindView(R.id.my_viewgroup)
    RelativeLayout activityViewTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyViewGroup myViewgroup;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_touch);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.my_view, R.id.my_viewgroup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.my_view:

                break;
            case R.id.my_viewgroup:

                break;
        }
    }
}
