package com.tianzhen.android.test.paper.login;

import android.content.Context;

import com.tianzhen.android.test.paper.BasePresenter;
import com.tianzhen.android.test.paper.BaseView;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter>{
        void showProgress();
        void hideProgress();


    }

    interface Presenter extends BasePresenter{
        void doLogin(String userName,String passWord);
    }
}
