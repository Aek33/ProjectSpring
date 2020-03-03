package com.main;
public abstract class Freezer extends Heavy{

    private int Volume, NoiseLevel;

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


    public Freezer(String Type, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
                   String Color, int Volume, int NoiseLevel){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, Color);
        this.Volume = Volume;
        this.NoiseLevel = NoiseLevel;
    }
}
