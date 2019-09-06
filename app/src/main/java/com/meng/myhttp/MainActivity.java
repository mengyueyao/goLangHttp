package com.meng.myhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.followers.golanghttputil.util.Utils;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setContext(this);

        Utils.setDebug(true);


    }



}