package com.main;

public abstract class Washer extends Heavy {
    private int WeightLimit;
    private String LoadingType;

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

    public Washer(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                  String Color, int WeightLimit, String LoadingType){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, Color);
        this.WeightLimit = WeightLimit;
        this.LoadingType = LoadingType;
    }
}
