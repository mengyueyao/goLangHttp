package com.followers.golanghttputil.bean;

import java.util.List;

public class GetUserFollowersBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"year":2020,"month":11,"day":5,"date_str":"2020-11-5","user_pk":"37830561919","follower_count":200,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":11,"day":4,"date_str":"2020-11-4","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":11,"day":3,"date_str":"2020-11-3","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":11,"day":2,"date_str":"2020-11-2","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":11,"day":1,"date_str":"2020-11-1","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":10,"day":31,"date_str":"2020-10-31","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0},{"year":2020,"month":10,"day":30,"date_str":"2020-10-30","user_pk":"37830561919","follower_count":0,"new_follower_count":0,"lost_follower_count":0}]
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
         * year : 2020
         * month : 11
         * day : 5
         * date_str : 2020-11-5
         * user_pk : 37830561919
         * follower_count : 200
         * new_follower_count : 0
         * lost_follower_count : 0
         */

        private int year;
        private int month;
        private int day;
        private String date_str;
        private String user_pk;
        private int follower_count;
        private int new_follower_count;
        private int lost_follower_count;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getDate_str() {
            return date_str;
        }

        public void setDate_str(String date_str) {
            this.date_str = date_str;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public int getFollower_count() {
            return follower_count;
        }

        public void setFollower_count(int follower_count) {
            this.follower_count = follower_count;
        }

        public int getNew_follower_count() {
            return new_follower_count;
        }

        public void setNew_follower_count(int new_follower_count) {
            this.new_follower_count = new_follower_count;
        }

        public int getLost_follower_count() {
            return lost_follower_count;
        }

        public void setLost_follower_count(int lost_follower_count) {
            this.lost_follower_count = lost_follower_count;
        }
    }
}
