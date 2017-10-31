package com.tianzhen.android.test.paper.entity;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class ResultBean {

    /**
     * CMD
     * RESULT : 0
     * ERRORMSG : 错误信息
     */

    private String CMD;
    private int RESULT;
    private String ERRORMSG;
    private String DATA;

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getCMD() {
        return CMD;
    }

    public void setCMD(String CMD) {
        this.CMD = CMD;
    }

    public int getRESULT() {
        return RESULT;
    }

    public void setRESULT(int RESULT) {
        this.RESULT = RESULT;
    }

    public String getERRORMSG() {
        return ERRORMSG;
    }

    public void setERRORMSG(String ERRORMSG) {
        this.ERRORMSG = ERRORMSG;
    }
}
