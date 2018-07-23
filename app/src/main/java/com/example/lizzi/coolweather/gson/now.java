package com.example.lizzi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiZzi on 2018/7/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("comd")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
