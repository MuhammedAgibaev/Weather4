package com.example.myapplication4.dataWeather;

public class Temperature
{
    private Minimum Minimum;

    private Maximum Maximum;

    public Minimum getMinimum ()
    {
        return Minimum;
    }

    public void setMinimum (Minimum Minimum)
    {
        this.Minimum = Minimum;
    }

    public Maximum getMaximum ()
    {
        return Maximum;
    }

    public void setMaximum (Maximum Maximum)
    {
        this.Maximum = Maximum;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Minimum = "+Minimum+", Maximum = "+Maximum+"]";
    }
}
