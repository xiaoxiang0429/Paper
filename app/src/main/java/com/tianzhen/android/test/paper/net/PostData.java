package com.tianzhen.android.test.paper.net;

import com.tianzhen.android.test.paper.entity.HomeBean;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public interface PostData {
    @POST("paper/web/main/qhAppService.xhtml")
    Call<ResponseBody> getResult(@Body RequestBody body);

    interface HomeData{
        @POST("paper/web/main/qhAppService.xhtml")
        Call<HomeBean> getResult(@Body RequestBody body);
    }

}
