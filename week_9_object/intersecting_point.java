package week_9_object;

import java.util.Scanner;

public class intersecting_point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4");
        double x1 = input.nextDouble();
        double y1= input.nextDouble();
        double x2 = input.nextDouble();
        double y2= input.nextDouble();
        double x3 = input.nextDouble();
        double y3= input.nextDouble();
        double x4= input.nextDouble();
        double y4= input.nextDouble();


        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if (!Double.isInfinite(linearEquation.getY())|| !Double.isInfinite(linearEquation.getX())){
            System.out.println("The intersecting point is ("+linearEquation.getX()+" , "+linearEquation.getY()+")");
        }
        else{
            System.out.println("These two lines are parallel");
        }
    }
}
