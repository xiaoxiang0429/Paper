package com.tianzhen.android.test.paper.net;

import com.tianzhen.android.test.paper.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class Network {
    private Retrofit mRetrofit;
    private OkHttpClient okHttpClient = null;
    private PostData postData;
    private static Network network;

    public Network() {
        okHttpClient = new OkHttpClient();
        getmRetrofit();
    }

    public static Network InstanceNetwork(){
        network = new Network();
        return network;
    }

    public Retrofit getmRetrofit() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.baseURL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return mRetrofit;
    }

}
