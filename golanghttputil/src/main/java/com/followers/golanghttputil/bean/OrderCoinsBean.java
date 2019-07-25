package com.followers.golanghttputil.bean;

import java.util.List;

public class OrderCoinsBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":5,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-25T00:55:14+08:00","update_at":"0001-01-01T00:00:00Z","platform":"1","user_pk":"12345","user_name":"","product_id":1,"token":"","google_order_id":"","pay_status":0,"pay_type":1,"pay_no":"PAYID-LU4I24Y22969660SY7808144","pay_price":0.99,"coin_count":100},{"id":4,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-24T18:21:45+08:00","update_at":"2019-07-24T18:22:34+08:00","platform":"1","user_pk":"12345","user_name":"","product_id":1,"token":"","google_order_id":"","pay_status":1,"pay_type":1,"pay_no":"PAYID-LU4DCOI3HM86529HR973883C","pay_price":0.99,"coin_count":100},{"id":3,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-24T18:11:36+08:00","update_at":"0001-01-01T00:00:00Z","platform":"1","user_pk":"12345","user_name":"","product_id":1,"token":"","google_order_id":"","pay_status":0,"pay_type":1,"pay_no":"1234520190724181136","pay_price":0.99,"coin_count":100},{"id":2,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-24T18:11:05+08:00","update_at":"0001-01-01T00:00:00Z","platform":"1","user_pk":"12345","user_name":"","product_id":1,"token":"","google_order_id":"","pay_status":0,"pay_type":1,"pay_no":"1234520190724181105","pay_price":0.99,"coin_count":100},{"id":1,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-24T17:48:40+08:00","update_at":"0001-01-01T00:00:00Z","platform":"1","user_pk":"12345","user_name":"","product_id":1,"token":"","google_order_id":"","pay_status":0,"pay_type":1,"pay_no":"PAYID-LU4CS6A5225889127215431M","pay_price":0.99,"coin_count":100}]
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
         * id : 5
         * package_name : insta.likes.followers.photo.golangapidemo
         * created_at : 2019-07-25T00:55:14+08:00
         * update_at : 0001-01-01T00:00:00Z
         * platform : 1
         * user_pk : 12345
         * user_name :
         * product_id : 1
         * token :
         * google_order_id :
         * pay_status : 0
         * pay_type : 1
         * pay_no : PAYID-LU4I24Y22969660SY7808144
         * pay_price : 0.99
         * coin_count : 100
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String user_pk;
        private String user_name;
        private int product_id;
        private String token;
        private String google_order_id;
        private int pay_status;
        private int pay_type;
        private String pay_no;
        private double pay_price;
        private int coin_count;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getGoogle_order_id() {
            return google_order_id;
        }

        public void setGoogle_order_id(String google_order_id) {
            this.google_order_id = google_order_id;
        }

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public int getPay_type() {
            return pay_type;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public String getPay_no() {
            return pay_no;
        }

        public void setPay_no(String pay_no) {
            this.pay_no = pay_no;
        }

        public double getPay_price() {
            return pay_price;
        }

        public void setPay_price(double pay_price) {
            this.pay_price = pay_price;
        }

        public int getCoin_count() {
            return coin_count;
        }

        public void setCoin_count(int coin_count) {
            this.coin_count = coin_count;
        }
    }
}
