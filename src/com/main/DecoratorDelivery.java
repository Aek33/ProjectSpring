package com.main;

public class DecoratorDelivery extends BaseDecorator{

    public DecoratorDelivery(Appliances a) {
        super(a);
    }

    @Override
    public String getType(){
        return a.getType() + " С доствкой";
    }

    @Override
    public double getPrice() {
        return a.getPrice() + 1000;
    }

    @Override
    public void show() {
        a.show();
    }

}
