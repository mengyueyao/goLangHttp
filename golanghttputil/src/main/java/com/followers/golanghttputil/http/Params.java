package com.followers.golanghttputil.http;


import com.followers.golanghttputil.util.Utils;

import org.json.JSONObject;

import java.util.Map;

import mobile.Mobile;

public class Params {

    public static String params(Map<String,Object> map){

        JSONObject jsonObject = new JSONObject();

        String encode = "";

        try {
            jsonObject.put("platform", "1").toString();
            jsonObject.put("package_name",Utils.getContext().getPackageName()).toString();

            for (String key:map.keySet()
                    ) {
                jsonObject.put(key,map.get(key).toString());
            }

            encode = Mobile.encrypt(jsonObject.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }


        return encode;

    }
}
