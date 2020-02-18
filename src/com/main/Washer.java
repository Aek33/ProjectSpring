package com.main;

import com.main.Heavy;

public abstract class Washer extends Heavy {
    private int WeightLimit;
    private String LoadingType, Color;

    public int getWeightLimit() {
        return WeightLimit;
    }

    public void setWeightLimit(int WeightLimit){
        this.WeightLimit = WeightLimit;
    }

    public String getLoadingType() {
        return LoadingType;
    }

    public void setLoadingType(String LoadingType){
        this.LoadingType = LoadingType;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public Washer(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                  int WeightLimit, String LoadingType, String Color){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight);
        this.WeightLimit = WeightLimit;
        this.LoadingType = LoadingType;
        this.Color = Color;
    }
}
