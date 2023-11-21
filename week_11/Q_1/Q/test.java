package week_11.Q_1.Q;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color");
        String color = input.next();
        System.out.println("Is the triangle filled T/F : ");
        boolean filled = input.next().equals("true");

        Triangle test = new Triangle(side1, side2, side3, color, filled);

        System.out.println(test);
        System.out.println("Area : " + test.getArea());
        System.out.println("Perimeter : " + test.getPerimeter());
        System.out.println("Color : " + test.getColor());
        System.out.println("Triangle is "+(test.getFilled() ? "" : "not")+" filled.");

    }
}
