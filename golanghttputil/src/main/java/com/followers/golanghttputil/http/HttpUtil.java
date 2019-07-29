package com.followers.golanghttputil.http;


import com.followers.golanghttputil.bean.BuyCoinsBean;
import com.followers.golanghttputil.bean.BuyServiceBean;
import com.followers.golanghttputil.bean.CoinsBean;
import com.followers.golanghttputil.bean.IsRateBean;
import com.followers.golanghttputil.bean.OrderCoinsBean;
import com.followers.golanghttputil.bean.OrderServiceBean;
import com.followers.golanghttputil.bean.PayCallBackBean;
import com.followers.golanghttputil.bean.PayType;
import com.followers.golanghttputil.bean.RateAddCoinsBean;
import com.followers.golanghttputil.bean.ServiceBean;
import com.followers.golanghttputil.bean.ServiceType;
import com.followers.golanghttputil.bean.UserInfoBean;
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

    public static void getConfig(final HttpListener<String> listener) {

        Map<String, Object> map = new HashMap<>();

        Observable observable = new HttpRequest().getConfig(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                listener.onSuccess(s);

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




}

