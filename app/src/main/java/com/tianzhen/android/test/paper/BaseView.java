package com.tianzhen.android.test.paper;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
    void showToast(String title);
    void showResult(String result);
}
