package com.company;

public class SimpleFreezer extends Freezer{

    public SimpleFreezer(String Type, String Manufacturer, int Price, int Length, int Width, int Height, int Weight,
                         int Volume, int NoiseLevel, String Color){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, Volume, NoiseLevel, Color);
    }
    public void Show(){
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Габариты: " + getLength() + "x" + getWidth() + "x" + getHeight() + " см");
        System.out.println("Вес: " + getWeight() +" кг");
        System.out.println("Объем: " + getVolume() + " литров");
        System.out.println("Уровень шума: " + getNoiseLevel() + " Дб");
        System.out.println("Цвет: " + getColor());

    }
}
