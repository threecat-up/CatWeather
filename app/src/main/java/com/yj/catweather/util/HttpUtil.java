package com.yj.catweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Create by jhu on 2021/3/23
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}