package com.example.weather_elenora.remote_data;

import com.example.weather_elenora.models.Model;
import com.example.weather_elenora.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    String URL_KEY="e199e016b53ba334c0eb908066c587bb";

    @GET("data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);

    @GET("/data/2.5/weather?q=London&appid=e199e016b53ba334c0eb908066c587bb")
    Call<WeatherModel> getWeather(
            @Query("q") String name,
            @Query("appid") String key);




}









