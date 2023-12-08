package Week_13.Q_1;

import java.util.Objects;
import java.util.Scanner;

public class testOfTriangleClass {
    public static void main(String[] args) {
       GeometricObject bilal = new TriangleClass();


        Scanner input = new Scanner(System.in);
        System.out.print("Enter three side of triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color : ");
        String color = input.next();

        System.out.print("Enter : isFilled true/false : ");
        boolean isFilled = Objects.equals(input.next(),"true");

        TriangleClass triangleClass = new TriangleClass(side1,side2,side3,"red",isFilled);
        System.out.println(triangleClass);
    }
}
