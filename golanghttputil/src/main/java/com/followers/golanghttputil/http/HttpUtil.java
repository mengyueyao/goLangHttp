package com.followers.golanghttputil.http;


import android.app.Activity;
import android.content.Context;

import com.bumptech.glide.Glide;
import com.followers.golanghttputil.bean.AddFollowers;
import com.followers.golanghttputil.bean.BuyCoinsBean;
import com.followers.golanghttputil.bean.BuyServiceBean;
import com.followers.golanghttputil.bean.CoinsBean;
import com.followers.golanghttputil.bean.CommBean;
import com.followers.golanghttputil.bean.ConfigBean;
import com.followers.golanghttputil.bean.ConsumeBean;
import com.followers.golanghttputil.bean.CustomCategoryBean;
import com.followers.golanghttputil.bean.CustomDetailBean;
import com.followers.golanghttputil.bean.DiscoveryBean;
import com.followers.golanghttputil.bean.FollowersVipList;
import com.followers.golanghttputil.bean.GetTagsBean;
import com.followers.golanghttputil.bean.GetUserFollowersBean;
import com.followers.golanghttputil.bean.HasTagDetailBean;
import com.followers.golanghttputil.bean.IndexBean;
import com.followers.golanghttputil.bean.IsRateBean;
import com.followers.golanghttputil.bean.LotteryBuyBean;
import com.followers.golanghttputil.bean.OrderCoinsBean;
import com.followers.golanghttputil.bean.OrderServiceBean;
import com.followers.golanghttputil.bean.ParseBean;
import com.followers.golanghttputil.bean.PayCallBackBean;
import com.followers.golanghttputil.bean.PayType;
import com.followers.golanghttputil.bean.ProductBean;
import com.followers.golanghttputil.bean.RateAddCoinsBean;
import com.followers.golanghttputil.bean.RemovewaterMarkBean;
import com.followers.golanghttputil.bean.RewardBean;
import com.followers.golanghttputil.bean.SaveTagsBean;
import com.followers.golanghttputil.bean.SearchBean;
import com.followers.golanghttputil.bean.ServiceBean;
import com.followers.golanghttputil.bean.ServiceType;
import com.followers.golanghttputil.bean.SubVipBean;
import com.followers.golanghttputil.bean.SubscriptType;
import com.followers.golanghttputil.bean.TagListBean;
import com.followers.golanghttputil.bean.TagsInfoBean;
import com.followers.golanghttputil.bean.TiktokPostBean;
import com.followers.golanghttputil.bean.TiktokUserInfoBean;
import com.followers.golanghttputil.bean.UserInfoBean;
import com.followers.golanghttputil.bean.VipBean;
import com.followers.golanghttputil.bean.VipStatusBean;
import com.followers.golanghttputil.http.request.HttpRequest;
import com.followers.golanghttputil.http.request.RequestManager;
import com.followers.golanghttputil.util.GsonUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import mobile.Mobile;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Observable;

public class HttpUtil {

