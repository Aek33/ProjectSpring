package com.main;

public abstract class Heavy extends Appliances{

    private int Length, Width, Height, Weight;

    public int getLength(){
        return Length;
    }

    public void setLength(int Length){
        this.Length = Length;
    }

    public int getWidth(){
        return Width;
    }

    public void setWidth(int Width){
        this.Width = Width;
    }

    public int getHeight(){
        return Height;
    }

    public void setHeight(int Height){
        this.Height = Height;
    }

    public int getWeight(){
        return Weight;
    }

    public void setWeight(int Weight){
        this.Weight = Weight;
    }

    public Heavy(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight){
        super(Type, Manufacturer, Price);
        this.Length = Length;
        this.Width = Width;
        this.Height = Height;
        this.Weight = Weight;
    }
}
