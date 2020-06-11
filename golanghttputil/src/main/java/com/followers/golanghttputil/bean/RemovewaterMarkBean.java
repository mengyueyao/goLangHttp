package com.followers.golanghttputil.bean;

public class RemovewaterMarkBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"imageUrl":"https://p16-tiktok-sg.ibyteimg.com/obj/v0201/b0f082533e5e460b83b05a9f23706a5c_1591781351?x-expires=1592028000&x-signature=IliGQFeZz0b2UX2fTRrwot8I%2F8I%3D","videoUrl":"https://v16m.tiktokcdn.com/c379450b14044dac154416c1788043d7/5ee2256f/video/tos/alisg/tos-alisg-pve-0037/f2f150a505de43bb8ed5f9bc38f40e2f/?a=1180&br=4118&bt=2059&cr=0&cs=0&dr=3&ds=3&er=&l=2020061106365201018907207249078212&lr=tiktok&mime_type=video_mp4&qs=0&rc=ajRtNHY5aTtkdTMzOzgzM0ApOGdkZmVoN2Q1NzVoaWY7NGcycjZlY2NzY2RfLS0wLzRzczItMDQ1MjIxNWNhLjQ2LjQ6Yw%3D%3D&vl=&vr=","videoUrlNoWaterMark":"https://api2.musical.ly/aweme/v1/playwm/?video_id=v07025380000brgaf8vff6fsh19ju15g"}
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
         * imageUrl : https://p16-tiktok-sg.ibyteimg.com/obj/v0201/b0f082533e5e460b83b05a9f23706a5c_1591781351?x-expires=1592028000&x-signature=IliGQFeZz0b2UX2fTRrwot8I%2F8I%3D
         * videoUrl : https://v16m.tiktokcdn.com/c379450b14044dac154416c1788043d7/5ee2256f/video/tos/alisg/tos-alisg-pve-0037/f2f150a505de43bb8ed5f9bc38f40e2f/?a=1180&br=4118&bt=2059&cr=0&cs=0&dr=3&ds=3&er=&l=2020061106365201018907207249078212&lr=tiktok&mime_type=video_mp4&qs=0&rc=ajRtNHY5aTtkdTMzOzgzM0ApOGdkZmVoN2Q1NzVoaWY7NGcycjZlY2NzY2RfLS0wLzRzczItMDQ1MjIxNWNhLjQ2LjQ6Yw%3D%3D&vl=&vr=
         * videoUrlNoWaterMark : https://api2.musical.ly/aweme/v1/playwm/?video_id=v07025380000brgaf8vff6fsh19ju15g
         */

        private String imageUrl;
        private String videoUrl;
        private String videoUrlNoWaterMark;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getVideoUrlNoWaterMark() {
            return videoUrlNoWaterMark;
        }

        public void setVideoUrlNoWaterMark(String videoUrlNoWaterMark) {
            this.videoUrlNoWaterMark = videoUrlNoWaterMark;
        }
    }
}
