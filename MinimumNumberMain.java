package com.chapter6.assignment;

public class MinimumNumberMain {
    public static void main(String[] args) {
        for(int i=0;i<=2;i++) {
            MinimumNumber getValues = new MinimumNumber();
            System.out.println("The minimum number is :" + getValues.checkInput());
        }
    }
}
