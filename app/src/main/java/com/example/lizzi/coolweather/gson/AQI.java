package com.example.lizzi.coolweather.gson;

/**
 * Created by LiZzi on 2018/7/21.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
