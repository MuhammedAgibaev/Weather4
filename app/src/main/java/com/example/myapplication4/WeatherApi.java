package com.example.myapplication4;

import com.example.myapplication4.dataWeather.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("{PlaceID}")
    Call<Weather> GetWeatherData(@Path("PlaceID") String url, @Query("apikey") String apiKey);
}
