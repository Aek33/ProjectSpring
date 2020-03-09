package com.appliances;

public class SimpleWasher extends Washer  {
    private int WashingNoiseLevel;

    public int getWashingNoiseLevel(){
        return WashingNoiseLevel;
    }

    public void setWashingNoiseLevel(int WashingNoiseLevel){
        this.WashingNoiseLevel = WashingNoiseLevel;
    }

    public SimpleWasher(String Name, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
            String Color, int WeightLimit, String LoadingType, int WashingNoiseLevel){
        super(Name, Manufacturer, Price, Length, Width, Height, Weight, Color, WeightLimit, LoadingType);
        this.WashingNoiseLevel = WashingNoiseLevel;
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    public void show() {
        System.out.println("Тип: " + getName() + "\n" + "Производитель: " + getManufacturer() + "\n" +
                "Цена: " + TotalPrice() + " руб" + "\n" +
                "Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см" + "\n" +
                "Вес: " + getHeavyWeight() +" кг" + "\n" +
                "Максимальная загрузка: " + getWeightLimit() + " литров" + "\n" +
                "Тип загрузки: " + getLoadingType() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Уровень шума при стирке: " + getWashingNoiseLevel() + " Дб");
    }
}
