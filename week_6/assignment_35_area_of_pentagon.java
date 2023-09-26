package week_6;

import java.util.Scanner;

public class assignment_35_area_of_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side o pentagon:");
        double sideOfPentagon = input.nextDouble();

        double areaOfPentagon = area(sideOfPentagon);
        System.out.println("The area of pentagon is : " +areaOfPentagon);
    }

    public static double area(double sideOfPentagon ){

        return (5*Math.pow(sideOfPentagon,2))/(4*Math.tan(Math.PI/5));
    }
}
