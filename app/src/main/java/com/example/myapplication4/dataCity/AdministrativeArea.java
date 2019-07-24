package com.example.myapplication4.dataCity;

public class AdministrativeArea
{
    private String CountryID;

    private String LocalizedType;

    private String LocalizedName;

    private String Level;

    private String ID;

    private String EnglishType;

    private String EnglishName;

    public String getCountryID ()
    {
        return CountryID;
    }

    public void setCountryID (String CountryID)
    {
        this.CountryID = CountryID;
    }

    public String getLocalizedType ()
    {
        return LocalizedType;
    }

    public void setLocalizedType (String LocalizedType)
    {
        this.LocalizedType = LocalizedType;
    }

    public String getLocalizedName ()
    {
        return LocalizedName;
    }

    public void setLocalizedName (String LocalizedName)
    {
        this.LocalizedName = LocalizedName;
    }

    public String getLevel ()
    {
        return Level;
    }

    public void setLevel (String Level)
    {
        this.Level = Level;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getEnglishType ()
    {
        return EnglishType;
    }

    public void setEnglishType (String EnglishType)
    {
        this.EnglishType = EnglishType;
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
        return "ClassPojo [CountryID = "+CountryID+", LocalizedType = "+LocalizedType+", LocalizedName = "+LocalizedName+", Level = "+Level+", ID = "+ID+", EnglishType = "+EnglishType+", EnglishName = "+EnglishName+"]";
    }
}
