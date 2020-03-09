package com.appliances;


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

    public Refrigerator(String Name, String Manufacturer, double Price, int Length, int Width, int Height, int Weight,
                        String Color, int Volume, int NoiseLevel, int NumberOfCells, int FreezerVolume,
                        int ColdstoreVolume, int NumberOfDoors){
        super(Name, Manufacturer, Price, Length, Width, Height, Weight, Color, Volume, NoiseLevel);
        this.NumberOfCells = NumberOfCells;
        this.FreezerVolume = FreezerVolume;
        this.ColdstoreVolume = ColdstoreVolume;
        this.NumberOfDoors = NumberOfDoors;
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    @Override
    public void show() {
    System.out.println("Название: " + getName() + "\n" + "Производитель: " + getManufacturer()  + "\n" +
                    "Цена: " + TotalPrice() + " руб" + "\n" +
                    "Габариты: " + getHeavyLength() + "x" + getHeavyWidth() + "x" + getHeavyHeight() + " см" + "\n" +
                    "Вес: " + getHeavyWeight() +" кг" + "\n" +
                    "Общий объем: " + getVolume() + " литров" + "\n" +
                    "Уровень шума: " + getNoiseLevel() + " Дб" + "\n" +
                    "Цвет: " + getColor() + "\n" +
                    "Количество камер: " + getNumberOfCells() + "\n" +
                    "Объем морозильной камеры: " + getFreezerVolume() + " литров" + "\n" +
                    "Объем холодильной камеры: " + getColdstoreVolume() + " литров" + "\n" +
                    "Количество дверей: " + getNumberOfDoors());

    }
}