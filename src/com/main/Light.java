package com.main;

public abstract class Light extends Appliances{
    private int LightLength, LightWidth, LightHeight;
    private String Color;

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public int getLightLength(){
        return LightLength;
    }

    public void setLightLength(int LightLength){
        this.LightLength = LightLength;
    }

    public int getLightWidth(){
        return LightWidth;
    }

    public void setLightWidth(int LightWidth){
        this.LightWidth = LightWidth;
    }

    public int getLightHeight(){
        return LightHeight;
    }

    public void setLightHeight(int LightHeight){
        this.LightHeight = LightHeight;
    }

    public Light(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight,
                 String Color) {
        super(Type, Manufacturer, Price);
        this.LightLength = LightLength;
        this.LightWidth = LightWidth;
        this.LightHeight =LightHeight;
        this.Color = Color;
    }
}
