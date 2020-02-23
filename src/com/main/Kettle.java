package com.main;

public abstract class Kettle extends Light {
    private String Material, Color;
    private int KettleVolume;

    public String getMaterial(){
        return Material;
    }

    public void setMaterial(String Material){
        this.Material = Material;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public int getKettleVolume(){
        return KettleVolume;
    }

    public void setKettleVolume(int Volume){
        this.KettleVolume = Volume;
    }
    public Kettle(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight,
                  String Material, String Color,
                  int KettleVolume) {
        super(Type, Manufacturer, Price, LightLength, LightWidth, LightHeight);
        this.Material = Material;
        this.Color = Color;
        this.KettleVolume = KettleVolume;
    }
}
