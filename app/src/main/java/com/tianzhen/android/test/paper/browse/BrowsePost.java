package com.tianzhen.android.test.paper.browse;

import com.tianzhen.android.test.paper.entity.BrowseBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public interface BrowsePost  {
    @POST("paper/web/main/qhAppService.xhtml")
    Call<BrowseBean> getResult(@Body RequestBody body);
}
