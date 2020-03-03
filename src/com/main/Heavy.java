package com.main;

public abstract class Heavy extends Appliances{

    private int HeavyLength, HeavyWidth, HeavyHeight, HeavyWeight;
    private String Color;

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public int getHeavyLength(){
        return HeavyLength;
    }

    public void setHeavyLength(int Length){
        this.HeavyLength = Length;
    }

    public int getHeavyWidth(){
        return HeavyWidth;
    }

    public void setHeavyWidth(int Width){
        this.HeavyWidth = Width;
    }

    public int getHeavyHeight(){
        return HeavyHeight;
    }

    public void setHeavyHeight(int Height){
        this.HeavyHeight = Height;
    }

    public int getHeavyWeight(){
        return HeavyWeight;
    }

    public void setHeavyWeight(int Weight){
        this.HeavyWeight = Weight;
    }

    public Heavy(String Type, String Manufacturer, double Price, int HeavyLength, int HeavyWidth, int HeavyHeight, int HeavyWeight,
                 String Color){
        super(Type, Manufacturer, Price);
        this.HeavyLength = HeavyLength;
        this.HeavyWidth = HeavyWidth;
        this.HeavyHeight = HeavyHeight;
        this.HeavyWeight = HeavyWeight;
        this.Color = Color;
    }
}
