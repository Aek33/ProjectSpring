package com.main;

public class ElectricKettle extends Kettle {

    public ElectricKettle(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight,
                          String Color, String Material, int KettleVolume) {
        super(Type, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color, Material, KettleVolume);
    }

    public void show() {
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см");
        System.out.println("Цвет: " + getColor());
        System.out.println("Материал: " + getMaterial());
        System.out.println("Общий объем: " + getKettleVolume() + " литров");
    }
}
