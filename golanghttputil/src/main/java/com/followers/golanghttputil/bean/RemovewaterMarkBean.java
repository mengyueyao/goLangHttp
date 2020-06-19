package com.followers.golanghttputil.bean;

public class RemovewaterMarkBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"videoUrl":"https://api-h2.tiktokv.com/aweme/v1/playwm/?video_id=v09044270000brjd0k94uh3hvel6v730"}
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
         * videoUrl : https://api-h2.tiktokv.com/aweme/v1/playwm/?video_id=v09044270000brjd0k94uh3hvel6v730
         */

        private String videoUrl;

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
    }
}
