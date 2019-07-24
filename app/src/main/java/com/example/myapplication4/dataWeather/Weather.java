package com.example.myapplication4.dataWeather;

public class Weather
{
    private Headline Headline;

    private DailyForecasts[] DailyForecasts;

    public Headline getHeadline ()
    {
        return Headline;
    }

    public void setHeadline (Headline Headline)
    {
        this.Headline = Headline;
    }

    public DailyForecasts[] getDailyForecasts ()
    {
        return DailyForecasts;
    }

    public void setDailyForecasts (DailyForecasts[] DailyForecasts)
    {
        this.DailyForecasts = DailyForecasts;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Headline = "+Headline+", DailyForecasts = "+DailyForecasts+"]";
    }
}
