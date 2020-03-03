package com.main;
import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        /*ArrayList<Appliances> Array = new ArrayList<>(10);
        Appliances Product = null;
        Random chaos = new Random();
        for(int i = 0; i < 10; i++){
            int RandomNumber = chaos.nextInt(7);
            switch (RandomNumber){
                case 0:
                    Product = new Refrigerator("Терминатор T1000", "SkyNet",6000, 50,
                            50, 200, 30, "Серебристый", 500, 30,
                            2, 100, 400, 1);
                    break;
                case 1:
                    Product = new SimpleFreezer("Морозильная камера SF100", "Moroz",
                            1000, 200,100, 100, 50, "Белый",
                            800, 100);
                    break;
                case 2:
                    Product = new SimpleWasher("Стриральная машина SW100", "Samsung", 3000,
                            50, 50, 150, 20, "Белый", 6,
                            "горизонтальный", 20);
                    break;
                case 3:
                    Product = new Dryer("Сушильная машина DRYER100", "NotSamsung",
                            1000,50, 50, 150, 20, "Белый",
                            7, "горизонтальный", 30);
                    break;
                case 4:
                    Product = new ElectricKettle("Чайник T4", "Vitek", 600, 20,
                            20, 30, "Прозрачный","Пластик",  2);
                    break;
                case 5:
                    Product = new TeaPot("Термопот Termos", "Vitek", 800, 25,
                            25, 40, "Серебристый","Металл",  5,
                            3);
                    break;
                case 6:
                    Product = new Microwave("Микроволновка MW100", "R.S.", 700,
                            40,30, 30, "Белый",9, 600);
                    break;
            }
            Array.add(i, Product);
        }

        for (Appliances appliances : Array) {
            System.out.println("\n");
            appliances.show();
        }*/

        Decorable T2000 = new Refrigerator("Терминатор T2000", "SkyNet",6000, 50,
                50, 200, 30, "Серебристый", 500, 30,
                2, 100, 400, 1);


        T2000 = new DecoratorDelivery((Appliances) T2000);

        T2000.show();


    }
}
