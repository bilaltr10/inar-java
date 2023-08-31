package week_3.assignements;

import java.util.*;
//Write a program that prompts the user to enter four points and displays the intersecting
//point (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
//y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
//The intersecting point of the two lines can be found by solving the following
//linear equation:
//(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
//(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
//This linear equation can be solved using Cramer’s rule: to solve the following 2 * 2 system of
//linear equation (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
//(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3


public class assignement_25 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        double x1, x2, x3, x4, y1, y2, y3, y4, x, y;
        System.out.println("enter point A's x and y coordinates");
        x1 = bilal.nextDouble();
        y1 = bilal.nextDouble();
        System.out.println("enter point B's x and y coordinates");
        x2 = bilal.nextDouble();
        y2 = bilal.nextDouble();
        System.out.println("enter point C's x and y coordinates");
        x3 = bilal.nextDouble();
        y3 = bilal.nextDouble();
        System.out.println("enter point D's x and y coordinates");
        x4 = bilal.nextDouble();
        y4 = bilal.nextDouble();


    }
}
