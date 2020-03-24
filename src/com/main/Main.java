package com.main;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main{
    public static void main(String[] args) {
        LogischesZentrum Daemon = new LogischesZentrum();
        double result = 0.0;
        double One;
        double Two;
        while (true) {
            Scanner calcScanner = new Scanner(System.in);
            System.out.println("Введите пример с одним двействием!");

            if (calcScanner.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)") != null) {


                if (calcScanner.match().group(1) != null) {
                    One = parseDouble(calcScanner.match().group(1));
                    Two = parseDouble(calcScanner.match().group(3));
                    result = Daemon.action(One, Two, calcScanner.match().group(2));

                } else {
                    Two = parseDouble(calcScanner.match().group(3));
                    result = Daemon.action(result, Two, calcScanner.match().group(2));

                }
                System.out.println(result);

            }

            else {
                System.out.println("Введите корректные значения!");
            }

        }
    }
}
