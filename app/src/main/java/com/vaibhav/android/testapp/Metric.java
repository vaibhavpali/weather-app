package com.vaibhav.android.testapp;

import com.google.gson.annotations.SerializedName;

class Metric {

    @SerializedName("max_temp")
    private String maxTemp;

    @SerializedName("min_temp")
    private String minTemp;

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }
}
