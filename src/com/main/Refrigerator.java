package com.main;
public class Refrigerator extends Freezer{
    private int NumberOfCells, FreezerVolume, ColdstoreVolume, NumberOfDoors;

    public int getNumberOfCells(){
        return NumberOfCells;
    }

    public void setNumberOfCells(int NumberOfCells){
        this.NumberOfCells = NumberOfCells;
    }

    public int getFreezerVolume(){
        return FreezerVolume;
    }

    public void setFreezerVolume(int FreezerVolume){
        this.FreezerVolume = FreezerVolume;
    }

    public int getColdstoreVolume(){
        return ColdstoreVolume;
    }

    public void setColdstoreVolume(int ColdstoreVolume){
        this.ColdstoreVolume = ColdstoreVolume;
    }

    public int getNumberOfDoors(){
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors){
        this.NumberOfDoors = NumberOfDoors;
    }

    public Refrigerator(String Type, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
                        String Color, int Volume, int NoiseLevel,  int NumberOfCells, int FreezerVolume,
                        int ColdstoreVolume, int NumberOfDoors){
        super(Type, Manufacturer, Price, Length, Width, Height, Weight, Color, Volume, NoiseLevel);
        this.NumberOfCells = NumberOfCells;
        this.FreezerVolume = FreezerVolume;
        this.ColdstoreVolume = ColdstoreVolume;
        this.NumberOfDoors = NumberOfDoors;
    }

    @Override
    public void show() {
    System.out.println("Тип: " + getType());
    System.out.println("Производитель: " + getManufacturer());
    System.out.println("Цена: " + getPrice() + " руб");
    System.out.println("Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см");
    System.out.println("Вес: " + getHeavyWeight() +" кг");
    System.out.println("Общий объем: " + getVolume() + " литров");
    System.out.println("Уровень шума: " + getNoiseLevel() + " Дб");
    System.out.println("Цвет: " + getColor());
    System.out.println("Количество камер: " + getNumberOfCells());
    System.out.println("Объем морозильной камеры: " + getFreezerVolume() + " литров");
    System.out.println("Объем холодильной камеры: " + getColdstoreVolume() + " литров");
    System.out.println("Количество дверей: " + getNumberOfDoors());
    }
}