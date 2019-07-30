package com.followers.golanghttputil.http.service;

import com.google.gson.JsonElement;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by meng on 2017/10/10.
 */

public interface HttpService {

     //获取金币列表
     @POST("coins/list")
     Observable<JsonElement> getGoods(@Body Map<String,Object> map);

     //获取配置文件
     @POST("config")
     Observable<JsonElement> getConfig(@Body Map<String,Object> map);

     //登录
     @POST("login")
     Observable<JsonElement> login(@Body Map<String,Object> map);

     //金币订单
     @POST("coins/orders")
     Observable<JsonElement> getCoinsOrder(@Body Map<String,Object> map);

     //金币下单
     @POST("coins/buy")
     Observable<JsonElement> buyCoins(@Body Map<String,Object> map);

     //支付回调
     @POST("pay/google_pay_callback")
     Observable<JsonElement> payCallback(@Body Map<String,Object> map);

     //服务列表
     @POST("service/list")
     Observable<JsonElement> getServiceList(@Body Map<String,Object> map);

     //购买服务
     @POST("service/buy")
     Observable<JsonElement> buyService(@Body Map<String,Object> map);

     //服务订单列表
     @POST("service/orders")
     Observable<JsonElement> getServiceOder(@Body Map<String,Object> map);

     //好评加金币
     @POST("ad/rate")
     Observable<JsonElement> rateAddCoins(@Body Map<String,Object> map);

     //检查用户是否好评
     @POST("ad/rate_status")
     Observable<JsonElement> getIsRate(@Body Map<String,Object> map);

     //获取用户信息
     @POST("userinfo")
     Observable<JsonElement> getUserInfo(@Body Map<String,Object> map);

     //获取广告奖励
     @POST("/ad/query_reward_coins")
     Observable<JsonElement> getReward(@Body Map<String,Object> map);


     //解锁模块消费的金币
     @POST("/coins/consume_coin")
     Observable<JsonElement> Consume(@Body Map<String,Object> map);


}
