package com.chapter6.assignment;

public class PerfectNumbersMain {
    public static void main(String[] args) {

        for (int num = 1; num <= 10000; num++) {
            if (PerfectNumbers.isPerfect(num)) {
                System.out.println( num + " is a perfect number.");
            }
        }

    }
}
