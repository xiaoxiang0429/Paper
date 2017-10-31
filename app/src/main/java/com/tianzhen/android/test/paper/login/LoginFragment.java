package com.tianzhen.android.test.paper.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class LoginFragment extends Fragment implements LoginContract.View {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showToast(String title) {
    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }
}
