package com.chapter6.assignment;

import java.util.Scanner;

public class PrimeNumbers {
        
    public static boolean isPrime(int number) {

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0 || number % Math.sqrt(number) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check for prime:");
        int num= input.nextInt();
        System.out.println("Prime numbers from 1 to " + num +" are: ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}