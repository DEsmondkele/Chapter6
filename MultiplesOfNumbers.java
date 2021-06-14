package com.chapter6.assignment;
import java.util.Scanner;
public class MultiplesOfNumbers {
        public static void main ( String [] args) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter two integer values separated by spaces: ");
            int num1= input.nextInt();
            int num2= input.nextInt();
            Boolean result = isMultiple(num1,num2);

            System.out.printf("%S ", result);
        }


        public static Boolean isMultiple(int num1,int num2)
        {
            boolean result;
            int quotient = num2%num1;
            if (quotient == 0)
                result = true;
            else
                result = false;
            return result;
        }
    }
