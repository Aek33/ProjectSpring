package com.company;
public abstract class Freezer extends Heavy{

    private int Volume, NoiseLevel;
    private String Color;

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume){
        this.Volume = Volume;
    }

    public int getNoiseLevel() {
        return NoiseLevel;
    }

    public void setNoiseLevel(int NoiseLevel){
        this.NoiseLevel = NoiseLevel;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public Freezer(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                   int Volume, int NoiseLevel, String Color){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight);
        this.Volume = Volume;
        this.NoiseLevel = NoiseLevel;
        this.Color = Color;
    }
}
