package com;

public abstract class BaseDecorator extends Appliances{
    protected Appliances appliance;

    public BaseDecorator(Appliances appliance){
        this.appliance = appliance;
    }

}
