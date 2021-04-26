package com.vaibhav.android.testapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecasts {
    @SerializedName("forecasts")
    private List<Forecast> mForecastList;

    public List<Forecast> getmForecastList() {
        return mForecastList;
    }

    public void setmForecastList(List<Forecast> mForecastList) {
        this.mForecastList = mForecastList;
    }
}
