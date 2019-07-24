package com.example.myapplication4;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication4.dataCity.City;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public  class CityCardAdapter extends RecyclerView.Adapter<CityCardAdapter.MyViewHolder> {

    private CardView cardView;
    private Context mContext;
    private String[] CityNames;
    private String CityName;
    public String placeID;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textView;
        public MyViewHolder(final View view)
        {
            super(view);
            cardView = view.findViewById(R.id.card_view);
            textView = view.findViewById(R.id.tvCity);
            view.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v2)
                {
                    GetPlaceIDOfSelectedPlace(textView.getText().toString(),view.getContext());
                }
            }
            );
        }
    }

    public CityCardAdapter(Context mContext, String[] CityName)
    {
        this.mContext = mContext;
        this.CityNames = CityName;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
    View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.city_card,parent,false);
    return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position)
    {
        CityName=CityNames[position];
        holder.textView.setText(CityName);
    }

    @Override
    public int getItemCount() {
        return CityNames.length;
    }

    public void GetPlaceIDOfSelectedPlace(final String placeName, final Context mContext)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dataservice.accuweather.com/locations/v1/cities/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CityApi cityApi = retrofit.create(CityApi.class);
      //  Log.d("Weather", "onResponse: " + placeName);
        Call<List<City>> city = cityApi.GetPlaceID("L8QcczWPIp8jALtGxGJeQfOtgHkRIkvH",placeName);

        city.enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
                Log.d("Weather", "onResponse: "+response.body().get(0).getEnglishName());
                Intent intent=new Intent(mContext,WeatherOfSelectedCity.class);
                intent.putExtra("PlaceID", response.body().get(0).getKey());
                intent.putExtra("PlaceName",response.body().get(0).getEnglishName());
                mContext.startActivity(intent);
            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {
                Log.d("Weather", "onResponse: "+t.toString());
            }
        });

    }

}
