package com.followers.golanghttputil.http.request;

import android.util.Log;

import com.followers.golanghttputil.util.Utils;
import com.google.gson.JsonElement;

import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by meng on 2017/12/14.
 */

public abstract class RequestManager  {

    public void post(Observable observable){

             observable.subscribe(new Action1<JsonElement>() {
                @Override
                public void call(JsonElement jsonObject) {

                    String result = jsonObject.toString();

                    success(result);

                }
            }, new Action1<Throwable>() {
                @Override
                public void call(Throwable throwable) {

                    try {

                        if(Utils.isDebug()){

                            Log.e("error","msg:"+throwable.toString());
                        }

                        int code = ((HttpException) throwable).code();

                        ResponseBody responseBody = ((HttpException) throwable).response().errorBody();

                        throwable.printStackTrace();

                        failure("code:"+code+",msg:"+responseBody.string());


                    } catch (Exception e) {
                        e.printStackTrace();

                        failure(throwable.toString());
                    }





                }
            });


    }

    public abstract void success(String s);

    public abstract void failure(String e);


}
