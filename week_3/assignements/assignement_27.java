package week_3.assignements;

import java.util.*;

//Suppose a right triangle is placed in a plane as
//shown below. The right-angle point is placed at (0, 0), and the other two points
//are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
//a point with x- and y-coordinates and determines whether the point is inside the
//triangle.

public class assignement_27 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Our triangle is on orjine write its values as x and y");
        double xOfTriangle = bilal.nextDouble();
        double yOfTriangle = bilal.nextDouble();
        double z = yOfTriangle / xOfTriangle;  // tanjantınıda alamk lazım giderek azalıyor ya üçgen

        System.out.println("writte values ");
        double x = bilal.nextDouble();
        double y = bilal.nextDouble();
        if ((x > xOfTriangle || y > yOfTriangle) || (y > (x * z)))
            System.out.println("( " + x + " , " + y + " ) is not in the triangle ");
        else System.out.println("( " + x + " , " + y + " ) is in the triangle ");

    }
}
