package com.lnt.weather.data.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitProvider {
    public static final String BASE_URL="https://api.openweathermap.org/";


    public static RetrofitService getRetrofitService(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        return service;

    }
}
