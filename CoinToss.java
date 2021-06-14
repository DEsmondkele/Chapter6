package com.chapter6.assignment;

public class CoinToss {


        public static boolean flip() {
            String[] choices = {"1","2"};
            int length = choices.length;
            int rand1 = (int) (Math.random()*length);
            boolean result = false; // Default Tails
            String num = choices[rand1];
            if(num == "1") {
                result = true; //Heads
            }
            return result;
        }
}
