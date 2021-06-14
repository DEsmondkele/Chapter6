package com.chapter6.assignment;

import java.util.Scanner;

public class MinimumNumber {
    public float number;

    public float getNumber1() {
        float number1;
        Scanner collector = new Scanner(System.in);
        System.out.println("Enter a Desired Digits or Number:");
        number1 = collector.nextFloat();
        return number1;
    }

    public float getNumber2() {
        float number2;
        Scanner collector = new Scanner(System.in);
        System.out.println("Enter a Desired Digits or Number:");
        number2 = collector.nextFloat();
        return number2;
    }

    public float checkInput() {

        number = Math.min(getNumber1(), getNumber2());
        return number;
    }
}

