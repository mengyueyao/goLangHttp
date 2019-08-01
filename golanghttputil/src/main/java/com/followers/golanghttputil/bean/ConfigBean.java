package com.followers.golanghttputil.bean;

public class ConfigBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : {"id":4,"package_name":"com.followers.tracker.data","created_at":"2019-08-01T10:10:46+08:00","update_at":"2019-08-01T10:19:57+08:00","platform":"1","title":"FansAnalysis审核模式配置","description":"fansanalysis为正式模式,其它的为审核模式","config_detail":"{\"100\":\"fansanalysis\",\"update\":\"market://details?id=com.frame.followers\",\"logo\": \"\",\"tips\": \"The latest followers app\",\"popup\": false,\"popuptips\":\"Our app cannot be paid using googleplay, please use our latest app and pay with googleplay.\",\"free_coins\":\"50\",\"rate\":\"80\"}"}
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
         * id : 4
         * package_name : com.followers.tracker.data
         * created_at : 2019-08-01T10:10:46+08:00
         * update_at : 2019-08-01T10:19:57+08:00
         * platform : 1
         * title : FansAnalysis审核模式配置
         * description : fansanalysis为正式模式,其它的为审核模式
         * config_detail : {"100":"fansanalysis","update":"market://details?id=com.frame.followers","logo": "","tips": "The latest followers app","popup": false,"popuptips":"Our app cannot be paid using googleplay, please use our latest app and pay with googleplay.","free_coins":"50","rate":"80"}
         */

        private int id;
        private String package_name;
        private String created_at;
        private String update_at;
        private String platform;
        private String title;
        private String description;
        private String config_detail;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getConfig_detail() {
            return config_detail;
        }

        public void setConfig_detail(String config_detail) {
            this.config_detail = config_detail;
        }
    }
}
