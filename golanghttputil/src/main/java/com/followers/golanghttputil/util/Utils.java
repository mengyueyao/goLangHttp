package com.followers.golanghttputil.util;

import android.content.Context;

public class Utils {

    private static  Context mContext;

    private static boolean debug;

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {

        mContext = context;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        Utils.debug = debug;
    }
}
