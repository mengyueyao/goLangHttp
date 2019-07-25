package com.followers.golanghttputil.bean;

public enum  PayType {

    googleplay("2"),paypal("1");

    private  String value;

    PayType(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
