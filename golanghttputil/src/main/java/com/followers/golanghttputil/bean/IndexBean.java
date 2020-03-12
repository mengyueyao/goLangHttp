package com.followers.golanghttputil.bean;

public class IndexBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [
     {
     "title":"most popular",
     "tags":[
     {
     "title":"animals",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"fashion",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"travel",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"food",
     "pic":"http://www.baidu.com"
     }
     ]
     },
     {
     "title":"tags",
     "tags":[
     {
     "title":"popular",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"nature",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"social",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"weather",
     "pic":"http://www.baidu.com"
     }
     ]
     },
     {
     "title":"caption",
     "tags":[
     {
     "title":"alone",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"good",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"cute",
     "pic":"http://www.baidu.com"
     },
     {
     "title":"picture",
     "pic":"http://www.baidu.com"
     }
     ]
     }
     ]

     */

    private int code;
    private String message;
    private boolean status;
    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
