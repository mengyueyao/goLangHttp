package com.followers.golanghttputil.http.request;


import com.followers.golanghttputil.http.ObjectLoader;
import com.followers.golanghttputil.http.RetrofitServiceManager;
import com.followers.golanghttputil.http.service.HttpService;
import com.google.gson.JsonElement;

import java.util.Map;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by meng on 2017/10/10.
 */

public class HttpRequest extends ObjectLoader {

    private HttpService httpService;

    public HttpRequest() {

        httpService = RetrofitServiceManager.getInstance().create(HttpService.class);
    }

    /**
     *
     * 获取金币列表
     * @return
     */

    public Observable<JsonElement> getGoods(Map<String,Object> map){

        return observable(httpService.getGoods(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 获取配置文件
     * @param map
     * @return
     */
    public Observable<JsonElement> getConfig(Map<String,Object> map){

        return observable(httpService.getConfig(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 登录
     * @param map
     * @return
     */
    public Observable<JsonElement> login(Map<String,Object> map){

        return observable(httpService.login(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 获取金币订单列表
     * @param map
     * @return
     */

    public Observable<JsonElement> getCoinsOrder(Map<String,Object> map){

        return observable(httpService.getCoinsOrder(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 购买金币下单
     * @param map
     * @return
     */
    public Observable<JsonElement> buyCoins(Map<String,Object> map){

        return observable(httpService.buyCoins(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 支付回调
     * @param map
     * @return
     */

    public Observable<JsonElement> payCallback(Map<String,Object> map){

        return observable(httpService.payCallback(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 服务列表
     * @param map
     * @return
     */

    public Observable<JsonElement> getServiceList(Map<String,Object> map){

        return observable(httpService.getServiceList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 购买服务
     * @param map
     * @return
     */

    public Observable<JsonElement> buyService(Map<String,Object> map){

        return observable(httpService.buyService(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 服务订单列表
     * @param map
     * @return
     */

    public Observable<JsonElement> getServiceOder(Map<String,Object> map){

        return observable(httpService.getServiceOder(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     * 好评加金币
     * @param map
     * @return
     */

    public Observable<JsonElement> rateAddCoins(Map<String,Object> map){

        return observable(httpService.rateAddCoins(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 用户是否好评
     * @param map
     * @return
     */
    public Observable<JsonElement> getIsRate(Map<String,Object> map){

        return observable(httpService.getIsRate(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


}
