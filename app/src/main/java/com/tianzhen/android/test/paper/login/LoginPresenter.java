package com.tianzhen.android.test.paper.login;

import android.util.Log;

import com.tianzhen.android.test.paper.net.Network;
import com.tianzhen.android.test.paper.net.PostData;
import com.tianzhen.android.test.paper.util.DataUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View loginView;
    private Network network;
    private PostData postData;


    public LoginPresenter(LoginContract.View loginView){
        this.loginView = loginView;
        loginView.setPresenter(this);
        network = new Network();
    }

    @Override
    public void doLogin(String userName, String passWord) {
        loginView.showProgress();
        if (userName==null){
            loginView.showToast("用户名不能为空");
            return;
        }else if (passWord == null){
            loginView.showToast("密码不能为空");
            return;
        }else{
            Map DATA = new HashMap();
            DATA.put("QTSAPPUSERPHONE",userName);
            DATA.put("QTSAPPUSERPWD",passWord);
            DATA.put("QTSMESSAGEID","6N1/ky03eQ1ixc3dMulsKMWrcpRQpAQUrmNkfibiF5E=");
            Call<ResponseBody> call = network.InstanceNetwork().getmRetrofit().create(PostData.class).getResult(DataUtils.getPostBody("appMemberService_userLogin"/*"versionService_getNowVersion"*/,DATA));
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
                    loginView.showResult(result);
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e("tvlogin","onFailure"+t.toString());

                }
            });

        }

    }


    @Override
    public void start() {

    }
}
