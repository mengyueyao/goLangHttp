package com.followers.golanghttputil.bean;

public class VipStatusBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"is_vip":true,"expiry_time":"2020-12-05T14:52:30+08:00","vip_id":1,"user_pk":"6060192636","price":300}
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
         * is_vip : true
         * expiry_time : 2020-12-05T14:52:30+08:00
         * vip_id : 1
         * user_pk : 6060192636
         * price : 300
         */

        private boolean is_vip;
        private String expiry_time;
        private int vip_id;
        private String user_pk;
        private String price;

        public boolean isIs_vip() {
            return is_vip;
        }

        public void setIs_vip(boolean is_vip) {
            this.is_vip = is_vip;
        }

        public String getExpiry_time() {
            return expiry_time;
        }

        public void setExpiry_time(String expiry_time) {
            this.expiry_time = expiry_time;
        }

        public int getVip_id() {
            return vip_id;
        }

        public void setVip_id(int vip_id) {
            this.vip_id = vip_id;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }
}
