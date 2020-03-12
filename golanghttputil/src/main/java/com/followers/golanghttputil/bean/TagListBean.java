package com.followers.golanghttputil.bean;

import java.util.List;

public class TagListBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Id":1,"Title":"tags","Tag":"popular","Pic":"http://"},{"Id":2,"Title":"tags","Tag":"nature","Pic":"http://"},{"Id":3,"Title":"tags","Tag":"social","Pic":"http://"},{"Id":4,"Title":"tags","Tag":"wather","Pic":"http://"},{"Id":5,"Title":"tags","Tag":"holidays","Pic":"http://"},{"Id":6,"Title":"tags","Tag":"family","Pic":"http://"},{"Id":7,"Title":"tags","Tag":"sports","Pic":"http://"},{"Id":8,"Title":"tags","Tag":"electronics","Pic":"http://"}]
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
         * Id : 1
         * Title : tags
         * Tag : popular
         * Pic : http://
         */

        private int Id;
        private String Title;
        private String Tag;
        private String Pic;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTag() {
            return Tag;
        }

        public void setTag(String Tag) {
            this.Tag = Tag;
        }

        public String getPic() {
            return Pic;
        }

        public void setPic(String Pic) {
            this.Pic = Pic;
        }
    }
}
