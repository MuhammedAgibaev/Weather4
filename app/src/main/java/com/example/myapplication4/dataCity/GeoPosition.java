package com.example.myapplication4.dataCity;

public class GeoPosition
{
    private Elevation Elevation;

    private String Latitude;

    private String Longitude;

    public Elevation getElevation ()
    {
        return Elevation;
    }

    public void setElevation (Elevation Elevation)
    {
        this.Elevation = Elevation;
    }

    public String getLatitude ()
    {
        return Latitude;
    }

    public void setLatitude (String Latitude)
    {
        this.Latitude = Latitude;
    }

    public String getLongitude ()
    {
        return Longitude;
    }

    public void setLongitude (String Longitude)
    {
        this.Longitude = Longitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Elevation = "+Elevation+", Latitude = "+Latitude+", Longitude = "+Longitude+"]";
    }
}