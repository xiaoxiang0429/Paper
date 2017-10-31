package com.tianzhen.android.test.paper.regist;

import com.tianzhen.android.test.paper.BasePresenter;
import com.tianzhen.android.test.paper.BaseView;

/**
 * Created by Administrator on 2017/9/11 0011.
 */

public class RegistContract {
    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter{
        void getCode(String phone);
        void doRegist(String phone,String password,String code);
    }
}
