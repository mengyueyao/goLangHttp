package com.followers.golanghttputil.http;


import com.followers.golanghttputil.bean.BuyCoinsBean;
import com.followers.golanghttputil.bean.BuyServiceBean;
import com.followers.golanghttputil.bean.CoinsBean;
import com.followers.golanghttputil.bean.ConfigBean;
import com.followers.golanghttputil.bean.ConsumeBean;
import com.followers.golanghttputil.bean.IsRateBean;
import com.followers.golanghttputil.bean.LotteryBuyBean;
import com.followers.golanghttputil.bean.OrderCoinsBean;
import com.followers.golanghttputil.bean.OrderServiceBean;
import com.followers.golanghttputil.bean.ParseBean;
import com.followers.golanghttputil.bean.PayCallBackBean;
import com.followers.golanghttputil.bean.PayType;
import com.followers.golanghttputil.bean.ProductBean;
import com.followers.golanghttputil.bean.RateAddCoinsBean;
import com.followers.golanghttputil.bean.RewardBean;
import com.followers.golanghttputil.bean.ServiceBean;
import com.followers.golanghttputil.bean.ServiceType;
import com.followers.golanghttputil.bean.SubVipBean;
import com.followers.golanghttputil.bean.UserInfoBean;
import com.followers.golanghttputil.bean.VipBean;
import com.followers.golanghttputil.http.request.HttpRequest;
import com.followers.golanghttputil.http.request.RequestManager;
import com.followers.golanghttputil.util.GsonUtil;

import java.util.HashMap;
import java.util.Map;

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

    public  static void getSubscriptionList(final HttpListener<VipBean> listener){

        Map<String,Object> map = new HashMap<>();

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

    public  static void createSubscriber(String token,String user_pk,String google_pay_id,String is_upgrade,final HttpListener<SubVipBean> listener){

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


}

