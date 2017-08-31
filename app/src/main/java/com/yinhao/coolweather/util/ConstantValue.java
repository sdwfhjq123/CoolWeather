package com.yinhao.coolweather.util;

/**
 * Created by yinhao on 2017/8/30.
 */

public class ConstantValue {
    /**
     * 全国省市区的url
     */
    public static final String PLACE_URL = "http://guolin.tech/api/china/";

    public static final String BING_PIC_URL = "http://guolin.tech/api/bing_pic";

    /**
     * 根据传入的id值获取weatherUrl
     *
     * @param weatherId
     * @return
     */
    public static String getWeatherUrl(String weatherId) {
        return "http://guolin.tech/api/weather?cityid=" + weatherId + "&key=b5057a7cc20043ba86d71c81042c08de";
    }
}
