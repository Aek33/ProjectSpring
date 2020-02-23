package com.main;

public class Microwave extends Light {

   private int Volume, MicWavePower;
   private String MicWaveColor;

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

   public String getMicWaveColor(){
       return MicWaveColor;
   }

   public void setMicWaveColor(String MicWaveColor){
       this.MicWaveColor = MicWaveColor;
   }

    public Microwave(String Type, String Manufacturer, int Price, int LightLength, int LightWidth, int LightHeight,
                     int Volume, int MicWavePower, String MicWaveColor) {
        super(Type, Manufacturer, Price, LightLength, LightWidth, LightHeight);
        this.Volume = Volume;
        this.MicWavePower = MicWavePower;
        this.MicWaveColor = MicWaveColor;
    }

    public void show() {
        System.out.println("Тип: " + getType());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Цена: " + getPrice() + " руб");
        System.out.println("Габариты: " + getLightLength() + "x" + getLightWidth() + "x" + getLightHeight() + " см");
        System.out.println("Внутренний объем: " + getVolume() + " куб.см");
        System.out.println("Мощьность микроволн: " + getMicWavePower() + " Вт");
        System.out.println("Цвет: " + getMicWaveColor());
    }
}
