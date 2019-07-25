package com.followers.golanghttputil.bean;

public enum ServiceType {

    followers("2"),likes("1"),views("3");

    private  String value;

    ServiceType(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
