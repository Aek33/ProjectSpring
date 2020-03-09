package com.main;

import com.appliances.*;
import com.decorator.DecoratorDelivery;
import com.decorator.DecoratorDiscount;
import com.factory.ApplianceFactory;
import com.factory.ApplianceType;

import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        System.out.println("Блок представления продукции");
        ApplianceFactory factory = new ApplianceFactory();
        ArrayList<Appliances> Array = new ArrayList<>(10);
        Appliances Product = null;
        Random chaos = new Random();
        for(int i = 0; i < 10; i++){
            int RandomNumber = chaos.nextInt(7);
            switch (RandomNumber){
                case 0:
                    Product = factory.createThing(ApplianceType.REFRIGERATOR);
                    break;
                case 1:
                    Product = factory.createThing(ApplianceType.SIMPLE_FREEZER);
                    break;
                case 2:
                    Product = factory.createThing(ApplianceType.SIMPLE_WASHER);
                    break;
                case 3:
                    Product = factory.createThing(ApplianceType.DRYER);
                    break;
                case 4:
                    Product = factory.createThing(ApplianceType.ELECTRIC_KETTLE);
                    break;
                case 5:
                    Product = factory.createThing(ApplianceType.TEAPOT);
                    break;
                case 6:
                    Product = factory.createThing(ApplianceType.MICROWAVE);
                    break;
            }
            Array.add(i, Product);
        }
        for (Appliances appliances : Array) {
            appliances.show();
            System.out.println("\n");
        }

        System.out.println("Блок реализации декораторов");

        System.out.println("Создаем экземпляр холодильника");
        Appliances T2000 = factory.createThing(ApplianceType.REFRIGERATOR);

        System.out.println(T2000.getName());
        System.out.println(T2000.TotalPrice());

        System.out.println("Добавляем скидку в 35%");
        T2000 = new DecoratorDiscount(T2000, 35);

        System.out.println(T2000.getName());
        System.out.println(T2000.TotalPrice());

        System.out.println("Добавляем сумму доставки");
        T2000 = new DecoratorDelivery(T2000);

        System.out.println(T2000.getName());
        System.out.println(T2000.TotalPrice());
    }
}
