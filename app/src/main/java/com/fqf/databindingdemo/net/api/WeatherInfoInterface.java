package com.fqf.databindingdemo.net.api;

import android.util.ArrayMap;

import com.fqf.databindingdemo.bean.WeatherInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by 房庆丰 on 2016/11/1.
 */

public interface WeatherInfoInterface {
    @GET("telematics/v3/weather")
    Call<WeatherInfo> getWeatherInfo(@QueryMap ArrayMap<String, String> params);
}
