package com.decorator;

import com.appliances.Appliances;

public class DecoratorDelivery extends BaseDecorator{

    private Appliances appliance;

    public DecoratorDelivery(Appliances appliance){
        this.appliance = appliance;
    }

    @Override
    public double TotalPrice() {
        return 1000 + appliance.TotalPrice();
    }

    @Override
    public String getName() {
        return appliance.getName() + " С доставкой ";
    }

    @Override
    public void show() {
        appliance.show();
    }
}
