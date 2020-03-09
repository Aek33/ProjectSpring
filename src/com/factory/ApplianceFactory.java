package com.factory;

import com.appliances.*;
import org.jetbrains.annotations.NotNull;

public class ApplianceFactory {
    public Appliances createThing(@NotNull ApplianceType name){
        Appliances Thing;
        switch (name){
            case REFRIGERATOR:
                Thing = new Refrigerator("Терминатор T1000", "SkyNet",6000, 50,
                        50, 200, 30, "Серебристый", 500, 30,
                        2, 100, 400, 1);
                break;
            case SIMPLE_FREEZER:
                Thing = new SimpleFreezer("Морозильная камера SF100", "Moroz",
                        1000, 200,100, 100, 50, "Белый",
                        800, 100);
                break;
            case SIMPLE_WASHER:
                Thing = new SimpleWasher("Стриральная машина SW100", "Samsung", 3000,
                        50, 50, 150, 20, "Белый", 6,
                        "горизонтальный", 20);
                break;
            case DRYER:
                Thing = new Dryer("Сушильная машина DRYER100", "NotSamsung",
                        1000,50, 50, 150, 20, "Белый",
                        7, "горизонтальный", 30);
                break;
            case TEAPOT:
                Thing = new TeaPot("Термопот Termos", "Vitek", 800, 25,
                        25, 40, "Серебристый","Металл",  5,
                        3);
                break;
            case ELECTRIC_KETTLE:
                Thing = new ElectricKettle("Чайник T4", "Vitek", 600, 20,
                        20, 30, "Прозрачный","Пластик",  2);
                break;
            case MICROWAVE:
                Thing = new Microwave("Микроволновка MW100", "R.S.", 700,
                        40,30, 30, "Белый",9, 600);
                break;
            default:
                throw new IllegalStateException("Неизвестный продукт: " + name);
        }
        return Thing;
    }
}
