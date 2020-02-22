package com.main;

public class TeaPot extends Kettle{
    private int NumberOfTemperatureMods;

    public int getNumberOfTemperatureMods(){
        return NumberOfTemperatureMods;
    }

    public void setNumberOfTemperatureMods(int NOTM){
        NumberOfTemperatureMods = NOTM;
    }
    public TeaPot(String Type, String Manufacturer, int Price, String Material, String Color, int KettleVolume,
                  int NOTM) {
        super(Type, Manufacturer, Price, Material, Color, KettleVolume);
        NumberOfTemperatureMods = NOTM;
    }

    public void Show() {
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Материал: " + getMaterial());
        System.out.println("Цвет: " + getColor());
        System.out.println("Общий объем: " + getKettleVolume() + " литров");
        System.out.println("Количество температурных режимов: " + getNumberOfTemperatureMods());
    }
}
