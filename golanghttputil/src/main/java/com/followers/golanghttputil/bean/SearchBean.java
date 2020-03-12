package com.followers.golanghttputil.bean;

import java.util.List;

public class SearchBean {


    /**
     * code : 200
     * message : OK
     * status : true
     * data : [{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/PONWAT2C3P.jpg","Url":"/photo/PONWAT2C3P"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/I3GYORNUP4.jpg","Url":"/photo/I3GYORNUP4"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/PEQSYLZSYS.jpg","Url":"/photo/PEQSYLZSYS"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/RKAECBZ4CP.jpg","Url":"/photo/RKAECBZ4CP"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/2DFRSJIKH1.jpg","Url":"/photo/2DFRSJIKH1"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/D0S7RPPQSL.jpg","Url":"/photo/D0S7RPPQSL"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/ZT9SCKS111.jpg","Url":"/photo/ZT9SCKS111"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/CYUELCXZ74.jpg","Url":"/photo/CYUELCXZ74"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/7C71QVWOH7.jpg","Url":"/photo/7C71QVWOH7"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/1CPSMUWHWX.jpg","Url":"/photo/1CPSMUWHWX"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/VIOYN4OKQ9.jpg","Url":"/photo/VIOYN4OKQ9"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/XHBLQZQP6J.jpg","Url":"/photo/XHBLQZQP6J"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/5UJGLFSUOW.jpg","Url":"/photo/5UJGLFSUOW"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/UFDUJKAG6R.jpg","Url":"/photo/UFDUJKAG6R"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/P0HDKKPWGP.jpg","Url":"/photo/P0HDKKPWGP"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/SKEPYS38EB.jpg","Url":"/photo/SKEPYS38EB"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/LPZFCLQN45.jpg","Url":"/photo/LPZFCLQN45"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/Y5ULP5LDX1.jpg","Url":"/photo/Y5ULP5LDX1"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/G8YFG3OSZ4.jpg","Url":"/photo/G8YFG3OSZ4"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/XS7ENHE2RP.jpg","Url":"/photo/XS7ENHE2RP"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/OU5O7ZUVH7.jpg","Url":"/photo/OU5O7ZUVH7"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/E3HSM4EUTO.jpg","Url":"/photo/E3HSM4EUTO"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/OMEEWZJVKQ.jpg","Url":"/photo/OMEEWZJVKQ"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/GUEDEPPBIW.jpg","Url":"/photo/GUEDEPPBIW"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/FA0KT4D9WC.jpg","Url":"/photo/FA0KT4D9WC"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/8OXCIXKU0N.jpg","Url":"/photo/8OXCIXKU0N"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/OHOPNFDBJM.jpg","Url":"/photo/OHOPNFDBJM"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/8JJE2UD8XH.jpg","Url":"/photo/8JJE2UD8XH"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/AMZBFGITXI.jpg","Url":"/photo/AMZBFGITXI"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/VFQTYEC60T.jpg","Url":"/photo/VFQTYEC60T"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/0YIVO1EPKB.jpg","Url":"/photo/0YIVO1EPKB"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/6YLK3BZYIJ.jpg","Url":"/photo/6YLK3BZYIJ"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/LFS1OAX12D.jpg","Url":"/photo/LFS1OAX12D"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/NKK51N0LL1.jpg","Url":"/photo/NKK51N0LL1"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/16MYYB9JNI.jpg","Url":"/photo/16MYYB9JNI"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/H7SQ64KL6T.jpg","Url":"/photo/H7SQ64KL6T"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/BY1YIGNS0Y.jpg","Url":"/photo/BY1YIGNS0Y"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/C4RISPD69E.jpg","Url":"/photo/C4RISPD69E"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/4RCCTXB46S.jpg","Url":"/photo/4RCCTXB46S"},{"Img":"https://cdn.stocksnap.io/img-thumbs/280h/M5GE45SBP4.jpg","Url":"/photo/M5GE45SBP4"}]
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
         * Img : https://cdn.stocksnap.io/img-thumbs/280h/PONWAT2C3P.jpg
         * Url : /photo/PONWAT2C3P
         */

        private String Img;
        private String Url;

        public String getImg() {
            return Img;
        }

        public void setImg(String Img) {
            this.Img = Img;
        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String Url) {
            this.Url = Url;
        }
    }
}
