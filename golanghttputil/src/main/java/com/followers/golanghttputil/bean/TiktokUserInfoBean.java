package com.followers.golanghttputil.bean;

public class TiktokUserInfoBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"user_id":"6819460449450214406","is_secret":false,"unique_id":"mengyueyaovip","nick_name":"孟跃耀","following":49,"fans":49,"heart":"251","video":3,"covers":"https://p16-va-default.akamaized.net/img/musically-maliva-obj/1664907483950086~c5_100x100.jpeg"}
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
         * user_id : 6819460449450214406
         * is_secret : false
         * unique_id : mengyueyaovip
         * nick_name : 孟跃耀
         * following : 49
         * fans : 49
         * heart : 251
         * video : 3
         * covers : https://p16-va-default.akamaized.net/img/musically-maliva-obj/1664907483950086~c5_100x100.jpeg
         */

        private String user_id;
        private boolean is_secret;
        private String unique_id;
        private String nick_name;
        private int following;
        private int fans;
        private String heart;
        private int video;
        private String covers;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public boolean isIs_secret() {
            return is_secret;
        }

        public void setIs_secret(boolean is_secret) {
            this.is_secret = is_secret;
        }

        public String getUnique_id() {
            return unique_id;
        }

        public void setUnique_id(String unique_id) {
            this.unique_id = unique_id;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public int getFollowing() {
            return following;
        }

        public void setFollowing(int following) {
            this.following = following;
        }

        public int getFans() {
            return fans;
        }

        public void setFans(int fans) {
            this.fans = fans;
        }

        public String getHeart() {
            return heart;
        }

        public void setHeart(String heart) {
            this.heart = heart;
        }

        public int getVideo() {
            return video;
        }

        public void setVideo(int video) {
            this.video = video;
        }

        public String getCovers() {
            return covers;
        }

        public void setCovers(String covers) {
            this.covers = covers;
        }
    }
}
