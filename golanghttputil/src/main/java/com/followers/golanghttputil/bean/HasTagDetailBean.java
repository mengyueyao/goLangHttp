package com.followers.golanghttputil.bean;

import java.util.List;

public class HasTagDetailBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Img":"https://cdn.stocksnap.io/img-thumbs/960w/PONWAT2C3P.jpg","Tags":"cat,black cat,pet,chair,"}]
     */

    private int code;
    private String message;
    private boolean status;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * Img : https://cdn.stocksnap.io/img-thumbs/960w/PONWAT2C3P.jpg
         * Tags : cat,black cat,pet,chair,
         */

        private String Img;
        private String Tags;

        public String getImg() {
            return Img;
        }

        public void setImg(String Img) {
            this.Img = Img;
        }

        public String getTags() {
            return Tags;
        }

        public void setTags(String Tags) {
            this.Tags = Tags;
        }
    }
}
