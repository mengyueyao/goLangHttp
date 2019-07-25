package com.followers.golanghttputil.bean;

import java.util.List;

public class OrderServiceBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":0,"package_name":"","created_at":"2019-07-25T17:52:39+08:00","update_at":"2019-07-25T17:52:39+08:00","platform":"","user_pk":"","user_name":"","product_id":1,"product_type":1,"buy_count":200,"order_id":"","status":"Pending","order_price":100,"url":"https://www.instagram.com/p/http://i.instagram/p/sdfwerrweerew/","cover":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1563286904392&di=ca4bedad658b2efd71f086ffd50411da&imgtype=0&src=http%3A%2F%2Fr.bstatic.com%2Fimages%2Fhotel%2Fmax1024x768%2F987%2F98767654.jpg","provider_service_id":0,"provider_service_name":""}]
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
         * id : 0
         * package_name :
         * created_at : 2019-07-25T17:52:39+08:00
         * update_at : 2019-07-25T17:52:39+08:00
         * platform :
         * user_pk :
         * user_name :
         * product_id : 1
         * product_type : 1
         * buy_count : 200
         * order_id :
         * status : Pending
         * order_price : 100
         * url : https://www.instagram.com/p/http://i.instagram/p/sdfwerrweerew/
         * cover : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1563286904392&di=ca4bedad658b2efd71f086ffd50411da&imgtype=0&src=http%3A%2F%2Fr.bstatic.com%2Fimages%2Fhotel%2Fmax1024x768%2F987%2F98767654.jpg
         * provider_service_id : 0
         * provider_service_name :
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String user_pk;
        private String user_name;
        private int product_id;
        private int product_type;
        private int buy_count;
        private String order_id;
        private String status;
        private int order_price;
        private String url;
        private String cover;
        private int provider_service_id;
        private String provider_service_name;

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

        public int getProduct_type() {
            return product_type;
        }

        public void setProduct_type(int product_type) {
            this.product_type = product_type;
        }

        public int getBuy_count() {
            return buy_count;
        }

        public void setBuy_count(int buy_count) {
            this.buy_count = buy_count;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getOrder_price() {
            return order_price;
        }

        public void setOrder_price(int order_price) {
            this.order_price = order_price;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
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
