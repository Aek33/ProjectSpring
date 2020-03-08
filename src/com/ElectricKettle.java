package com;

public class ElectricKettle extends Kettle {

    public ElectricKettle(String Name, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                          String Color, String Material, int KettleVolume) {
        super(Name, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color, Material, KettleVolume);
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    public void show() {
        System.out.println("Название: " + getName() + "\n" + "Производитель: " + getManufacturer()+ "\n" +
                "Цена: " + TotalPrice() + " руб" + "\n" +
                "Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см" + "\n" +
                "Цвет: " + getColor() + "\n" + "Материал: " + getMaterial() + "\n" +
                "Общий объем: " + getKettleVolume() + " литров");
    }
}
