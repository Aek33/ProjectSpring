package com;

public class DecoratorDelivery extends BaseDecorator{

    public DecoratorDelivery(Appliances appliance) {
        super(appliance);
    }

    @Override
    public String getName() {
        return appliance.getName() + " С доставкой";
    }

    @Override
    public double getPrice() {
        return appliance.getPrice() + 1000;
    }

    @Override
    public void show() {
        appliance.show();
    }
}
