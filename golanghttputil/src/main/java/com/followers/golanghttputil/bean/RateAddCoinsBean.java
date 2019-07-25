package com.followers.golanghttputil.bean;

public class RateAddCoinsBean {


    /**
     * code : 200
     * message : Rate successful
     * status : true
     * data : {"id":1,"package_name":"insta.likes.followers.photo.golangapidemo","created_at":"2019-07-25T18:04:29.481461098+08:00","update_at":"2019-07-25T18:04:29.481461354+08:00","platform":"1","user_pk":"12345","user_name":"chenjia","rewar_coins":50}
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
         * id : 1
         * package_name : insta.likes.followers.photo.golangapidemo
         * created_at : 2019-07-25T18:04:29.481461098+08:00
         * update_at : 2019-07-25T18:04:29.481461354+08:00
         * platform : 1
         * user_pk : 12345
         * user_name : chenjia
         * rewar_coins : 50
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String user_pk;
        private String user_name;
        private int rewar_coins;

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

        public int getRewar_coins() {
            return rewar_coins;
        }

        public void setRewar_coins(int rewar_coins) {
            this.rewar_coins = rewar_coins;
        }
    }
}
