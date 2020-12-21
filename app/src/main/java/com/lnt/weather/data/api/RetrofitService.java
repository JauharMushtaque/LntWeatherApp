package com.lnt.weather.data.api;


import com.lnt.weather.data.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//    https://api.openweathermap.org/data/2.5/weather?id=2643743&lang=cz&appid=bc10d6ad68e7a3728822d40e4716fe46
public interface RetrofitService {
    String appid="bc10d6ad68e7a3728822d40e4716fe46";
    @GET("data/2.5/weather")
    Call<WeatherData> getWeatherData(@Query("id") String id, @Query("lang") String lang, @Query("appid") String appid);

    /*@GET("{id}/{lang}/{appid}")
    Call<WeatherData> getWeatherData(@Path("id") String id, @Path("lang") String lang, @Query("appid") String appid);*/
}
