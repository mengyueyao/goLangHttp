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

     //活动商品
    @POST("lottery/get_product")
    Observable<JsonElement> getProduct(@Body Map<String,Object> map);


     //获取订阅商品列表
     @POST("service/get_subscription_list")
     Observable<JsonElement> getSubscriptionList(@Body Map<String,Object> map);


     //paypal订阅   弃用
     @POST("service/create_paypal_subscriber")
     Observable<JsonElement> createPaypalSubscriber(@Body Map<String,Object> map);


     //paypal购买活动商品
     @POST("lottery/buy")
     Observable<JsonElement> lotteryBuy(@Body Map<String,Object> map);


     //google购买活动商品
     @POST("lottery/google_successful")
     Observable<JsonElement> google_successful(@Body Map<String,Object> map);



    //google订阅
    @POST("/service/create_subscriber")
    Observable<JsonElement> createSubscriber(@Body Map<String,Object> map);

    //根据网页内容获取用户信息或者帖子

    @POST("parse")
    Observable<JsonElement> parse(@Body Map<String,Object> map);


    //点赞VIP
    @POST("service/create_likes_subscriber")
    Observable<JsonElement> createLikesSubscriber(@Body Map<String,Object> map);

    //添加自定义标签分类
    @POST("hashtag/add_custom_category")
    Observable<JsonElement> addCustomCategory(@Body Map<String,Object> map);

    //修改自定义标签分类
    @POST("hashtag/edit_custom_category")
    Observable<JsonElement> editCustomCategory(@Body Map<String,Object> map);

    //删除自定义标签分类
    @POST("hashtag/del_custom_category")
    Observable<JsonElement> delCustomCategory(@Body Map<String,Object> map);

    //获取自定义标签分类列表
    @POST("hashtag/get_custom_category")
    Observable<JsonElement> getCustomCategory(@Body Map<String,Object> map);

    //添加自定义标签详情
    @POST("hashtag/add_custom_detail")
    Observable<JsonElement> addCustomDetail(@Body Map<String,Object> map);

    //编辑自定义标签详情
    @POST("hashtag/edit_custom_detail")
    Observable<JsonElement> editCustomDetail(@Body Map<String,Object> map);

    //删除自定义标签详情
    @POST("hashtag/del_custom_detail")
    Observable<JsonElement> delCustomDetail(@Body Map<String,Object> map);

    //获取自定义标签详情
    @POST("hashtag/get_custom_detail")
    Observable<JsonElement> getCustomDetail(@Body Map<String,Object> map);

    //获取首页标签列表
    @POST("hashtag/index")
    Observable<JsonElement> getIndex(@Body Map<String,Object> map);

    //获取标签列表
    @POST("hashtag/tag_list")
    Observable<JsonElement> getTagList(@Body Map<String,Object> map);

    //获取标签详情
    @POST("hashtag/tag_info")
    Observable<JsonElement> getTagInfo(@Body Map<String,Object> map);

    //搜索标签
    @POST("hashtag/search")
    Observable<JsonElement> search(@Body Map<String,Object> map);

    //获取搜索标签详情
    @POST("hashtag/hashtag_detail")
    Observable<JsonElement> getHashtagDetail(@Body Map<String,Object> map);

    //搜索图片
    @POST("hashtag/search_pic")
    Observable<JsonElement> searchPic(@Body Map<String,Object> map);



}
