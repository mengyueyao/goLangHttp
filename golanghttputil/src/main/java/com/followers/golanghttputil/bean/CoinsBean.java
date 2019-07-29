package com.followers.golanghttputil.bean;

import java.io.Serializable;
import java.util.List;

public class CoinsBean implements Serializable {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-24T17:48:26+08:00","update_at":"2019-07-24T17:48:26+08:00","platform":"1","coin_num":100,"price":0.99,"discount":"0","title":"0.99商品","tips":"0.99提示语","enable":"1","google_pay_id":"google_pay0.99","paypal_gift_ratio":3,"enable_paypal":"1","enable_google_pay":"1","enable_apple_pay":"0"}]
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

    public static class DataBean implements Serializable{
        /**
         * id : 1
         * package_name : insta.likes.followers.photo.golangapidemo
         * created_at : 2019-07-24T17:48:26+08:00
         * update_at : 2019-07-24T17:48:26+08:00
         * platform : 1
         * coin_num : 100
         * price : 0.99
         * discount : 0
         * title : 0.99商品
         * tips : 0.99提示语
         * enable : 1
         * google_pay_id : google_pay0.99
         * paypal_gift_ratio : 3
         * enable_paypal : 1
         * enable_google_pay : 1
         * enable_apple_pay : 0
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private int coin_num;
        private double price;
        private String discount;
        private String title;
        private String tips;
        private String enable;
        private String google_pay_id;
        private int paypal_gift_ratio;
        private String enable_paypal;
        private String enable_google_pay;
        private String enable_apple_pay;

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

        public int getCoin_num() {
            return coin_num;
        }

        public void setCoin_num(int coin_num) {
            this.coin_num = coin_num;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }

        public String getGoogle_pay_id() {
            return google_pay_id;
        }

        public void setGoogle_pay_id(String google_pay_id) {
            this.google_pay_id = google_pay_id;
        }

        public int getPaypal_gift_ratio() {
            return paypal_gift_ratio;
        }

        public void setPaypal_gift_ratio(int paypal_gift_ratio) {
            this.paypal_gift_ratio = paypal_gift_ratio;
        }

        public String getEnable_paypal() {
            return enable_paypal;
        }

        public void setEnable_paypal(String enable_paypal) {
            this.enable_paypal = enable_paypal;
        }

        public String getEnable_google_pay() {
            return enable_google_pay;
        }

        public void setEnable_google_pay(String enable_google_pay) {
            this.enable_google_pay = enable_google_pay;
        }

        public String getEnable_apple_pay() {
            return enable_apple_pay;
        }

        public void setEnable_apple_pay(String enable_apple_pay) {
            this.enable_apple_pay = enable_apple_pay;
        }
    }
}
