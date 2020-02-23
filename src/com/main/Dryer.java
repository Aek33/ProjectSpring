package com.main;

public class Dryer extends Washer {

    private int DryerNoiseLevel;

    public int getDryerNoiseLevel(){
        return DryerNoiseLevel;
    }

    public void setDryerNoiseLevel(int DryerNoiseLevel){
        this.DryerNoiseLevel = DryerNoiseLevel;
    }

    public Dryer(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                 String Color, int WeightLimit, String LoadingType, int DryerNoiseLevel){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, Color, WeightLimit, LoadingType);
        this.DryerNoiseLevel = DryerNoiseLevel;
    }

    public void show() {
            System.out.println("Тип: " + getType());
            System.out.println("Производитель: " + getManufacturer());
            System.out.println("Цена: " + getPrice() + " руб");
            System.out.println("Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см");
            System.out.println("Вес: " + getHeavyWeight() +" кг");
            System.out.println("Максимальная загрузка: " + getWeightLimit() + " литров");
            System.out.println("Тип загрузки: " + getLoadingType());
            System.out.println("Цвет: " + getColor());
            System.out.println("Уровень шума при отжиме: " + getDryerNoiseLevel() + " Дб");
    }
}
