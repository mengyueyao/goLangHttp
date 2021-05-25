package com.followers.golanghttputil.bean;

public class SaveTagsBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"Id":1,"user_pk":"6060192636","Title":"123","Content":"123#124","Image":"https://www.baidu.com"}
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
         * Id : 1
         * user_pk : 6060192636
         * Title : 123
         * Content : 123#124
         * Image : https://www.baidu.com
         */

        private int Id;
        private String user_pk;
        private String Title;
        private String Content;
        private String Image;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(String user_pk) {
            this.user_pk = user_pk;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String Content) {
            this.Content = Content;
        }

        public String getImage() {
            return Image;
        }

        public void setImage(String Image) {
            this.Image = Image;
        }
    }
}
