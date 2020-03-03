package com.main;

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

    public Microwave(String Type, String Manufacturer, double Price, int LightLength, int LightWidth, int LightHeight,
                     String Color, int Volume, int MicWavePower) {
        super(Type, Manufacturer, Price, LightLength, LightWidth, LightHeight, Color);
        this.Volume = Volume;
        this.MicWavePower = MicWavePower;
    }

    public void show() {
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см");
        System.out.println("Цвет: " + getColor());
        System.out.println("Внутренний объем: " + getVolume() + " куб.см");
        System.out.println("Мощьность микроволн: " + getMicWavePower() + " Вт");
    }
}
