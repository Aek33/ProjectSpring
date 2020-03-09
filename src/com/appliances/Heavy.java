package com.appliances;

public abstract class Heavy extends Appliances{

    private String Manufacturer, Color;
    private double Price;
    private int HeavyLength, HeavyWidth, HeavyHeight, HeavyWeight;

    public String getManufacturer() {

        return Manufacturer;
    }

    public double getPrice(){

        return Price;
    }

    public void setManufacturer(String Manufacturer){

        this.Manufacturer = Manufacturer;
    }

    public void setPrice(double Price){

        this.Price = Price;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }

    public int getHeavyLength(){
        return HeavyLength;
    }

    public void setHeavyLength(int Length){
        this.HeavyLength = Length;
    }

    public int getHeavyWidth(){
        return HeavyWidth;
    }

    public void setHeavyWidth(int Width){
        this.HeavyWidth = Width;
    }

    public int getHeavyHeight(){
        return HeavyHeight;
    }

    public void setHeavyHeight(int Height){
        this.HeavyHeight = Height;
    }

    public int getHeavyWeight(){
        return HeavyWeight;
    }

    public void setHeavyWeight(int Weight){
        this.HeavyWeight = Weight;
    }

    public Heavy(String Name, String Manufacturer, double Price, int HeavyLength,
                 int HeavyWidth, int HeavyHeight, int HeavyWeight, String Color){
        super.setName(Name);
        this.Manufacturer = Manufacturer;
        this.Price = Price;
        this.HeavyLength = HeavyLength;
        this.HeavyWidth = HeavyWidth;
        this.HeavyHeight = HeavyHeight;
        this.HeavyWeight = HeavyWeight;
        this.Color = Color;
    }
}
