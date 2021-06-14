package com.chapter6.assignment;

import java.util.Scanner;

public class PointsDistance {

    public void setPoints(){
     Scanner input=new Scanner(System.in);
        System.out.println("Enter the coordinates of points X1,Y1,X2, and Y2 : ");

        System.out.println("Enter the coordinate of x1 to start: ");

        while (input.hasNext()) {
           
            double x1 = input.nextDouble();
            System.out.println("Enter y1  coordinate:");
            double y1 = input.nextDouble();
            System.out.println("Enter x2  coordinate:");
            double x2 = input.nextDouble();
            System.out.println("Enter y2 coordinate:");
            double y2 = input.nextDouble();

            double distance = distance( x1, y1, x2, y2 );
            System.out.printf( "Distance is %f\n\n", distance );
        }
    }

    private double distance(double x1, double y1, double x2, double y2) {
          return Math.sqrt( Math.pow( ( x1 - x2 ), 2 ) +
           Math.pow( ( y1 - y2 ), 2 ) );
        }
}
