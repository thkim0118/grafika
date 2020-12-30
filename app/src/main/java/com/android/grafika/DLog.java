package com.android.grafika;

import android.util.Log;

/*
 * Created by kth on 2020-11-04.
 */
public class DLog {
    private static final String TAG = "Thkim";

    public static void d(String msg) {
        Log.d(TAG, buildLogMsg(msg));
    }

    public static void s() {
        Log.d(TAG, buildLogMsg("-----> Start"));
    }

    public static void e() {
        Log.d(TAG, buildLogMsg("<----- End"));
    }

    private static String buildLogMsg(String msg) {
       StackTraceElement ste = Thread.currentThread().getStackTrace()[4];

       return "[ " +
               ste.getFileName().replace(".java", "") +
               "::" +
               ste.getMethodName() +
               " ]" +
               msg;
    }
}
