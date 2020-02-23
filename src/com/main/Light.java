package com.main;

public abstract class Light extends Appliances{
    private int LightLength, LightWidth, LightHeight;

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

    public Light(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight) {
        super(Type, Manufacturer, Price);
        this.LightLength = LightLength;
        this.LightWidth = LightWidth;
        this.LightHeight =LightHeight;
    }
}
