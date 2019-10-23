package com.followers.golanghttputil.bean;

public enum SubscriptType {

    followers("1"),likes("2");

    private  String value;

    SubscriptType(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
