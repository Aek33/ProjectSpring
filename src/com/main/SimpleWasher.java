package com.main;

public class SimpleWasher extends Washer  {
    private int WashingNoiseLevel;

    public int getWashingNoiseLevel(){
        return WashingNoiseLevel;
    }

    public void setWashingNoiseLevel(int WashingNoiseLevel){
        this.WashingNoiseLevel = WashingNoiseLevel;
    }

    public SimpleWasher(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                        int WeightLimit, String LoadingType, String Color, int WashingNoiseLevel){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, WeightLimit, LoadingType, Color);
        this.WashingNoiseLevel = WashingNoiseLevel;
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
        System.out.println("Уровень шума при стирке: " + getWashingNoiseLevel() + " Дб");
    }
}
