package com.followers.golanghttputil.bean;

public class RewardBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : 0
     */

    private int code;
    private String message;
    private boolean status;
    private int data;

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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
