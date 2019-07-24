package com.example.myapplication4.dataWeather;

public class DailyForecasts
{
    private Temperature Temperature;

    private Night Night;

    private String EpochDate;

    private Day Day;

    private String[] Sources;

    private String Date;

    private String Link;

    private String MobileLink;

    public Temperature getTemperature ()
    {
        return Temperature;
    }

    public void setTemperature (Temperature Temperature)
    {
        this.Temperature = Temperature;
    }

    public Night getNight ()
    {
        return Night;
    }

    public void setNight (Night Night)
    {
        this.Night = Night;
    }

    public String getEpochDate ()
    {
        return EpochDate;
    }

    public void setEpochDate (String EpochDate)
    {
        this.EpochDate = EpochDate;
    }

    public Day getDay ()
    {
        return Day;
    }

    public void setDay (Day Day)
    {
        this.Day = Day;
    }

    public String[] getSources ()
    {
        return Sources;
    }

    public void setSources (String[] Sources)
    {
        this.Sources = Sources;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public String getLink ()
    {
        return Link;
    }

    public void setLink (String Link)
    {
        this.Link = Link;
    }

    public String getMobileLink ()
    {
        return MobileLink;
    }

    public void setMobileLink (String MobileLink)
    {
        this.MobileLink = MobileLink;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Temperature = "+Temperature+", Night = "+Night+", EpochDate = "+EpochDate+", Day = "+Day+", Sources = "+Sources+", Date = "+Date+", Link = "+Link+", MobileLink = "+MobileLink+"]";
    }
}
