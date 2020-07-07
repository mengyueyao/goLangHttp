package com.followers.golanghttputil.bean;

import java.util.List;

public class TiktokPostBean {


    /**
     * code : 200
     * message : 数据获取成功
     * data : [{"id":"6819462607972453637","text":"","createTime":1587779871,"covers":"https://p16-tiktok-va.ibyteimg.com/obj/tos-maliva-p-0068/e2776eece6124480a03c8e0c0edf2b59?x-expires=1594256400&x-signature=3gLofu6ozd316y9cuPDbQtKfUbo%3D","videoUrl":"https://v16m.tiktokcdn.com/fb91658ed19f1947c39b38e13c8a49a3/5f041f72/video/tos/useast2a/tos-useast2a-pve-0068/a818f069832e445d91371278944ec328/?a=1233&br=2256&bt=1128&cr=0&cs=0&dr=0&ds=3&er=&l=20200707010734010189073045389BA67F&lr=tiktok_m&mime_type=video_mp4&qs=0&rc=amo7OzhydnVzdDMzNTczM0ApZjNkNzg3Zjw5NzQ8OTtnOWc0MnEvYWBzZWVfLS0wMTZzc18uNDMtNjEzY2AtNTBfXy06Yw%3D%3D&vl=&vr=","diggCount":60,"shareCount":0,"commentCount":0,"playCount":1323},{"id":"6819461952385912070","text":"","createTime":1587779718,"covers":"https://p16-tiktok-va.ibyteimg.com/obj/tos-maliva-p-0068/ccc8b22c548d428cbe6595e5fc1ada4e?x-expires=1594256400&x-signature=ZKAnbZgOBR4COuNBT1mdCLeR2MM%3D","videoUrl":"https://v16m.tiktokcdn.com/e77691bcdfb908e069c48c878a694b67/5f041f72/video/tos/useast2a/tos-useast2a-pve-0068/6394ae7e6d404310b53013f3c667c527/?a=1233&br=2378&bt=1189&cr=0&cs=0&dr=0&ds=3&er=&l=20200707010734010189073045389BA67F&lr=tiktok_m&mime_type=video_mp4&qs=0&rc=M2d3eWkzaWtzdDMzNTczM0ApaTg0PDtmZDw0N2Q5ZTg8M2dhNF5vYTY0ZGVfLS1gMTZzc2FfLy1eM2NeYF8xLjAvYjE6Yw%3D%3D&vl=&vr=","diggCount":30,"shareCount":0,"commentCount":0,"playCount":322},{"id":"6819461543927762181","text":"#tiktokprom","createTime":1587779623,"covers":"https://p16-tiktok-va.ibyteimg.com/obj/tos-maliva-p-0068/60b2a699479c44e0ac83f0308e1b8fbc?x-expires=1594256400&x-signature=b1wHsYHAwmVwjpQmFHk9TlhMhhk%3D","videoUrl":"https://v16m.tiktokcdn.com/a29cc034f122f9dcf935f4547d97b428/5f041f38/video/tos/useast2a/tos-useast2a-pve-0068/f683281bfa8542918d9d9dd2813a267e/?a=1233&br=2146&bt=1073&cr=0&cs=0&dr=0&ds=3&er=&l=20200707010734010189073045389BA67F&lr=tiktok_m&mime_type=video_mp4&qs=0&rc=M3NwOTxrdjtzdDMzNTczM0ApPGVlNWU0Zjw1N2hoOGdoZ2c0Xm9hc2Y2ZGVfLS1gMTZzczBjNC9iYzAtMi4yXy8vMDI6Yw%3D%3D&vl=&vr=","diggCount":200,"shareCount":0,"commentCount":0,"playCount":1336}]
     * status : true
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
         * id : 6819462607972453637
         * text :
         * createTime : 1587779871
         * covers : https://p16-tiktok-va.ibyteimg.com/obj/tos-maliva-p-0068/e2776eece6124480a03c8e0c0edf2b59?x-expires=1594256400&x-signature=3gLofu6ozd316y9cuPDbQtKfUbo%3D
         * videoUrl : https://v16m.tiktokcdn.com/fb91658ed19f1947c39b38e13c8a49a3/5f041f72/video/tos/useast2a/tos-useast2a-pve-0068/a818f069832e445d91371278944ec328/?a=1233&br=2256&bt=1128&cr=0&cs=0&dr=0&ds=3&er=&l=20200707010734010189073045389BA67F&lr=tiktok_m&mime_type=video_mp4&qs=0&rc=amo7OzhydnVzdDMzNTczM0ApZjNkNzg3Zjw5NzQ8OTtnOWc0MnEvYWBzZWVfLS0wMTZzc18uNDMtNjEzY2AtNTBfXy06Yw%3D%3D&vl=&vr=
         * diggCount : 60
         * shareCount : 0
         * commentCount : 0
         * playCount : 1323
         */

        private String id;
        private String text;
        private int createTime;
        private String covers;
        private String videoUrl;
        private int diggCount;
        private int shareCount;
        private int commentCount;
        private int playCount;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getCreateTime() {
            return createTime;
        }

        public void setCreateTime(int createTime) {
            this.createTime = createTime;
        }

        public String getCovers() {
            return covers;
        }

        public void setCovers(String covers) {
            this.covers = covers;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getDiggCount() {
            return diggCount;
        }

        public void setDiggCount(int diggCount) {
            this.diggCount = diggCount;
        }

        public int getShareCount() {
            return shareCount;
        }

        public void setShareCount(int shareCount) {
            this.shareCount = shareCount;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }
    }
}
