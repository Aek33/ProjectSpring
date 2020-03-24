package com.main;

public class LogischesZentrum {
    public double action (double x , double y , String operator){
        switch (operator) {
            case "+":
                return  x + y;
            case "-":
                return  x - y;
            case "/":
                return x / y;
            case "*":
                return x * y;
            default:
                return 0;

        }

    }
}
