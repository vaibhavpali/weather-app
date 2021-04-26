package com.vaibhav.android.testapp;

import com.google.gson.annotations.SerializedName;

class Forecast {

    @SerializedName("day")
    private String day;

    @SerializedName("fcst_datetime")
    private String dateTime;

    @SerializedName("metric")
    private Metric metric;

    @SerializedName("sunrise")
    private String sunrise;

    @SerializedName("sunset")
    private String sunset;

    @SerializedName("long_daypart_name")
    private String logdayPartName;

    @SerializedName("desc_day")
    private String desc_day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getLogdayPartName() {
        return logdayPartName;
    }

    public void setLogdayPartName(String logdayPartName) {
        this.logdayPartName = logdayPartName;
    }

    public String getDesc_day() {
        return desc_day;
    }

    public void setDesc_day(String desc_day) {
        this.desc_day = desc_day;
    }
}
