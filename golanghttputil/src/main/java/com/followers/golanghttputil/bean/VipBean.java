package com.followers.golanghttputil.bean;

import java.util.List;

public class VipBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":4,"package_name":"com.followers.tracker.data","created_at":"2019-08-24T16:01:24+08:00","update_at":"2019-08-24T16:01:24+08:00","platform":"1","name":"650 Followers/Day","plan_id":"P-1ST29750WW244830UYKSLUCA","frequency_interval":"7","price":"49.99","followers_count":"650","followers_service_id":"409","enable":"1","provider_service_id":1,"provider_service_name":"smmlite"},{"id":5,"package_name":"com.followers.tracker.data","created_at":"2019-08-24T16:01:52+08:00","update_at":"2019-08-24T16:01:52+08:00","platform":"1","name":"1400 Followers/Day","plan_id":"P-2K870504PG281974DYKSSRFQ","frequency_interval":"7","price":"99.99","followers_count":"1400","followers_service_id":"409","enable":"1","provider_service_id":1,"provider_service_name":"smmlite"}]
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
         * id : 4
         * package_name : com.followers.tracker.data
         * created_at : 2019-08-24T16:01:24+08:00
         * update_at : 2019-08-24T16:01:24+08:00
         * platform : 1
         * name : 650 Followers/Day
         * plan_id : P-1ST29750WW244830UYKSLUCA
         * frequency_interval : 7
         * price : 49.99
         * followers_count : 650
         * followers_service_id : 409
         * enable : 1
         * provider_service_id : 1
         * provider_service_name : smmlite
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String name;
        private String plan_id;
        private String frequency_interval;
        private String price;
        private String followers_count;
        private String followers_service_id;
        private String enable;
        private int provider_service_id;
        private String provider_service_name;
        private String price_per_day;

        public String getPrice_per_day() {
            return price_per_day;
        }

        public void setPrice_per_day(String price_per_day) {
            this.price_per_day = price_per_day;
        }

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlan_id() {
            return plan_id;
        }

        public void setPlan_id(String plan_id) {
            this.plan_id = plan_id;
        }

        public String getFrequency_interval() {
            return frequency_interval;
        }

        public void setFrequency_interval(String frequency_interval) {
            this.frequency_interval = frequency_interval;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getFollowers_count() {
            return followers_count;
        }

        public void setFollowers_count(String followers_count) {
            this.followers_count = followers_count;
        }

        public String getFollowers_service_id() {
            return followers_service_id;
        }

        public void setFollowers_service_id(String followers_service_id) {
            this.followers_service_id = followers_service_id;
        }

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }

        public int getProvider_service_id() {
            return provider_service_id;
        }

        public void setProvider_service_id(int provider_service_id) {
            this.provider_service_id = provider_service_id;
        }

        public String getProvider_service_name() {
            return provider_service_name;
        }

        public void setProvider_service_name(String provider_service_name) {
            this.provider_service_name = provider_service_name;
        }
    }
}
