package com.appliances;

public abstract class Appliances{
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public abstract void show();
    public abstract double TotalPrice();
}
