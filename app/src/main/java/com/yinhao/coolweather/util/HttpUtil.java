package com.yinhao.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yinhao on 2017/8/30.
 */

public class HttpUtil {

    /**
     * 传入请求地址，注册一个回调来处理服务器响应
     *
     * @param address  url地址
     * @param callback 回调处理服务器响应
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


}
