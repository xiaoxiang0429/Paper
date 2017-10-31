package com.tianzhen.android.test.paper.util;

/**
 * Created by Administrator on 2017/9/11 0011.
 */

public class StringUtils {

    public static boolean isNull(String str){
        boolean isnull = false;
        if (str.equals("") || str.equals("null") || null == str){
            isnull = true;
        }else{
            isnull = false;
        }
        return isnull;
    }
}
