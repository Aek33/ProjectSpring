package com.appliances;

public class Dryer extends Washer {

    private int DryerNoiseLevel;

    public int getDryerNoiseLevel(){
        return DryerNoiseLevel;
    }

    public void setDryerNoiseLevel(int DryerNoiseLevel){
        this.DryerNoiseLevel = DryerNoiseLevel;
    }

    public Dryer(String Name, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
                 String Color, int WeightLimit, String LoadingType, int DryerNoiseLevel){
        super(Name, Manufacturer, Price, Length, Width, Height, Weight, Color, WeightLimit, LoadingType);
        this.DryerNoiseLevel = DryerNoiseLevel;
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    public void show() {
        System.out.println("Тип: " + getName() + "\n" + "Производитель: " + getManufacturer() + "\n" +
                "Цена: " + TotalPrice() + " руб" + "\n" +
                "Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см" + "\n" +
                "Вес: " + getHeavyWeight() +" кг" + "\n" +
                "Максимальная загрузка: " + getWeightLimit() + " литров" + "\n" +
                "Тип загрузки: " + getLoadingType() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Уровень шума при отжиме: " + getDryerNoiseLevel() + " Дб");
    }
}
