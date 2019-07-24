package com.example.myapplication4.dataCity;

public class Metric
{
    private String UnitType;

    private String Value;

    private String Unit;

    public String getUnitType ()
    {
        return UnitType;
    }

    public void setUnitType (String UnitType)
    {
        this.UnitType = UnitType;
    }

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getUnit ()
    {
        return Unit;
    }

    public void setUnit (String Unit)
    {
        this.Unit = Unit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [UnitType = "+UnitType+", Value = "+Value+", Unit = "+Unit+"]";
    }
}