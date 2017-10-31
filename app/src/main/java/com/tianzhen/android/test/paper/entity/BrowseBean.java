package com.tianzhen.android.test.paper.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class BrowseBean {

    /**
     * CMD : productService_productNewList
     * RESULT : 1
     * DATA : {"DATALIST":[{"QTSTRADENAME":"机械包装","QTSTRADEKEYWORD":"zpbzhcyc","QTSAPPUSERNAME":"用户036568","QTSAPPMEMBERDEF1":"D5C7EB7B43634291B802CD092A916EF7","QTNAPPMEMBERDEF2":1,"QTSAPPUSERPHONE":"15933221300","QTSAPPMEMBERDEF7":"河北保定市帅然包装机械制造有限公司","QTSCATEGORYNAME":"封口机","QTSPRODUCTID":"000000005c675052015c72dd076908dc","QTNAPPUSERTYPE":1,"QTSPRODUCTNAME":"电脑叉角封口机","QTNPRODUCTTYPE":1,"QTSTRADEID":"4028088156ba6b770156ba6e59ac0012","QTSCATEGORYID":"000000005a5efbe8015a5f5882710216","QTSPRODUCTBRAND":"帅然","QTSPRODUCTSPEC":"830K","QTDPRODUCTNUMBER":3500,"QTSPRODUCTCONTACTS":"陈经理","QTSPRODUCTCONTACTMOBILE":"15933221300","QTSPRODUCTIMG1":"E0840F4C6A8B47C995ADFB00D05C4EE2","QTSPRODUCTIMG2":"2CCA410D2CB94AE096B88915B6CB385B","QTSPRODUCTIMG3":"1BB819C13A5D426B89D128DFEE944BEE","QTSPRODUCTINFO":"六缸电脑版控制，双变压器，手摇升降拖纸升降板，叉角封口一次完成，8毫米封口花纹宽度，配带打码功能，封口效果牢固美观，军工品质，专利产品！","QTSSTARTAREACODE":null,"QTSSTARTAREANAME":null,"QTSENDAREACODE":null,"QTSENDAREANAME":null,"QTNPRODUCTFAMOUS":0,"QTNPRODUCTORDER":2,"QTNPRODUCTSTATUS":1,"QTSAPPUSERID":"000000005bfb88d0015c3edf66572c06","QTSADDUSERID":null,"QTDPRODUCTADDTIME":1496575706000,"QTSDELETEUSERID":null,"QTDPRODUCTDELETETIME":null,"QTSUPDATEUSERID":null,"QTDUPDATETIME":1496575706000,"QTNPRICETREND":0,"QTNPRODUCTFAMOUSORDER":6,"QTNMEMBERPRODUCTTYPE":1,"QTSPRODUCTIMGPT1":null,"QTSPRODUCTIMGPT2":null,"QTSPRODUCTIMGPT3":null,"QTSPRODUCTIMGPT4":null,"QTNPRODUCTRO":448}]}
     */

    private String CMD;
    private int RESULT;
    private DATABean DATA;

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

    public DATABean getDATA() {
        return DATA;
    }

    public void setDATA(DATABean DATA) {
        this.DATA = DATA;
    }

    public static class DATABean {
        private List<DATALISTBean> DATALIST;

        public List<DATALISTBean> getDATALIST() {
            return DATALIST;
        }

        public void setDATALIST(List<DATALISTBean> DATALIST) {
            this.DATALIST = DATALIST;
        }

        public static class DATALISTBean {
            /**
             * QTSTRADENAME : 机械包装
             * QTSTRADEKEYWORD : zpbzhcyc
             * QTSAPPUSERNAME : 用户036568
             * QTSAPPMEMBERDEF1 : D5C7EB7B43634291B802CD092A916EF7
             * QTNAPPMEMBERDEF2 : 1
             * QTSAPPUSERPHONE : 15933221300
             * QTSAPPMEMBERDEF7 : 河北保定市帅然包装机械制造有限公司
             * QTSCATEGORYNAME : 封口机
             * QTSPRODUCTID : 000000005c675052015c72dd076908dc
             * QTNAPPUSERTYPE : 1
             * QTSPRODUCTNAME : 电脑叉角封口机
             * QTNPRODUCTTYPE : 1
             * QTSTRADEID : 4028088156ba6b770156ba6e59ac0012
             * QTSCATEGORYID : 000000005a5efbe8015a5f5882710216
             * QTSPRODUCTBRAND : 帅然
             * QTSPRODUCTSPEC : 830K
             * QTDPRODUCTNUMBER : 3500.0
             * QTSPRODUCTCONTACTS : 陈经理
             * QTSPRODUCTCONTACTMOBILE : 15933221300
             * QTSPRODUCTIMG1 : E0840F4C6A8B47C995ADFB00D05C4EE2
             * QTSPRODUCTIMG2 : 2CCA410D2CB94AE096B88915B6CB385B
             * QTSPRODUCTIMG3 : 1BB819C13A5D426B89D128DFEE944BEE
             * QTSPRODUCTINFO : 六缸电脑版控制，双变压器，手摇升降拖纸升降板，叉角封口一次完成，8毫米封口花纹宽度，配带打码功能，封口效果牢固美观，军工品质，专利产品！
             * QTSSTARTAREACODE : null
             * QTSSTARTAREANAME : null
             * QTSENDAREACODE : null
             * QTSENDAREANAME : null
             * QTNPRODUCTFAMOUS : 0
             * QTNPRODUCTORDER : 2
             * QTNPRODUCTSTATUS : 1
             * QTSAPPUSERID : 000000005bfb88d0015c3edf66572c06
             * QTSADDUSERID : null
             * QTDPRODUCTADDTIME : 1496575706000
             * QTSDELETEUSERID : null
             * QTDPRODUCTDELETETIME : null
             * QTSUPDATEUSERID : null
             * QTDUPDATETIME : 1496575706000
             * QTNPRICETREND : 0
             * QTNPRODUCTFAMOUSORDER : 6
             * QTNMEMBERPRODUCTTYPE : 1
             * QTSPRODUCTIMGPT1 : null
             * QTSPRODUCTIMGPT2 : null
             * QTSPRODUCTIMGPT3 : null
             * QTSPRODUCTIMGPT4 : null
             * QTNPRODUCTRO : 448
             */

            private String QTSTRADENAME;
            private String QTSTRADEKEYWORD;
            private String QTSAPPUSERNAME;
            private String QTSAPPMEMBERDEF1;
            private int QTNAPPMEMBERDEF2;
            private String QTSAPPUSERPHONE;
            private String QTSAPPMEMBERDEF7;
            private String QTSCATEGORYNAME;
            private String QTSPRODUCTID;
            private int QTNAPPUSERTYPE;
            private String QTSPRODUCTNAME;
            private int QTNPRODUCTTYPE;
            private String QTSTRADEID;
            private String QTSCATEGORYID;
            private String QTSPRODUCTBRAND;
            private String QTSPRODUCTSPEC;
            private double QTDPRODUCTNUMBER;
            private String QTSPRODUCTCONTACTS;
            private String QTSPRODUCTCONTACTMOBILE;
            private String QTSPRODUCTIMG1;
            private String QTSPRODUCTIMG2;
            private String QTSPRODUCTIMG3;
            private String QTSPRODUCTINFO;
            private Object QTSSTARTAREACODE;
            private Object QTSSTARTAREANAME;
            private Object QTSENDAREACODE;
            private Object QTSENDAREANAME;
            private int QTNPRODUCTFAMOUS;
            private int QTNPRODUCTORDER;
            private int QTNPRODUCTSTATUS;
            private String QTSAPPUSERID;
            private Object QTSADDUSERID;
            private long QTDPRODUCTADDTIME;
            private Object QTSDELETEUSERID;
            private Object QTDPRODUCTDELETETIME;
            private Object QTSUPDATEUSERID;
            private long QTDUPDATETIME;
            private int QTNPRICETREND;
            private int QTNPRODUCTFAMOUSORDER;
            private int QTNMEMBERPRODUCTTYPE;
            private Object QTSPRODUCTIMGPT1;
            private Object QTSPRODUCTIMGPT2;
            private Object QTSPRODUCTIMGPT3;
            private Object QTSPRODUCTIMGPT4;
            private int QTNPRODUCTRO;

            public String getQTSTRADENAME() {
                return QTSTRADENAME;
            }

            public void setQTSTRADENAME(String QTSTRADENAME) {
                this.QTSTRADENAME = QTSTRADENAME;
            }

            public String getQTSTRADEKEYWORD() {
                return QTSTRADEKEYWORD;
            }

            public void setQTSTRADEKEYWORD(String QTSTRADEKEYWORD) {
                this.QTSTRADEKEYWORD = QTSTRADEKEYWORD;
            }

            public String getQTSAPPUSERNAME() {
                return QTSAPPUSERNAME;
            }

            public void setQTSAPPUSERNAME(String QTSAPPUSERNAME) {
                this.QTSAPPUSERNAME = QTSAPPUSERNAME;
            }

            public String getQTSAPPMEMBERDEF1() {
                return QTSAPPMEMBERDEF1;
            }

            public void setQTSAPPMEMBERDEF1(String QTSAPPMEMBERDEF1) {
                this.QTSAPPMEMBERDEF1 = QTSAPPMEMBERDEF1;
            }

            public int getQTNAPPMEMBERDEF2() {
                return QTNAPPMEMBERDEF2;
            }

            public void setQTNAPPMEMBERDEF2(int QTNAPPMEMBERDEF2) {
                this.QTNAPPMEMBERDEF2 = QTNAPPMEMBERDEF2;
            }

            public String getQTSAPPUSERPHONE() {
                return QTSAPPUSERPHONE;
            }

            public void setQTSAPPUSERPHONE(String QTSAPPUSERPHONE) {
                this.QTSAPPUSERPHONE = QTSAPPUSERPHONE;
            }

            public String getQTSAPPMEMBERDEF7() {
                return QTSAPPMEMBERDEF7;
            }

            public void setQTSAPPMEMBERDEF7(String QTSAPPMEMBERDEF7) {
                this.QTSAPPMEMBERDEF7 = QTSAPPMEMBERDEF7;
            }

            public String getQTSCATEGORYNAME() {
                return QTSCATEGORYNAME;
            }

            public void setQTSCATEGORYNAME(String QTSCATEGORYNAME) {
                this.QTSCATEGORYNAME = QTSCATEGORYNAME;
            }

            public String getQTSPRODUCTID() {
                return QTSPRODUCTID;
            }

            public void setQTSPRODUCTID(String QTSPRODUCTID) {
                this.QTSPRODUCTID = QTSPRODUCTID;
            }

            public int getQTNAPPUSERTYPE() {
                return QTNAPPUSERTYPE;
            }

            public void setQTNAPPUSERTYPE(int QTNAPPUSERTYPE) {
                this.QTNAPPUSERTYPE = QTNAPPUSERTYPE;
            }

            public String getQTSPRODUCTNAME() {
                return QTSPRODUCTNAME;
            }

            public void setQTSPRODUCTNAME(String QTSPRODUCTNAME) {
                this.QTSPRODUCTNAME = QTSPRODUCTNAME;
            }

            public int getQTNPRODUCTTYPE() {
                return QTNPRODUCTTYPE;
            }

            public void setQTNPRODUCTTYPE(int QTNPRODUCTTYPE) {
                this.QTNPRODUCTTYPE = QTNPRODUCTTYPE;
            }

            public String getQTSTRADEID() {
                return QTSTRADEID;
            }

            public void setQTSTRADEID(String QTSTRADEID) {
                this.QTSTRADEID = QTSTRADEID;
            }

            public String getQTSCATEGORYID() {
                return QTSCATEGORYID;
            }

            public void setQTSCATEGORYID(String QTSCATEGORYID) {
                this.QTSCATEGORYID = QTSCATEGORYID;
            }

            public String getQTSPRODUCTBRAND() {
                return QTSPRODUCTBRAND;
            }

            public void setQTSPRODUCTBRAND(String QTSPRODUCTBRAND) {
                this.QTSPRODUCTBRAND = QTSPRODUCTBRAND;
            }

            public String getQTSPRODUCTSPEC() {
                return QTSPRODUCTSPEC;
            }

            public void setQTSPRODUCTSPEC(String QTSPRODUCTSPEC) {
                this.QTSPRODUCTSPEC = QTSPRODUCTSPEC;
            }

            public double getQTDPRODUCTNUMBER() {
                return QTDPRODUCTNUMBER;
            }

            public void setQTDPRODUCTNUMBER(double QTDPRODUCTNUMBER) {
                this.QTDPRODUCTNUMBER = QTDPRODUCTNUMBER;
            }

            public String getQTSPRODUCTCONTACTS() {
                return QTSPRODUCTCONTACTS;
            }

            public void setQTSPRODUCTCONTACTS(String QTSPRODUCTCONTACTS) {
                this.QTSPRODUCTCONTACTS = QTSPRODUCTCONTACTS;
            }

            public String getQTSPRODUCTCONTACTMOBILE() {
                return QTSPRODUCTCONTACTMOBILE;
            }

            public void setQTSPRODUCTCONTACTMOBILE(String QTSPRODUCTCONTACTMOBILE) {
                this.QTSPRODUCTCONTACTMOBILE = QTSPRODUCTCONTACTMOBILE;
            }

            public String getQTSPRODUCTIMG1() {
                return QTSPRODUCTIMG1;
            }

            public void setQTSPRODUCTIMG1(String QTSPRODUCTIMG1) {
                this.QTSPRODUCTIMG1 = QTSPRODUCTIMG1;
            }

            public String getQTSPRODUCTIMG2() {
                return QTSPRODUCTIMG2;
            }

            public void setQTSPRODUCTIMG2(String QTSPRODUCTIMG2) {
                this.QTSPRODUCTIMG2 = QTSPRODUCTIMG2;
            }

            public String getQTSPRODUCTIMG3() {
                return QTSPRODUCTIMG3;
            }

            public void setQTSPRODUCTIMG3(String QTSPRODUCTIMG3) {
                this.QTSPRODUCTIMG3 = QTSPRODUCTIMG3;
            }

            public String getQTSPRODUCTINFO() {
                return QTSPRODUCTINFO;
            }

            public void setQTSPRODUCTINFO(String QTSPRODUCTINFO) {
                this.QTSPRODUCTINFO = QTSPRODUCTINFO;
            }

            public Object getQTSSTARTAREACODE() {
                return QTSSTARTAREACODE;
            }

            public void setQTSSTARTAREACODE(Object QTSSTARTAREACODE) {
                this.QTSSTARTAREACODE = QTSSTARTAREACODE;
            }

            public Object getQTSSTARTAREANAME() {
                return QTSSTARTAREANAME;
            }

            public void setQTSSTARTAREANAME(Object QTSSTARTAREANAME) {
                this.QTSSTARTAREANAME = QTSSTARTAREANAME;
            }

            public Object getQTSENDAREACODE() {
                return QTSENDAREACODE;
            }

            public void setQTSENDAREACODE(Object QTSENDAREACODE) {
                this.QTSENDAREACODE = QTSENDAREACODE;
            }

            public Object getQTSENDAREANAME() {
                return QTSENDAREANAME;
            }

            public void setQTSENDAREANAME(Object QTSENDAREANAME) {
                this.QTSENDAREANAME = QTSENDAREANAME;
            }

            public int getQTNPRODUCTFAMOUS() {
                return QTNPRODUCTFAMOUS;
            }

            public void setQTNPRODUCTFAMOUS(int QTNPRODUCTFAMOUS) {
                this.QTNPRODUCTFAMOUS = QTNPRODUCTFAMOUS;
            }

            public int getQTNPRODUCTORDER() {
                return QTNPRODUCTORDER;
            }

            public void setQTNPRODUCTORDER(int QTNPRODUCTORDER) {
                this.QTNPRODUCTORDER = QTNPRODUCTORDER;
            }

            public int getQTNPRODUCTSTATUS() {
                return QTNPRODUCTSTATUS;
            }

            public void setQTNPRODUCTSTATUS(int QTNPRODUCTSTATUS) {
                this.QTNPRODUCTSTATUS = QTNPRODUCTSTATUS;
            }

            public String getQTSAPPUSERID() {
                return QTSAPPUSERID;
            }

            public void setQTSAPPUSERID(String QTSAPPUSERID) {
                this.QTSAPPUSERID = QTSAPPUSERID;
            }

            public Object getQTSADDUSERID() {
                return QTSADDUSERID;
            }

            public void setQTSADDUSERID(Object QTSADDUSERID) {
                this.QTSADDUSERID = QTSADDUSERID;
            }

            public long getQTDPRODUCTADDTIME() {
                return QTDPRODUCTADDTIME;
            }

            public void setQTDPRODUCTADDTIME(long QTDPRODUCTADDTIME) {
                this.QTDPRODUCTADDTIME = QTDPRODUCTADDTIME;
            }

            public Object getQTSDELETEUSERID() {
                return QTSDELETEUSERID;
            }

            public void setQTSDELETEUSERID(Object QTSDELETEUSERID) {
                this.QTSDELETEUSERID = QTSDELETEUSERID;
            }

            public Object getQTDPRODUCTDELETETIME() {
                return QTDPRODUCTDELETETIME;
            }

            public void setQTDPRODUCTDELETETIME(Object QTDPRODUCTDELETETIME) {
                this.QTDPRODUCTDELETETIME = QTDPRODUCTDELETETIME;
            }

            public Object getQTSUPDATEUSERID() {
                return QTSUPDATEUSERID;
            }

            public void setQTSUPDATEUSERID(Object QTSUPDATEUSERID) {
                this.QTSUPDATEUSERID = QTSUPDATEUSERID;
            }

            public long getQTDUPDATETIME() {
                return QTDUPDATETIME;
            }

            public void setQTDUPDATETIME(long QTDUPDATETIME) {
                this.QTDUPDATETIME = QTDUPDATETIME;
            }

            public int getQTNPRICETREND() {
                return QTNPRICETREND;
            }

            public void setQTNPRICETREND(int QTNPRICETREND) {
                this.QTNPRICETREND = QTNPRICETREND;
            }

            public int getQTNPRODUCTFAMOUSORDER() {
                return QTNPRODUCTFAMOUSORDER;
            }

            public void setQTNPRODUCTFAMOUSORDER(int QTNPRODUCTFAMOUSORDER) {
                this.QTNPRODUCTFAMOUSORDER = QTNPRODUCTFAMOUSORDER;
            }

            public int getQTNMEMBERPRODUCTTYPE() {
                return QTNMEMBERPRODUCTTYPE;
            }

            public void setQTNMEMBERPRODUCTTYPE(int QTNMEMBERPRODUCTTYPE) {
                this.QTNMEMBERPRODUCTTYPE = QTNMEMBERPRODUCTTYPE;
            }

            public Object getQTSPRODUCTIMGPT1() {
                return QTSPRODUCTIMGPT1;
            }

            public void setQTSPRODUCTIMGPT1(Object QTSPRODUCTIMGPT1) {
                this.QTSPRODUCTIMGPT1 = QTSPRODUCTIMGPT1;
            }

            public Object getQTSPRODUCTIMGPT2() {
                return QTSPRODUCTIMGPT2;
            }

            public void setQTSPRODUCTIMGPT2(Object QTSPRODUCTIMGPT2) {
                this.QTSPRODUCTIMGPT2 = QTSPRODUCTIMGPT2;
            }

            public Object getQTSPRODUCTIMGPT3() {
                return QTSPRODUCTIMGPT3;
            }

            public void setQTSPRODUCTIMGPT3(Object QTSPRODUCTIMGPT3) {
                this.QTSPRODUCTIMGPT3 = QTSPRODUCTIMGPT3;
            }

            public Object getQTSPRODUCTIMGPT4() {
                return QTSPRODUCTIMGPT4;
            }

            public void setQTSPRODUCTIMGPT4(Object QTSPRODUCTIMGPT4) {
                this.QTSPRODUCTIMGPT4 = QTSPRODUCTIMGPT4;
            }

            public int getQTNPRODUCTRO() {
                return QTNPRODUCTRO;
            }

            public void setQTNPRODUCTRO(int QTNPRODUCTRO) {
                this.QTNPRODUCTRO = QTNPRODUCTRO;
            }
        }
    }
}
