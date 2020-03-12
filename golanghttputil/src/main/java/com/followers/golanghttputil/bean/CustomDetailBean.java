package com.followers.golanghttputil.bean;

import java.util.List;

public class CustomDetailBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Id":1,"CategoryId":1,"UserPk":"12345678","Detail":"this  test detail","CreatedAt":"2020-03-11T14:57:47+08:00"}]
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
         * CategoryId : 1
         * UserPk : 12345678
         * Detail : this  test detail
         * CreatedAt : 2020-03-11T14:57:47+08:00
         */

        private int Id;
        private int CategoryId;
        private String UserPk;
        private String Detail;
        private String CreatedAt;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public int getCategoryId() {
            return CategoryId;
        }

        public void setCategoryId(int CategoryId) {
            this.CategoryId = CategoryId;
        }

        public String getUserPk() {
            return UserPk;
        }

        public void setUserPk(String UserPk) {
            this.UserPk = UserPk;
        }

        public String getDetail() {
            return Detail;
        }

        public void setDetail(String Detail) {
            this.Detail = Detail;
        }

        public String getCreatedAt() {
            return CreatedAt;
        }

        public void setCreatedAt(String CreatedAt) {
            this.CreatedAt = CreatedAt;
        }
    }
}
