package com;

public class DecoratorDiscount extends BaseDecorator {

    private double DiscountPercentage;

    public double getDiscountPercentage(){
        return DiscountPercentage;
    }

    public void setDiscountPercentage(){
        this.DiscountPercentage = DiscountPercentage;
    }
    public DecoratorDiscount(Appliances appliance, double DiscountPercentage) {
        super(appliance);
        this.DiscountPercentage = DiscountPercentage;
    }

    @Override
    public String getName() {
        return appliance.getName() + " Со скидкой: " + getDiscountPercentage() + "%";
    }

    @Override
    public double getPrice() {
        return appliance.getPrice() - (appliance.getPrice()*(getDiscountPercentage()/100));
    }

    @Override
    public void show() {
        appliance.show();
    }
}
