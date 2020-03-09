package com.decorator;

import com.appliances.Appliances;

public class DecoratorDiscount extends BaseDecorator {

    private double DiscountPercentage;
    private Appliances appliance;

    public double getDiscountPercentage(){
        return DiscountPercentage;
    }

    public DecoratorDiscount(Appliances appliance, double DiscountPercentage){
        this.appliance = appliance;
        this.DiscountPercentage = DiscountPercentage;
    }

    @Override
    public double TotalPrice() {
            return appliance.TotalPrice() - (appliance.TotalPrice()*(getDiscountPercentage()/100));
    }
    @Override
    public String getName() {
        return appliance.getName() + " Со скидкой: " + getDiscountPercentage() + "%";
    }
    @Override
    public void show() {
        appliance.show();
    }

}
