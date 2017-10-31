package com.tianzhen.android.test.paper.home;

import android.util.Log;

import com.tianzhen.android.test.paper.entity.HomeBean;
import com.tianzhen.android.test.paper.net.Network;
import com.tianzhen.android.test.paper.net.PostData;
import com.tianzhen.android.test.paper.util.DataUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View homeView;
    private Network network;
    private HomeBean homeBean;

    public HomePresenter(HomeContract.View homeView){
        this.homeView = homeView;
        homeView.setPresenter(this);

    }

    @Override
    public void getData() {
        homeView.showToast("正在加载首页数据");
        Call<HomeBean> call = Network.InstanceNetwork().getmRetrofit().create(PostData.HomeData.class).getResult(DataUtils.getPostBody("productService_indexData",DataUtils.getNullMap()));
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                homeBean = response.body();
                homeView.loadBanner1(homeBean.getDATA().getFirstImg());
                homeView.loadHeadlines(homeBean.getDATA().getNewsList());
                homeView.loadBanner2(homeBean.getDATA().getSecondImg());
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {
                Log.e("tvlogin","onFailure"+t.toString());

            }
        });

    }

    @Override
    public void start() {

    }
}
