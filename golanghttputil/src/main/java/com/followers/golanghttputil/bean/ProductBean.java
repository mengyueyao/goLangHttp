package com.followers.golanghttputil.bean;

public class ProductBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"id":5,"package_name":"com.followers.tracker.data","platform":"1","google_sku_id":"com.sku1","coin_count":300,"enable":"1","price":4.99,"min_reward_coins_count":30,"max_count":"1002"}
     */

    private int code;
    private String message;
    private boolean status;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 5
         * package_name : com.followers.tracker.data
         * platform : 1
         * google_sku_id : com.sku1
         * coin_count : 300
         * enable : 1
         * price : 4.99
         * min_reward_coins_count : 30
         * max_count : 1002
         */

        private int id;
        private String package_name;
        private String platform;
        private String google_sku_id;
        private int coin_count;
        private String enable;
        private double price;
        private int min_reward_coins_count;
        private String max_count;

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

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getGoogle_sku_id() {
            return google_sku_id;
        }

        public void setGoogle_sku_id(String google_sku_id) {
            this.google_sku_id = google_sku_id;
        }

        public int getCoin_count() {
            return coin_count;
        }

        public void setCoin_count(int coin_count) {
            this.coin_count = coin_count;
        }

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getMin_reward_coins_count() {
            return min_reward_coins_count;
        }

        public void setMin_reward_coins_count(int min_reward_coins_count) {
            this.min_reward_coins_count = min_reward_coins_count;
        }

        public String getMax_count() {
            return max_count;
        }

        public void setMax_count(String max_count) {
            this.max_count = max_count;
        }
    }
}
