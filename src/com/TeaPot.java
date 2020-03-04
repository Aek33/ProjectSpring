package com;

public class TeaPot extends Kettle{
    private int NumberOfTemperatureMods;

    public int getNumberOfTemperatureMods(){
        return NumberOfTemperatureMods;
    }

    public void setNumberOfTemperatureMods(int NOTM){
        NumberOfTemperatureMods = NOTM;
    }

    public TeaPot(String Name, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                  String Color, String Material, int KettleVolume, int NOTM) {
        super(Name, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color, Material, KettleVolume);
        NumberOfTemperatureMods = NOTM;
    }

    public void show() {
        System.out.println("Название: " + getName() + "\n" + "Производитель: " + getManufacturer()+ "\n" +
                "Цена: " + getPrice() + " руб" + "\n" +
                "Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см" + "\n" +
                "Цвет: " + getColor() + "\n" + "Материал: " + getMaterial() + "\n" +
                "Общий объем: " + getKettleVolume() + " литров" + "\n" +
                "Количество температурных режимов: " + getNumberOfTemperatureMods());
    }
}
