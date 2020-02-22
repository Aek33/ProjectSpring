package com.main;

public class ElectricKettle extends Kettle {

    public ElectricKettle(String Type, String Manufacturer, int Price, String Material, String Color, int KettleVolume) {
        super(Type, Manufacturer, Price, Material, Color, KettleVolume);
    }

    public void Show() {
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Материал: " + getMaterial());
        System.out.println("Цвет: " + getColor());
        System.out.println("Общий объем: " + getKettleVolume() + " литров");
    }
}
