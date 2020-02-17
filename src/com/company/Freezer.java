package com.company;
public class Freezer extends Heavy{
    private int Volume;
    private int NoiseLevel;
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
}
