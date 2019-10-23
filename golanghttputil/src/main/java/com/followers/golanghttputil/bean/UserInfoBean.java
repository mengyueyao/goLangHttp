package com.followers.golanghttputil.bean;

public class UserInfoBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"id":148951,"package_name":"com.pop.tags","created_at":"2019-10-23T14:55:33+08:00","update_at":"2019-10-23T14:55:33+08:00","platform":"1","user_pk":"24","user_name":"tom","cover":"https://scontent-sin6-2.cdninstagram.com/vp/f64617d77d85d74e09f7bfb5f62685cb/5E4D02C0/t51.2885-19/10831780_819050511467036_1842884027_a.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com","coin_balance":60,"total_amount_coin":0,"total_amount_price":0,"total_consumption_coin":0,"total_ad_coin":0,"vip_expire_time":"0001-01-01T00:00:00Z","vip_id":"","is_black_list":0,"paypal_limit":600,"sub_follower_count":"","is_subscription":false,"country":"中国","likes_vip_expire_time":"0001-01-01T00:00:00Z","is_likes_subscription":false,"likes_vip_id":""}
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
         * id : 148951
         * package_name : com.pop.tags
         * created_at : 2019-10-23T14:55:33+08:00
         * update_at : 2019-10-23T14:55:33+08:00
         * platform : 1
         * user_pk : 24
         * user_name : tom
         * cover : https://scontent-sin6-2.cdninstagram.com/vp/f64617d77d85d74e09f7bfb5f62685cb/5E4D02C0/t51.2885-19/10831780_819050511467036_1842884027_a.jpg?_nc_ht=scontent-sin6-2.cdninstagram.com
         * coin_balance : 60
         * total_amount_coin : 0
         * total_amount_price : 0
         * total_consumption_coin : 0
         * total_ad_coin : 0
         * vip_expire_time : 0001-01-01T00:00:00Z
         * vip_id :
         * is_black_list : 0
         * paypal_limit : 600
         * sub_follower_count :
         * is_subscription : false
         * country : 中国
         * likes_vip_expire_time : 0001-01-01T00:00:00Z
         * is_likes_subscription : false
         * likes_vip_id :
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String user_pk;
        private String user_name;
        private String cover;
        private int coin_balance;
        private int total_amount_coin;
        private int total_amount_price;
        private int total_consumption_coin;
        private int total_ad_coin;
        private String vip_expire_time;
        private String vip_id;
        private int is_black_list;
        private int paypal_limit;
        private String sub_follower_count;
        private boolean is_subscription;
        private String country;
        private String likes_vip_expire_time;
        private boolean is_likes_subscription;
        private String likes_vip_id;

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

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getCoin_balance() {
            return coin_balance;
        }

        public void setCoin_balance(int coin_balance) {
            this.coin_balance = coin_balance;
        }

        public int getTotal_amount_coin() {
            return total_amount_coin;
        }

        public void setTotal_amount_coin(int total_amount_coin) {
            this.total_amount_coin = total_amount_coin;
        }

        public int getTotal_amount_price() {
            return total_amount_price;
        }

        public void setTotal_amount_price(int total_amount_price) {
            this.total_amount_price = total_amount_price;
        }

        public int getTotal_consumption_coin() {
            return total_consumption_coin;
        }

        public void setTotal_consumption_coin(int total_consumption_coin) {
            this.total_consumption_coin = total_consumption_coin;
        }

        public int getTotal_ad_coin() {
            return total_ad_coin;
        }

        public void setTotal_ad_coin(int total_ad_coin) {
            this.total_ad_coin = total_ad_coin;
        }

        public String getVip_expire_time() {
            return vip_expire_time;
        }

        public void setVip_expire_time(String vip_expire_time) {
            this.vip_expire_time = vip_expire_time;
        }

        public String getVip_id() {
            return vip_id;
        }

        public void setVip_id(String vip_id) {
            this.vip_id = vip_id;
        }

        public int getIs_black_list() {
            return is_black_list;
        }

        public void setIs_black_list(int is_black_list) {
            this.is_black_list = is_black_list;
        }

        public int getPaypal_limit() {
            return paypal_limit;
        }

        public void setPaypal_limit(int paypal_limit) {
            this.paypal_limit = paypal_limit;
        }

        public String getSub_follower_count() {
            return sub_follower_count;
        }

        public void setSub_follower_count(String sub_follower_count) {
            this.sub_follower_count = sub_follower_count;
        }

        public boolean isIs_subscription() {
            return is_subscription;
        }

        public void setIs_subscription(boolean is_subscription) {
            this.is_subscription = is_subscription;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLikes_vip_expire_time() {
            return likes_vip_expire_time;
        }

        public void setLikes_vip_expire_time(String likes_vip_expire_time) {
            this.likes_vip_expire_time = likes_vip_expire_time;
        }

        public boolean isIs_likes_subscription() {
            return is_likes_subscription;
        }

        public void setIs_likes_subscription(boolean is_likes_subscription) {
            this.is_likes_subscription = is_likes_subscription;
        }

        public String getLikes_vip_id() {
            return likes_vip_id;
        }

        public void setLikes_vip_id(String likes_vip_id) {
            this.likes_vip_id = likes_vip_id;
        }
    }
}
