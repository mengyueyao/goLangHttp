package com.meng.myhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.followers.golanghttputil.bean.ConfigBean;
import com.followers.golanghttputil.http.HttpListener;
import com.followers.golanghttputil.http.HttpUtil;
import com.followers.golanghttputil.util.Utils;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setContext(this);

        Utils.setDebug(true);

        HttpUtil.getConfig(new HttpListener<ConfigBean>() {
            @Override
            public void onSuccess(ConfigBean bean) {


            }

            @Override
            public void onError(String error) {

            }
        });



    }



}