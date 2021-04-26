package com.vaibhav.android.testapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>{

    private Forecasts mForecasts;


    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflate = inflater.inflate(R.layout.list_item, parent, false);
        return new ForecastViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder holder, int position) {
        List<Forecast> forecasts = getData();
    }

    public void filterData(FilterType type) {
        if(type == FilterType.WEEKEND) {
            // Loopin list for search weend
            // here i will update apadter data
            List<Forecast> filteredList = new ArrayList<>();
            for(Forecast forecastdata : mForecasts.getmForecastList()) {
                if(forecastdata.getDay().equalsIgnoreCase("sunday") ||
                        forecastdata.getDay().equalsIgnoreCase("saturday")) {
                    if(forecastdata.getMetric() != null){
                        int minTemp = Integer.parseInt(forecastdata.getMetric().getMinTemp());
                        int maxTemp = Integer.parseInt(forecastdata.getMetric().getMaxTemp());
                        if ( minTemp >= 19 && maxTemp <= 20) {
                            filteredList.add(forecastdata);
                        }
                    }
                }
            }

        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ForecastViewHolder extends RecyclerView.ViewHolder {

        TextView day;
        TextView dayType;
        TextView minTemp;
        TextView maxTemp;

        public ForecastViewHolder(@NonNull View itemView) {
            super(itemView);
            day = itemView.findViewById(R.id.textDay);
            dayType = itemView.findViewById(R.id.dayType);
            minTemp = itemView.findViewById(R.id.txtMininumValue);
            maxTemp = itemView.findViewById(R.id.txtMaxValue);
        }
    }

    private List<Forecast> getData() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("forecast_data.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
