package com.followers.golanghttputil.bean;

import java.util.List;

public class TagsInfoBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Id":37,"Tag":"animals","Info":"#canongermany #snail #pets_of_instagram #chipmunk #sapo #frog #toad #nature_shooters #florals #defendanimals "}]
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
         * Id : 37
         * Tag : animals
         * Info : #canongermany #snail #pets_of_instagram #chipmunk #sapo #frog #toad #nature_shooters #florals #defendanimals
         */

        private int Id;
        private String Tag;
        private String Info;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getTag() {
            return Tag;
        }

        public void setTag(String Tag) {
            this.Tag = Tag;
        }

        public String getInfo() {
            return Info;
        }

        public void setInfo(String Info) {
            this.Info = Info;
        }
    }
}
