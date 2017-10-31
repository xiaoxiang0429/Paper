package com.tianzhen.android.test.paper.regist;

import android.util.Log;

import com.tianzhen.android.test.paper.net.Network;
import com.tianzhen.android.test.paper.net.PostData;
import com.tianzhen.android.test.paper.util.DataUtils;
import com.tianzhen.android.test.paper.util.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/9/11 0011.
 */

public class RegistPresenter implements RegistContract.Presenter {
    private RegistContract.View registView;
    private Network network;

    public RegistPresenter(RegistContract.View registView) {
        this.registView = registView;
        network = new Network();
    }

    @Override
    public void getCode(String phone) {
        if (StringUtils.isNull(phone)){
            registView.showToast("手机号不能为空");
        }else{
            Map DATA = new HashMap();
            DATA.put("QTSPHONE",phone);
            DATA.put("TYPE","REGISTRY");
            Call<ResponseBody> call = network.InstanceNetwork().getmRetrofit().create(PostData.class).getResult(DataUtils.getPostBody("appMemberService_sendVerifyCode"/*"versionService_getNowVersion"*/,DATA));
            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    String result = null;
                    try {
                        result = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Log.e("tvlogin","return result=="+result);
                    registView.showResult(result);
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e("tvlogin","onFailure"+t.toString());

                }
            });
        }

    }

    @Override
    public void doRegist(String phone, String password, String code) {

    }

    @Override
    public void start() {

    }
}
