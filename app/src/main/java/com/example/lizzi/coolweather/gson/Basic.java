package com.example.lizzi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiZzi on 2018/7/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
