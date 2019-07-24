package com.example.myapplication4.dataCity;

public class TimeZone
{
    private String NextOffsetChange;

    private String GmtOffset;

    private String Code;

    private String IsDaylightSaving;

    private String Name;

    public String getNextOffsetChange ()
{
    return NextOffsetChange;
}

    public void setNextOffsetChange (String NextOffsetChange)
    {
        this.NextOffsetChange = NextOffsetChange;
    }

    public String getGmtOffset ()
    {
        return GmtOffset;
    }

    public void setGmtOffset (String GmtOffset)
    {
        this.GmtOffset = GmtOffset;
    }

    public String getCode ()
    {
        return Code;
    }

    public void setCode (String Code)
    {
        this.Code = Code;
    }

    public String getIsDaylightSaving ()
    {
        return IsDaylightSaving;
    }

    public void setIsDaylightSaving (String IsDaylightSaving)
    {
        this.IsDaylightSaving = IsDaylightSaving;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NextOffsetChange = "+NextOffsetChange+", GmtOffset = "+GmtOffset+", Code = "+Code+", IsDaylightSaving = "+IsDaylightSaving+", Name = "+Name+"]";
    }
}