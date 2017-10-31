package com.tianzhen.android.test.paper.util;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class DataUtils {

    public static RequestBody getPostBody(String CMD, Map DATA) {
        Map postMap = new HashMap();

        DATA.put("OS", "1");
        postMap.put("CMD", CMD);
        postMap.put("DATA", DATA);
        postMap.put("DEVICE", getDeviceMap());
        postMap.put("TOKEN", "");
        String jsonBody = new Gson().toJson(postMap);
        RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), jsonBody);
        return body;
    }

    private static Map getDeviceMap() {
        Map DEVICE = new HashMap();
        DEVICE.put("QTSLASTOS", "");
        DEVICE.put("QTSLASTVERSION", "Android");
        DEVICE.put("QTSLASTPHONE", android.os.Build.MANUFACTURER + " " + android.os.Build.PRODUCT + " " +
                android.os.Build.DISPLAY + " VERSION:" + android.os.Build.VERSION.RELEASE + ",SDK:" + android.os.Build.VERSION.SDK_INT);
        return DEVICE;
    }

    public static Map getNullMap(){
        return new HashMap();
    }


}
