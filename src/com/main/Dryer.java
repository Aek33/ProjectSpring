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
                        int WeightLimit, String LoadingType, String Color, int DryerNoiseLevel){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, WeightLimit, LoadingType, Color);
        this.DryerNoiseLevel = DryerNoiseLevel;
    }

    public void Show() {
            System.out.println("Тип: " + getType());
            System.out.println("Производитель: " + getManufacturer());
            System.out.println("Цена: " + getPrice() + " руб");
            System.out.println("Габариты: " + getLength() + "x" + getWidth() + "x" + getHeight() + " см");
            System.out.println("Вес: " + getWeight() +" кг");
            System.out.println("Максимальная загрузка: " + getWeightLimit() + " литров");
            System.out.println("Тип загрузки: " + getLoadingType());
            System.out.println("Цвет: " + getColor());
            System.out.println("Уровень шума при отжиме: " + getDryerNoiseLevel() + " Дб");
    }
}
