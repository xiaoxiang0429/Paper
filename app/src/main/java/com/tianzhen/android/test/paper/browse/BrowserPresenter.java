package com.tianzhen.android.test.paper.browse;

import com.tianzhen.android.test.paper.entity.BrowseBean;
import com.tianzhen.android.test.paper.net.Network;
import com.tianzhen.android.test.paper.util.DataUtils;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class BrowserPresenter implements BrowseContract.Presenter {
    private BrowseContract.View browseView;

    public BrowserPresenter(BrowseContract.View browseView){
        this.browseView = browseView;
        browseView.setPresenter(this);
    }

    @Override
    public void getProList(int page,String proName) {
        Map DATA = new HashMap();
        DATA.put("SIZE","10");
        DATA.put("PAGE",page);
        DATA.put("QTSPRODUCTNAME",proName);
        Call<BrowseBean> call = Network.InstanceNetwork().getmRetrofit().create(BrowsePost.class).getResult(DataUtils.getPostBody("productService_productNewList",DATA));
        call.enqueue(new Callback<BrowseBean>() {
            @Override
            public void onResponse(Call<BrowseBean> call, Response<BrowseBean> response) {
                BrowseBean browseBean = new BrowseBean();
                browseBean = response.body();
                if (browseBean.getRESULT()==1){
                    browseView.showRecyclerView(browseBean.getDATA().getDATALIST());
                }else{
                    browseView.showToast("请求失败");
                }
            }

            @Override
            public void onFailure(Call<BrowseBean> call, Throwable t) {

            }
        });

    }

    @Override
    public void start() {

    }

}
