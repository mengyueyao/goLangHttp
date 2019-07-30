package com.meng.myhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.followers.golanghttputil.http.HttpListener;
import com.followers.golanghttputil.http.HttpUtil;
import com.followers.golanghttputil.util.Utils;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setContext(this);

        HttpUtil.Consume("6060192636", 1000000 + "", new HttpListener<Integer>() {
            @Override
            public void onSuccess(Integer bean) {

                Log.e("xxxxx",bean+"==");
            }

            @Override
            public void onError(String error) {

            }
        });


    }



}