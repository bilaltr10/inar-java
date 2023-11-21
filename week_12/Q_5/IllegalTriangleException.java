package week_12.Q_5;

import week_11.Q_1.Q.GeometricObject;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of tringle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle obj = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException ite) {
            System.out.println("Oppps!! Check the values");
        }

    }

}

class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) throw new IllegalTriangleException();
        if (side1 + side2 < side3) throw new IllegalTriangleException();
        else if (side2 + side3 < side1) throw new IllegalTriangleException();
        else if (side1 + side3 < side2) throw new IllegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double s_total = getPerimeter() / 2;
        return Math.sqrt(s_total * (s_total - side1) * (s_total - side2) * (s_total - side3));

    }

    @Override
    public String toString() {
        return "Triangle: side1 = " +
                side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
