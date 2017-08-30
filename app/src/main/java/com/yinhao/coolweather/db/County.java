package com.yinhao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yinhao on 2017/8/30.
 * countyName记录县的名字
 * weatherId记录县所对应的天气id
 * cityId记录当前县所属市的id值
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
