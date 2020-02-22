package com.main;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

       // ElectricKettle EKAry[] = new ElectricKettle[5];
       // for (int i = 0; i < 5; i++) {
       //     EKAry[i] = new ElectricKettle("Модель", "Производитель", 600, "Пластик",
       //             "Черный", 3);
       //     EKAry[i].show();
       // }
        ElectricKettle EK100 = new ElectricKettle("EK100", "Vitek", 600, "Металл",
                "Серебристый", 2);
        ArrayList<ElectricKettle> ElectricKettles = new ArrayList<>();
        ElectricKettles.add(EK100);
        ElectricKettles.get(0).show();
    }
}
