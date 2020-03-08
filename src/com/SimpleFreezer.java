package com;

public class SimpleFreezer extends Freezer{

    public SimpleFreezer(String Name, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
                         String Color, int Volume, int NoiseLevel){
        super(Name, Manufacturer, Price, Length, Width, Height, Weight, Color, Volume, NoiseLevel);
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    public void show(){
        System.out.println("Название: " + getName() + "\n" + "Производитель: " + getManufacturer()  + "\n" +
                "Цена: " + TotalPrice() + " руб" + "\n" +
                "Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см" + "\n" +
                "Вес: " + getHeavyWeight() +" кг" + "\n" +
                "Общий объем: " + getVolume() + " литров" + "\n" +
                "Уровень шума: " + getNoiseLevel() + " Дб" + "\n" +
                "Цвет: " + getColor() + "\n" + "Объем: " + getVolume() + " литров" + "\n"
                + "Уровень шума: " + getNoiseLevel() + " Дб");
    }
}
