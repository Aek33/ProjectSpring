package com.appliances;

public abstract class Light extends Appliances{
    private String Manufacturer, Color;
    private double Price;
    private int LightLength, LightWidth, LightHeight;

    public String getManufacturer() {

        return Manufacturer;
    }

    public double getPrice(){

        return Price;
    }

    public void setManufacturer(String Manufacturer){

        this.Manufacturer = Manufacturer;
    }

    public void setPrice(int Price){

        this.Price = Price;
    }

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

    public Light(String Name, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                 String Color) {
        super.setName(Name);
        this.Manufacturer = Manufacturer;
        this.Price = Price;
        this.LightLength = LightLength;
        this.LightWidth = LightWidth;
        this.LightHeight =LightHeight;
        this.Color = Color;
    }
}
