package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import com.example.myapplication4.dataWeather.Weather;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherOfSelectedCity extends AppCompatActivity {
    ExpandableListView expandableListView;
    TextView tvPlaceName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_of_selected_city);
        expandableListView = findViewById(R.id.exp_lv);
        tvPlaceName = findViewById(R.id.tvSelectedCity);
        Intent curIntent=getIntent();
        String PlaceID = curIntent.getStringExtra("PlaceID");
        String PlaceName = curIntent.getStringExtra("PlaceName");
        tvPlaceName.setText(PlaceName);
        GetWeatherOfSelectedPlace(PlaceID, getApplicationContext());
    }

    public String FarToCel(String fahrenheit) {
       double Far = Double.parseDouble(fahrenheit);
       double Cel = ((5 * (Far - 32.0)) / 9.0);
       return Double.toString(Cel);
    }

    public void GetWeatherOfSelectedPlace(String PlaceID, Context mContext)
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dataservice.accuweather.com/forecasts/v1/daily/5day/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        WeatherApi weatherApi = retrofit.create(WeatherApi.class);
        Call<Weather> weather=weatherApi.GetWeatherData(PlaceID,"L8QcczWPIp8jALtGxGJeQfOtgHkRIkvH");

        weather.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {

                String groups[] = new String[5];
                for (int i = 0; i < 5; i++)
                {
                    groups[i] = response.body().getDailyForecasts()[i].getDate();
                }
                ArrayList<Map<String, String>> groupData;
                groupData = new ArrayList<Map<String, String>>();
                Map<String, String> m;

                for (String group:groups)
                {
                    m = new HashMap<String,String>();
                    m.put("Dates", group);
                    groupData.add(m);
                }

                String groupFrom[] = new String[] {"Dates"};
                int groupTo[] = new int[] {android.R.id.text1};
                ArrayList<ArrayList<Map<String, String>>> childData;
                childData = new ArrayList<ArrayList<Map<String, String>>>();
                ArrayList<Map<String, String>> childDataItem;

                childData = new ArrayList<ArrayList<Map<String, String>>>();
                for (int i = 0; i < groups.length; i++)
                {

                    childDataItem = new ArrayList<Map<String, String>>();
                    m = new HashMap<String, String>();
                    m.put("Temperature min","Temperature min:"+FarToCel(response.body()
                            .getDailyForecasts()[i].getTemperature().getMinimum().getValue()));
                    m.put("Temperature max", "Temperature max:"+FarToCel(response.body()
                            .getDailyForecasts()[i].getTemperature().getMaximum().getValue()));
                    childDataItem.add(m);
                    childData.add(childDataItem);
                }


                String childFrom[] = new String[] {"Temperature min","Temperature max"};
                int childTo[] = new int[] {android.R.id.text1, android.R.id.text2};

                SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter
                                (getApplicationContext(),groupData,android.R.layout
                                .simple_expandable_list_item_1,groupFrom,groupTo,childData,android
                                .R.layout.simple_list_item_2,childFrom,childTo);
                                expandableListView.setAdapter(adapter);

                Log.d("Weather", "onResponse: "+response.body().getDailyForecasts()
                        [0].getEpochDate());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });

    }

}
