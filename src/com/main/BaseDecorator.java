package com.main;

public abstract class BaseDecorator implements Decorable{
    protected Appliances a;

    public BaseDecorator(Appliances a){
        this.a = a;
    }

    @Override
    public abstract String getType();

    @Override
    public abstract double getPrice();
}
