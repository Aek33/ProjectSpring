package com.appliances;

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

    public Kettle(String Name, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                  String Color, String Material, int KettleVolume) {
        super(Name, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color);
        this.Material = Material;
        this.KettleVolume = KettleVolume;
    }
}
