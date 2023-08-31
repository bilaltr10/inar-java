package week_3.assignements;

import java.util.*;

public class assignement_1 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("(ax2 +bx + c =0) enter a b c whether  it has root or not ");

        double a = bilal.nextDouble();
        double b = bilal.nextDouble();
        double c = bilal.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            System.out.println("it has two roots");
            System.out.println(işlem1(a, b, c) + " " + işlem2(a,b,c));
        } else if (discriminant == 0) {
            System.out.println(" it has one root");
            System.out.println(işlem1(a, b, c));
        } else System.out.println("it has no root");
    }

    public static double işlem1(double a, double b, double c) {
        double r1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
        return (r1);
    }

    public static double işlem2(double a, double b, double c) {
        double r2 = (-b - Math.pow(((b * b) - 4 * a * c), 0.5)) / 2 * a;
return r2;
    }
}
