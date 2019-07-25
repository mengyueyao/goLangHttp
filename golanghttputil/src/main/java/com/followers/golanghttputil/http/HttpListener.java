package com.followers.golanghttputil.http;

public interface HttpListener<T> {

    void onSuccess(T bean);

    void onError(String error);
}
