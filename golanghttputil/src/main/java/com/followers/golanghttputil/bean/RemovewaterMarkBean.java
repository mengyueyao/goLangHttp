package com.followers.golanghttputil.bean;

public class RemovewaterMarkBean {


    /**
     * code : 200
     * message : 视频解析成功
     * data : https://api-h2.tiktokv.com/aweme/v1/playwm/?video_id=v07025490000brhlm9go6l4qhp22um80
     * status : true
     */

    private int code;
    private String message;
    private String data;
    private boolean status;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
