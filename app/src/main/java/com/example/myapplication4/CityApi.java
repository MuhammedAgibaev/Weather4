package com.example.myapplication4;

import com.example.myapplication4.dataCity.City;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CityApi {
    @GET("search")
    Call <List<City>> GetPlaceID(@Query("apikey") String apiKey, @Query("q") String placeName);
}
