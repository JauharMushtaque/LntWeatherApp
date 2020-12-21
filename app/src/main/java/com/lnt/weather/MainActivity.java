package com.lnt.weather;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.lnt.weather.data.api.RetrofitProvider;
import com.lnt.weather.data.api.RetrofitService;
import com.lnt.weather.data.model.WeatherData;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWeather(View view) {
        RetrofitService retrofitService = RetrofitProvider.getRetrofitService();
//        id=2643743&lang=cz&appid=bc10d6ad68e7a3728822d40e4716fe46
        Call<WeatherData> weatherData = retrofitService.getWeatherData("2643743", "en", "bc10d6ad68e7a3728822d40e4716fe46");
        Log.d(TAG, "Weather data.." +weatherData);
        weatherData.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                Log.d(TAG, "onResponse: ");
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {

            }
        });
    }
}