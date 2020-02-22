package com.main;

public abstract class Kettle extends Appliances {
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
    public Kettle(String Type, String Manufacturer, int Price, String Material, String Color,
                  int KettleVolume) {
        super(Type, Manufacturer, Price);
        this.Material = Material;
        this.Color = Color;
        this.KettleVolume = KettleVolume;
    }
}
