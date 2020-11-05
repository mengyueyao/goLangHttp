package com.followers.golanghttputil.bean;

import java.util.List;

public class FollowersVipList {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"price":300,"expiry_day":30,"package_name":"boost.instagram.trend.followers","created_at":"2020-11-05T14:19:57+08:00","update_at":"2020-11-05T14:19:57+08:00"},{"id":2,"price":700,"expiry_day":90,"package_name":"boost.instagram.trend.followers","created_at":"2020-11-05T14:19:57+08:00","update_at":"2020-11-05T14:19:57+08:00"},{"id":3,"price":1800,"expiry_day":365,"package_name":"boost.instagram.trend.followers","created_at":"2020-11-05T14:19:57+08:00","update_at":"2020-11-05T14:19:57+08:00"}]
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
         * id : 1
         * price : 300
         * expiry_day : 30
         * package_name : boost.instagram.trend.followers
         * created_at : 2020-11-05T14:19:57+08:00
         * update_at : 2020-11-05T14:19:57+08:00
         */

        private int id;
        private String price;
        private String expiry_day;
        private String package_name;
        private String created_at;
        private String update_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getExpiry_day() {
            return expiry_day;
        }

        public void setExpiry_day(String expiry_day) {
            this.expiry_day = expiry_day;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdate_at() {
            return update_at;
        }

        public void setUpdate_at(String update_at) {
            this.update_at = update_at;
        }
    }
}
