package com;

public class Microwave extends Light {

   private int Volume, MicWavePower;

   public int getVolume(){
       return Volume;
   }

   public void setVolume(int Volume){
       this.Volume = Volume;
   }

   public int getMicWavePower(){
       return MicWavePower;
   }

   public void setMicWavePower(int MicWavePower){
       this.MicWavePower = MicWavePower;
   }

    public Microwave(String Name, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                     String Color, int Volume, int MicWavePower) {
        super(Name, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color);
        this.Volume = Volume;
        this.MicWavePower = MicWavePower;
    }

    @Override
    public double TotalPrice() {
        return getPrice();
    }

    public void show() {
        System.out.println("Название: " + getName() + "\n"
                + "Производитель: " + getManufacturer() + "\n" + "Цена: " + TotalPrice() + " руб" + "\n"
                + "Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см" + "\n"
                + "Цвет: " + getColor() + "\n" + "Внутренний объем: " + getVolume() + " куб.см" + "\n"
                + "Мощьность микроволн: " + getMicWavePower() + " Вт");

    }
}
