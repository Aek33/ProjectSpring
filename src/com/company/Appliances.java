package com.company;

public abstract class Appliances {

    private String Type, Manufacturer;
    private int Price;

    public String getType() {

        return Type;
    }

    public void setType(String Type){

        this.Type = Type;
    }

    public String getManufacturer() {

        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer){

        this.Manufacturer = Manufacturer;
    }

    public int getPrice(){

        return Price;
    }

    public void setPrice(int Price){

        this.Price = Price;
    }

    public Appliances(String Type, String Manufacturer, int Price){
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Price = Price;
    }
    public abstract void Show();
}
