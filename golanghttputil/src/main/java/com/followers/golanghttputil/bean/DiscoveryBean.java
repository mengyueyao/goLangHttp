package com.followers.golanghttputil.bean;

import java.util.List;

public class DiscoveryBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"id":8,"title":"Instagram - Story Views [ Max - 5k ] [ CHEAPEST ] [ Superfast ] INSTANT","img":"http://img1.imgtn.bdimg.com/it/u=1703528148,792109249&fm=26&gp=0.jpg","type":"0","price":30,"min":100,"max":5000,"service_id":"1856"},{"id":9,"title":"Twitter - Followers [ Max - 5k ] [ HQ ] [ 30 days AUTO REFILL ] INSTANT-1hrs","img":"https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2007149643,2886370797&fm=26&gp=0.jpg","type":"0","price":80,"min":50,"max":4000,"service_id":"1633"},{"id":10,"title":"Facebook - Page Likes [ Max - 50k ] [ 30 Days Refill Guarantee ] INSTANT","img":"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=241288357,1331462276&fm=26&gp=0.jpg","type":"0","price":50,"min":100,"max":50000,"service_id":"1638"},{"id":11,"title":"Instagram - ( S6 ) CUSTOM COMMENTS [ Superfast, Best Service ] [ Max - 10k ] SUPER INSTANT","img":"https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1703528148,792109249&fm=26&gp=0.jpg","type":"1","price":100,"min":5,"max":10000,"service_id":"1472"}]
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
         * id : 8
         * title : Instagram - Story Views [ Max - 5k ] [ CHEAPEST ] [ Superfast ] INSTANT
         * img : http://img1.imgtn.bdimg.com/it/u=1703528148,792109249&fm=26&gp=0.jpg
         * type : 0
         * price : 30
         * min : 100
         * max : 5000
         * service_id : 1856
         */

        private int id;
        private String title;
        private String img;
        private String type;
        private int price;
        private int min;
        private int max;
        private String service_id;

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

        public String getService_id() {
            return service_id;
        }

        public void setService_id(String service_id) {
            this.service_id = service_id;
        }
    }
}
