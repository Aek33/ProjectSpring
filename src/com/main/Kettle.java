package com.main;

public abstract class Kettle extends Light {
    private String Material;
    private int KettleVolume;

    public String getMaterial(){
        return Material;
    }

    public void setMaterial(String Material){
        this.Material = Material;
    }

    public int getKettleVolume(){
        return KettleVolume;
    }

    public void setKettleVolume(int Volume){
        this.KettleVolume = Volume;
    }
    public Kettle(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight,
                  String Color, String Material, int KettleVolume) {
        super(Type, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color);
        this.Material = Material;
        this.KettleVolume = KettleVolume;
    }
}