    //获取金币列表
    public static void getCoinsList(final HttpListener<CoinsBean> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getGoods(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CoinsBean coinsBean = GsonUtil.format(s,CoinsBean.class);

                if(null != coinsBean){

                    listener.onSuccess(coinsBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取配置文件

    public static void getConfig(final HttpListener<ConfigBean> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getConfig(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                ConfigBean configBean = GsonUtil.format(s,ConfigBean.class);

                if(null != configBean){

                    listener.onSuccess(configBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //登录

    public static void login(String user_pk,String username,String avatar,final HttpListener<UserInfoBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("user_name", username);
        map.put("cover", avatar);
        Observable observable = new HttpRequest().login(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                UserInfoBean userInfoBean = GsonUtil.format(s,UserInfoBean.class);

                if(null != userInfoBean){

                    listener.onSuccess(userInfoBean);
                }


            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //金币订单列表

    public static void getCoinsOrder(String user_pk,final HttpListener<OrderCoinsBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getCoinsOrder(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                OrderCoinsBean orderCoinsBean = GsonUtil.format(s,OrderCoinsBean.class);

                if(null != orderCoinsBean){

                    listener.onSuccess(orderCoinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //购买金币下单
    public static void buyCoins(String user_pk, String productId, PayType  payType,final HttpListener<BuyCoinsBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("product_id", productId);
        map.put("pay_type", payType.getValue());
        Observable observable = new HttpRequest().buyCoins(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                BuyCoinsBean buyCoinsBean = GsonUtil.format(s,BuyCoinsBean.class);

                if(null != buyCoinsBean){

                    listener.onSuccess(buyCoinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //支付成功回调
    public static void payCallback(String user_pk,String token, String google_pay_id,final HttpListener<Integer> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk", user_pk);
        map.put("google_pay_id",google_pay_id);
        map.put("token", token);
        Observable observable = new HttpRequest().payCallback(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                PayCallBackBean payCallBackBean = GsonUtil.format(s,PayCallBackBean.class);

                if(null != payCallBackBean){

                    if(null != payCallBackBean.getData() && payCallBackBean.getData().equals("success") && payCallBackBean.isStatus()){

                        listener.onSuccess(1);
                    }else{

                        listener.onSuccess(0);
                    }
                }


            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //服务列表
    public static void getServiceList(ServiceType type, final HttpListener<ServiceBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("product_type", type.getValue());
        Observable observable = new HttpRequest().getServiceList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                ServiceBean serviceBean = GsonUtil.format(s,ServiceBean.class);

                if(null != serviceBean){

                    listener.onSuccess(serviceBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //购买服务
    public static void buyService(String user_pk, int serviceId, String url,String cover,final HttpListener<Integer> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk", user_pk);
        map.put("product_id", String.valueOf(serviceId));
        map.put("url", url);
        map.put("cover", cover);
        Observable observable = new HttpRequest().buyService(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                BuyServiceBean buyServiceBean = GsonUtil.format(s,BuyServiceBean.class);

                if(null != buyServiceBean){

                    if(null != buyServiceBean.getData() && buyServiceBean.isStatus() && buyServiceBean.getMessage().equals("OK")){

                        listener.onSuccess(1);
                    }

                    if(buyServiceBean.getMessage().equals("Insufficient balance")){ //金币不足

                        listener.onSuccess(0);

                    }

                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //服务订单列表
    public static void getServiceOder(String user_pk,final HttpListener<OrderServiceBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getServiceOder(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                OrderServiceBean orderServiceBean = GsonUtil.format(s,OrderServiceBean.class);

                if(null != orderServiceBean){

                    listener.onSuccess(orderServiceBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //好评加金币
    public static void rateAddCoins(String user_pk,final HttpListener<RateAddCoinsBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().rateAddCoins(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                RateAddCoinsBean rateAddCoinsBean = GsonUtil.format(s,RateAddCoinsBean.class);

                if(null != rateAddCoinsBean){

                    listener.onSuccess(rateAddCoinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //用户是否好评
    public static void getIsRate(String user_pk,final HttpListener<Integer> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getIsRate(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                IsRateBean isRateBean = GsonUtil.format(s,IsRateBean.class);

                if(null != isRateBean){

                    if(isRateBean.isStatus()){ //没有好评过,可以好评

                        listener.onSuccess(1);

                    }else{ //已经好评过,不可以好评

                        listener.onSuccess(0);
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取用户信息
    public static void getUserInfo(String user_pk,final HttpListener<UserInfoBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getUserInfo(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                UserInfoBean userInfoBean = GsonUtil.format(s,UserInfoBean.class);

                if(null != userInfoBean){

                    listener.onSuccess(userInfoBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取广告奖励
    public static void getReward(String user_pk,String start_time,String end_time,final HttpListener<Integer> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("start_time",start_time);
        map.put("end_time",end_time);
        Observable observable = new HttpRequest().getReward(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                RewardBean rewardBean = GsonUtil.format(s,RewardBean.class);

                if(null != rewardBean){

                    listener.onSuccess(rewardBean.getData());
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //消耗金币 解锁模块
    public static void Consume(String user_pk,String coins,final HttpListener<Integer> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("currency",coins);
        Observable observable = new HttpRequest().Consume(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                ConsumeBean consumeBean = GsonUtil.format(s,ConsumeBean.class);

                if(null != consumeBean){

                    if(consumeBean.isStatus()){

                        listener.onSuccess(1);
                    }

                    if(consumeBean.getMessage().equals("Insufficient balance")){

                        listener.onSuccess(0);
                    }
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //获取活动商品

    public  static void getProduct(final HttpListener<ProductBean> listener){

        Map<String,Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getProduct(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                ProductBean bean = GsonUtil.format(s,ProductBean.class);

                if(null != bean){

                    listener.onSuccess(bean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取订阅商品列表

    public  static void getSubscriptionList(SubscriptType SubscriptType,final HttpListener<VipBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("type",SubscriptType.getValue());

        Observable observable = new HttpRequest().getSubscriptionList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                VipBean vipBean = GsonUtil.format(s,VipBean.class);

                if(null != vipBean){

                    listener.onSuccess(vipBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //添加订阅

    public  static void createPaypalSubscriber(String plan_id,String user_pk,String user_name,final HttpListener<SubVipBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("plan_id",plan_id);

        map.put("user_pk",user_pk);

        map.put("user_name",user_name);

        Observable observable = new HttpRequest().createPaypalSubscriber(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }



    //活动支付成功回调
    public static void googleCallback(String user_pk,String token, String google_pay_id,final HttpListener<LotteryBuyBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk", user_pk);
        map.put("google_pay_id",google_pay_id);
        map.put("token", token);
        Observable observable = new HttpRequest().google_successful(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LotteryBuyBean lotteryBuyBean = GsonUtil.format(s,LotteryBuyBean.class);

                if(null != lotteryBuyBean){

                    listener.onSuccess(lotteryBuyBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }



    //paypal购买活动商品
    public static void lotteryBuy(String product_id,String user_pk,final HttpListener<LotteryBuyBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("product_id", product_id);
        map.put("user_pk",user_pk);
        map.put("pay_type", "1");
        Observable observable = new HttpRequest().lotteryBuy(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LotteryBuyBean lotteryBuyBean = GsonUtil.format(s,LotteryBuyBean.class);

                if(null != lotteryBuyBean){

                    listener.onSuccess(lotteryBuyBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //添加订阅

    public  static void createFollowersSubscriber(String token,String user_pk,String google_pay_id,String is_upgrade,final HttpListener<SubVipBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("token",token);

        map.put("google_pay_id",google_pay_id);

        map.put("is_upgrade",is_upgrade);

        Observable observable = new HttpRequest().createSubscriber(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //根据网页内容获取用户信息或者帖子

    public static void parse(boolean is_first, String data, String userpk, final HttpListener<ParseBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("is_first",is_first+"");

        map.put("data",data);

        map.put("user_pk",userpk);

        Observable observable = new HttpRequest().parse(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                ParseBean parseBean = GsonUtil.format(s,ParseBean.class);

                if(null != parseBean){

                    listener.onSuccess(parseBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }
        }.post(observable);

    }



    //添加订阅

    public  static void createLikesSubscriber(String token,String user_pk,String google_pay_id,String is_upgrade,final HttpListener<SubVipBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("token",token);

        map.put("google_pay_id",google_pay_id);

        map.put("is_upgrade",is_upgrade);

        Observable observable = new HttpRequest().createSubscriber(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //添加自定义分类列表

    public  static void addCustomCategory(String title,String user_pk,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("title",title);

        Observable observable = new HttpRequest().addCustomCategory(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //修改自定义分类列表

    public  static void editCustomCategory(String title,String user_pk,String id,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("title",title);

        map.put("id",id);

        Observable observable = new HttpRequest().editCustomCategory(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }



    //删除自定义分类列表

    public  static void delCustomCategory(String id,String user_pk,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("id",id);

        Observable observable = new HttpRequest().delCustomCategory(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取自定义分类列表

    public  static void getCustomCategory(String user_pk,final HttpListener<CustomCategoryBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        Observable observable = new HttpRequest().getCustomCategory(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CustomCategoryBean customCategoryBean = GsonUtil.format(s,CustomCategoryBean.class);

                if(null != customCategoryBean){

                    listener.onSuccess(customCategoryBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //添加自定义分类详情

    public  static void addCustomDetail(String detail,String user_pk,String category_id,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("detail",detail);

        map.put("category_id",category_id);

        Observable observable = new HttpRequest().addCustomDetail(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //编辑自定义分类详情

    public  static void editCustomDetail(String detail,String user_pk,String category_id,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("detail",detail);

        map.put("category_id",category_id);

        Observable observable = new HttpRequest().editCustomDetail(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //删除自定义分类详情

    public  static void delCustomDetail(String id,String user_pk,final HttpListener<Boolean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("id",id);

        Observable observable = new HttpRequest().delCustomDetail(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(subVipBean.isStatus());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //查询自定义分类详情

    public  static void getCustomDetail(String id,final HttpListener<CustomDetailBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("id",id);

        Observable observable = new HttpRequest().getCustomDetail(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                CustomDetailBean customDetailBean = GsonUtil.format(s,CustomDetailBean.class);

                if(null != customDetailBean){

                    listener.onSuccess(customDetailBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取首页标签列表
    public  static void getIndex(final HttpListener<IndexBean> listener){

        Map<String,Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getIndex(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                IndexBean indexBean = GsonUtil.format(s,IndexBean.class);

                if(null != indexBean){

                    listener.onSuccess(indexBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取标签列表
    public  static void getTagList(String title,final HttpListener<TagListBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("title",title);

        Observable observable = new HttpRequest().getTagList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TagListBean tagListBean = GsonUtil.format(s,TagListBean.class);

                if(null != tagListBean){

                    listener.onSuccess(tagListBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取标签详细
    public  static void getTagInfo(String tag,final HttpListener<TagsInfoBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("tag",tag);

        Observable observable = new HttpRequest().getTagInfo(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TagsInfoBean tagsInfoBean = GsonUtil.format(s,TagsInfoBean.class);

                if(null != tagsInfoBean){

                    listener.onSuccess(tagsInfoBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //搜索标签
    public  static void search(String key,final HttpListener<SearchBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("key",key);

        Observable observable = new HttpRequest().search(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SearchBean searchBean = GsonUtil.format(s,SearchBean.class);

                if(null != searchBean){

                    listener.onSuccess(searchBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //获取搜索标签详情
    public  static void getHashtagDetail(String url,final HttpListener<HasTagDetailBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("url",url);

        Observable observable = new HttpRequest().getHashtagDetail(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                HasTagDetailBean hasTagDetailBean = GsonUtil.format(s,HasTagDetailBean.class);

                if(null != hasTagDetailBean){

                    listener.onSuccess(hasTagDetailBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    public  static void searchPic(String key,final HttpListener<String> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("key",key);

        Observable observable = new HttpRequest().searchPic(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean){

                    listener.onSuccess(s);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //安装app奖励
    public  static void install(String user_pk,String package_name,final HttpListener<String> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("package_name",package_name);

        Observable observable = new HttpRequest().install(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(null != subVipBean && subVipBean.isStatus()){

                    listener.onSuccess(subVipBean.getData());
                }else{

                    listener.onError(subVipBean.getMessage());
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }



    //获取发现服务
    public  static void getDiscovery(final HttpListener<DiscoveryBean> listener){

        Map<String,Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getDiscovery(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                DiscoveryBean discoveryBean = GsonUtil.format(s,DiscoveryBean.class);

                if(null != discoveryBean){

                    listener.onSuccess(discoveryBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }



    //购买发现服务
    public  static void buyDiscoveryServive(String user_pk,String product_id,String url,String count,final HttpListener<Integer> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",user_pk);

        map.put("product_id",product_id);

        map.put("url",url);

        map.put("count",count);

        Observable observable = new HttpRequest().buyDiscoveryServive(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SubVipBean subVipBean = GsonUtil.format(s,SubVipBean.class);

                if(subVipBean.isStatus()){

                    listener.onSuccess(0);

                }else if(!subVipBean.isStatus() && subVipBean.getMessage().equals("Insufficient balance")){

                    listener.onSuccess(1);

                }else{

                    listener.onSuccess(2);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取tiktok帖子
    public  static void getTiktokPost(String username,String userId,final HttpListener<TiktokPostBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_name",username);

        map.put("user_id",userId);

        Observable observable = new HttpRequest().getTiktokPost(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TiktokPostBean tiktokPostBean = GsonUtil.format(s,TiktokPostBean.class);

                if(null != tiktokPostBean){

                    listener.onSuccess(tiktokPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取tiktok用户信息
    public  static void getTiktoUserinfo(String username,final HttpListener<TiktokUserInfoBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_name",username);

        Observable observable = new HttpRequest().getTiktokUserInfo(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                TiktokUserInfoBean tiktokUserInfoBean = GsonUtil.format(s,TiktokUserInfoBean.class);

                if(null != tiktokUserInfoBean){

                    listener.onSuccess(tiktokUserInfoBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //去水印
    public  static void removeWaterMark(String userpk,String username,String url,final HttpListener<RemovewaterMarkBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("video_url",url);

        map.put("user_pk",userpk);

        map.put("user_name",username);

        Observable observable = new HttpRequest().removeWaterMark(map);

        new RequestManager() {
            @Override
            public void success(String s) {


                RemovewaterMarkBean removewaterMarkBean = GsonUtil.format(s,RemovewaterMarkBean.class);

                if(null != removewaterMarkBean){

                    listener.onSuccess(removewaterMarkBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //添加用户粉丝数量
    public  static void addFollowers(String userpk,String follower_count,final HttpListener<AddFollowers> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        map.put("follower_count",follower_count);

        Observable observable = new HttpRequest().addFollowers(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                AddFollowers addFollowers = GsonUtil.format(s,AddFollowers.class);

                if(null != addFollowers){

                    listener.onSuccess(addFollowers);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取用户粉丝数量
    public  static void getUserFollowers(String userpk,int days ,final HttpListener<GetUserFollowersBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        map.put("days",days+"");

        Observable observable = new HttpRequest().getUserFollowers(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                GetUserFollowersBean getUserFollowersBean = GsonUtil.format(s,GetUserFollowersBean.class);

                if(null != getUserFollowersBean){

                    listener.onSuccess(getUserFollowersBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //获取金币vip列表
    public  static void getFollowersVipList(final HttpListener<FollowersVipList> listener){

        Map<String,Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getFollowersVipList(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                FollowersVipList followersVipList = GsonUtil.format(s,FollowersVipList.class);

                if(null != followersVipList){

                    listener.onSuccess(followersVipList);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }


    //购买金币vip
    public  static void buyFollowersVip(String userpk,int product_id ,final HttpListener<AddFollowers> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        map.put("product_id",product_id+"");

        Observable observable = new HttpRequest().buyFollowersVip(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                AddFollowers addFollowers = GsonUtil.format(s,AddFollowers.class);

                if(null != addFollowers){

                    listener.onSuccess(addFollowers);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //购买金币vip的状态
    public  static void buyFollowersStatus(String userpk,final HttpListener<VipStatusBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        Observable observable = new HttpRequest().buyFollowersStatus(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                VipStatusBean vipStatusBean = GsonUtil.format(s,VipStatusBean.class);

                if(null != vipStatusBean){

                    listener.onSuccess(vipStatusBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //上传图片
    public static void uploadImage(final Context context, final String imageUrl , final HttpListener<CommBean> listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                File file = null;
                try {
                    file = Glide.with(context)
                            .load(imageUrl)
                            .downloadOnly(200, 200)
                            .get();
                    //上传图片需要MultipartBody
                    RequestBody requestBody = RequestBody.create(MediaType.parse("image/jpg"), file);
                    MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName()+".jpg", requestBody);
                    RetrofitUtils.getInstance().upLoadImage(body).setHttpListener(new RetrofitUtils.HttpListener() {
                        @Override
                        public void onSuccess(String jsonStr) {

                            final CommBean commBean = GsonUtil.format(Mobile.decrypt(jsonStr),CommBean.class);

                            if(null != commBean){

                                ((Activity)context).runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

                                        listener.onSuccess(commBean);
                                    }
                                });

                            }

                        }

                        @Override
                        public void onError(final String error) {
                            ((Activity)context).runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    listener.onError(error);
                                }
                            });
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    //保存标签
    public  static void saveTags(String userpk,String imageurl,String title,String content,final HttpListener<SaveTagsBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        map.put("content",content);

        map.put("title",title);

        map.put("image",imageurl);

        Observable observable = new HttpRequest().saveTags(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                SaveTagsBean saveTagsBean = GsonUtil.format(s,SaveTagsBean.class);

                if(null != saveTagsBean){

                    listener.onSuccess(saveTagsBean);
                }


            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

    //获取标签
    public  static void getTags(String userpk,final HttpListener<GetTagsBean> listener){

        Map<String,Object> map = new HashMap<>();

        map.put("user_pk",userpk);

        Observable observable = new HttpRequest().getTags(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                GetTagsBean getTagsBean = GsonUtil.format(s,GetTagsBean.class);

                if(null != getTagsBean){

                    listener.onSuccess(getTagsBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);

            }
        }.post(observable);

    }

}

