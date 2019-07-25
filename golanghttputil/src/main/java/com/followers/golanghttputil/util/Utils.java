package com.followers.golanghttputil.util;

import android.content.Context;

public class Utils {

    private static  Context mContext;

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {

        mContext = context;
    }
}
