package week_6;

import java.util.Scanner;

public class assignment_36_area_of_polygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides : ");
        int numberOfsides = input.nextInt();
        System.out.println("Enter the side : ");
        double side = input.nextDouble();

       double areaOfPolygon = area ( numberOfsides,side);

        System.out.println("The area of polygon is : " + areaOfPolygon);
    }

    public static double area(int numberOfSides , double side ){

        return (numberOfSides*Math.pow(side,2)) / (4*Math.tan(Math.PI/numberOfSides));



    }
}
