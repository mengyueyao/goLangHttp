package com.followers.golanghttputil.bean;

import java.util.List;

public class DiscoveryBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":1,"title":"Buy IGTV Views","img":"https://api.dibage.top/instagram.png","type":"0","price":1,"min":100,"max":100000,"enable":1,"service_id":"960","provider_service_id":3,"provider_service_name":"justanotherpanel","desc":"","created_at":"2020-04-04T16:37:23+08:00","update_at":"2020-04-04T23:10:31+08:00"},{"id":2,"title":"Instagram Comment","img":"https://api.dibage.top/instagram.png","type":"1","price":5,"min":100,"max":10000,"enable":1,"service_id":"1543","provider_service_id":3,"provider_service_name":"justanotherpanel","desc":"","created_at":"2020-04-04T18:59:56+08:00","update_at":"2020-04-04T23:26:32+08:00"},{"id":3,"title":"Buy Youtube Views","img":"https://api.dibage.top/youtube.png","type":"0","price":1,"min":200,"max":1000000,"enable":1,"service_id":"1800","provider_service_id":3,"provider_service_name":"justanotherpanel","desc":"","created_at":"2020-04-04T23:26:03+08:00","update_at":"2020-04-04T23:26:03+08:00"}]
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
         * title : Buy IGTV Views
         * img : https://api.dibage.top/instagram.png
         * type : 0
         * price : 1
         * min : 100
         * max : 100000
         * enable : 1
         * service_id : 960
         * provider_service_id : 3
         * provider_service_name : justanotherpanel
         * desc :
         * created_at : 2020-04-04T16:37:23+08:00
         * update_at : 2020-04-04T23:10:31+08:00
         */

        private int id;
        private String title;
        private String img;
        private String type;
        private int price;
        private int min;
        private int max;
        private int enable;
        private String service_id;
        private int provider_service_id;
        private String provider_service_name;
        private String desc;
        private String created_at;
        private String update_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getEnable() {
            return enable;
        }

        public void setEnable(int enable) {
            this.enable = enable;
        }

        public String getService_id() {
            return service_id;
        }

        public void setService_id(String service_id) {
            this.service_id = service_id;
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

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
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
