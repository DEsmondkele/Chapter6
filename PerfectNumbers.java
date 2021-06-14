package com.chapter6.assignment;

public class PerfectNumbers{
            public static Boolean isPerfect(int number) {
                int sum = 0;
                for (int factor = 1; factor < number; factor++) {
                    if (number % factor == 0) {
                        sum += factor; }
                }
                if (sum == number) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }