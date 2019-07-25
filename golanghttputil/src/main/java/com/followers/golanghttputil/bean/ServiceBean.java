package com.followers.golanghttputil.bean;

import java.util.List;

public class ServiceBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-25T17:47:38+08:00","update_at":"2019-07-25T17:47:38+08:00","platform":"1","product_type":"1","product_count":200,"product_price":100,"service_id":"12","service_min_num":100,"provider_service_id":1,"provider_service_name":"baidu","enable":1}]
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
         * package_name : insta.likes.followers.photo.golangapidemo
         * created_at : 2019-07-25T17:47:38+08:00
         * update_at : 2019-07-25T17:47:38+08:00
         * platform : 1
         * product_type : 1
         * product_count : 200
         * product_price : 100
         * service_id : 12
         * service_min_num : 100
         * provider_service_id : 1
         * provider_service_name : baidu
         * enable : 1
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String product_type;
        private int product_count;
        private int product_price;
        private String service_id;
        private int service_min_num;
        private int provider_service_id;
        private String provider_service_name;
        private int enable;

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

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }

        public int getProduct_count() {
            return product_count;
        }

        public void setProduct_count(int product_count) {
            this.product_count = product_count;
        }

        public int getProduct_price() {
            return product_price;
        }

        public void setProduct_price(int product_price) {
            this.product_price = product_price;
        }

        public String getService_id() {
            return service_id;
        }

        public void setService_id(String service_id) {
            this.service_id = service_id;
        }

        public int getService_min_num() {
            return service_min_num;
        }

        public void setService_min_num(int service_min_num) {
            this.service_min_num = service_min_num;
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

        public int getEnable() {
            return enable;
        }

        public void setEnable(int enable) {
            this.enable = enable;
        }
    }
}
