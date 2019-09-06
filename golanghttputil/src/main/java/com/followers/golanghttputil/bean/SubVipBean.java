package com.followers.golanghttputil.bean;

public class SubVipBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=EC-4G801011NT533883F
     */

    private int code;
    private String message;
    private boolean status;
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
