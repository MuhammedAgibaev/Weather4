package com.example.myapplication4.dataCity;

public class City
{
    private AdministrativeArea AdministrativeArea;

    private String LocalizedName;

    private String[] SupplementalAdminAreas=null;

    private String[] DataSets=null;

    private String Rank;

    private String IsAlias;

    private String Type;

    private TimeZone TimeZone;

    private String Version;

    private String PrimaryPostalCode;

    private Region Region;

    private Country Country;

    private GeoPosition GeoPosition;

    private String Key;

    private String EnglishName;

    public AdministrativeArea getAdministrativeArea ()
    {
        return AdministrativeArea;
    }

    public void setAdministrativeArea (AdministrativeArea AdministrativeArea)
    {
        this.AdministrativeArea = AdministrativeArea;
    }

    public String getLocalizedName ()
    {
        return LocalizedName;
    }

    public void setLocalizedName (String LocalizedName)
    {
        this.LocalizedName = LocalizedName;
    }

    public String[] getSupplementalAdminAreas ()
    {
        return SupplementalAdminAreas;
    }

    public void setSupplementalAdminAreas (String[] SupplementalAdminAreas)
    {
        this.SupplementalAdminAreas = SupplementalAdminAreas;
    }

    public String[] getDataSets ()
    {
        return DataSets;
    }

    public void setDataSets (String[] DataSets)
    {
        this.DataSets = DataSets;
    }

    public String getRank ()
    {
        return Rank;
    }

    public void setRank (String Rank)
    {
        this.Rank = Rank;
    }

    public String getIsAlias ()
    {
        return IsAlias;
    }

    public void setIsAlias (String IsAlias)
    {
        this.IsAlias = IsAlias;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public TimeZone getTimeZone ()
    {
        return TimeZone;
    }

    public void setTimeZone (TimeZone TimeZone)
    {
        this.TimeZone = TimeZone;
    }

    public String getVersion ()
    {
        return Version;
    }

    public void setVersion (String Version)
    {
        this.Version = Version;
    }

    public String getPrimaryPostalCode ()
    {
        return PrimaryPostalCode;
    }

    public void setPrimaryPostalCode (String PrimaryPostalCode)
    {
        this.PrimaryPostalCode = PrimaryPostalCode;
    }

    public Region getRegion ()
    {
        return Region;
    }

    public void setRegion (Region Region)
    {
        this.Region = Region;
    }

    public Country getCountry ()
    {
        return Country;
    }

    public void setCountry (Country Country)
    {
        this.Country = Country;
    }

    public GeoPosition getGeoPosition ()
    {
        return GeoPosition;
    }

    public void setGeoPosition (GeoPosition GeoPosition)
    {
        this.GeoPosition = GeoPosition;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
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
        return "ClassPojo [AdministrativeArea = "+AdministrativeArea+", LocalizedName = "+LocalizedName+", SupplementalAdminAreas = "+SupplementalAdminAreas+", DataSets = "+DataSets+", Rank = "+Rank+", IsAlias = "+IsAlias+", Type = "+Type+", TimeZone = "+TimeZone+", Version = "+Version+", PrimaryPostalCode = "+PrimaryPostalCode+", Region = "+Region+", Country = "+Country+", GeoPosition = "+GeoPosition+", Key = "+Key+", EnglishName = "+EnglishName+"]";
    }
}