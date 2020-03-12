package com.followers.golanghttputil.bean;

import java.util.List;

public class CustomCategoryBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Id":1,"UserPk":"12345678","Title":"Test","CreatedAt":"2020-03-10T18:58:00+08:00"}]
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
         * UserPk : 12345678
         * Title : Test
         * CreatedAt : 2020-03-10T18:58:00+08:00
         */

        private int Id;
        private String UserPk;
        private String Title;
        private String CreatedAt;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getUserPk() {
            return UserPk;
        }

        public void setUserPk(String UserPk) {
            this.UserPk = UserPk;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getCreatedAt() {
            return CreatedAt;
        }

        public void setCreatedAt(String CreatedAt) {
            this.CreatedAt = CreatedAt;
        }
    }
}

