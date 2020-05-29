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


    /**
     * 获取用户信息
     * @param map
     * @return
     */
    public Observable<JsonElement> getUserInfo(Map<String,Object> map){

        return observable(httpService.getUserInfo(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 获取广告奖励
     * @param map
     * @return
     */
    public Observable<JsonElement> getReward(Map<String,Object> map){

        return observable(httpService.getReward(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 解锁模块消费金币
     * @param map
     * @return
     */
    public Observable<JsonElement> Consume(Map<String,Object> map){

        return observable(httpService.Consume(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 获取活动商品
     * @param map
     * @return
     */
    public Observable<JsonElement> getProduct(Map<String,Object> map){

        return observable(httpService.getProduct(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 获取订阅商品列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getSubscriptionList(Map<String,Object> map){

        return observable(httpService.getSubscriptionList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 创建paypal订阅
     * @param map
     * @return
     */
    public Observable<JsonElement> createPaypalSubscriber(Map<String,Object> map){

        return observable(httpService.createPaypalSubscriber(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * paypal购买活动商品
     * @param map
     * @return
     */
    public Observable<JsonElement> lotteryBuy(Map<String,Object> map){

        return observable(httpService.lotteryBuy(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * google购买活动商品
     * @param map
     * @return
     */
    public Observable<JsonElement> google_successful(Map<String,Object> map){

        return observable(httpService.google_successful(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }



    /**
     * 创建google订阅
     * @param map
     * @return
     */
    public Observable<JsonElement> createSubscriber(Map<String,Object> map){

        return observable(httpService.createSubscriber(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     * 根据网页信息获取用户信息或者帖子
     * @param map
     * @return
     */
    public Observable<JsonElement> parse(Map<String,Object> map){

        return observable(httpService.parse(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }



    /**
     * 点赞订阅
     * @param map
     * @return
     */
    public Observable<JsonElement> createLikesSubscriber(Map<String,Object> map){

        return observable(httpService.createLikesSubscriber(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 添加自定义分类
     * @param map
     * @return
     */
    public Observable<JsonElement> addCustomCategory(Map<String,Object> map){

        return observable(httpService.addCustomCategory(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 修改自定义分类
     * @param map
     * @return
     */
    public Observable<JsonElement> editCustomCategory(Map<String,Object> map){

        return observable(httpService.editCustomCategory(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 删除自定义分类
     * @param map
     * @return
     */
    public Observable<JsonElement> delCustomCategory(Map<String,Object> map){

        return observable(httpService.delCustomCategory(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 获取自定义分类列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getCustomCategory(Map<String,Object> map){

        return observable(httpService.getCustomCategory(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 添加自定义分类详情
     * @param map
     * @return
     */
    public Observable<JsonElement> addCustomDetail(Map<String,Object> map){

        return observable(httpService.addCustomDetail(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 删除自定义分类详情
     * @param map
     * @return
     */
    public Observable<JsonElement> delCustomDetail(Map<String,Object> map){

        return observable(httpService.delCustomDetail(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 修改自定义分类详情
     * @param map
     * @return
     */
    public Observable<JsonElement> editCustomDetail(Map<String,Object> map){

        return observable(httpService.editCustomDetail(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 查询自定义分类详情
     * @param map
     * @return
     */
    public Observable<JsonElement> getCustomDetail(Map<String,Object> map){

        return observable(httpService.getCustomDetail(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 获取首页标签列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getIndex(Map<String,Object> map){

        return observable(httpService.getIndex(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 获取标签列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getTagList(Map<String,Object> map){

        return observable(httpService.getTagList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 获取标签详情
     * @param map
     * @return
     */
    public Observable<JsonElement> getTagInfo(Map<String,Object> map){

        return observable(httpService.getTagInfo(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 搜索标签
     * @param map
     * @return
     */
    public Observable<JsonElement> search(Map<String,Object> map){

        return observable(httpService.search(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 获取搜索标签详情
     * @param map
     * @return
     */
    public Observable<JsonElement> getHashtagDetail(Map<String,Object> map){

        return observable(httpService.getHashtagDetail(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 搜索图片
     * @param map
     * @return
     */
    public Observable<JsonElement> searchPic(Map<String,Object> map){

        return observable(httpService.searchPic(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 安装app奖励
     * @param map
     * @return
     */
    public Observable<JsonElement> install(Map<String,Object> map){

        return observable(httpService.install(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }



    /**
     * 获取发现列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getDiscovery(Map<String,Object> map){

        return observable(httpService.getDiscovery(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 购买发现服务
     * @param map
     * @return
     */
    public Observable<JsonElement> buyDiscoveryServive(Map<String,Object> map){

        return observable(httpService.buyDiscoveryServive(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }


    /**
     * 获取tiktok帖子列表
     * @param map
     * @return
     */
    public Observable<JsonElement> getTiktokPost(Map<String,Object> map){

        return observable(httpService.getTiktokPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }

    /**
     * 获取tiktok用户信息
     * @param map
     * @return
     */
    public Observable<JsonElement> getTiktokUserInfo(Map<String,Object> map){

        return observable(httpService.getTiktokUserInfo(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {

                return s;
            }
        });
    }
}
