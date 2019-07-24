package com.example.myapplication4.dataCity;

public class Region
{
    private String LocalizedName;

    private String ID;

    private String EnglishName;

    public String getLocalizedName ()
    {
        return LocalizedName;
    }

    public void setLocalizedName (String LocalizedName)
    {
        this.LocalizedName = LocalizedName;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getEnglishName ()
    {
        return EnglishName;
    }

    public void setEnglishName (String EnglishName)
    {
        this.EnglishName = EnglishName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LocalizedName = "+LocalizedName+", ID = "+ID+", EnglishName = "+EnglishName+"]";
    }
}