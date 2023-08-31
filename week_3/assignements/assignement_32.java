package week_3.assignements;

import java.util.*;

//Write a program that prompts the user to enter the three points for p0, p1, and p2
//and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
//the same line
//(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) >0 p2 is on the left side of the line //=0 p2 is on the same line
//<0 p2 is on the right side of the line

public class assignement_32 {

    public static void main(String[] args) {
        writings();
    }


    public static void ifSection(double result, double x0 ,double y0 , double x1 ,double y1, boolean a){
        if (result > 0) {
            System.out.print(" is on the left side");
        } else if (result == 0 && a) {
            System.out.print(" is on the same line but not on the same line segment");
        }
        else if (result==0 && !a) {
            System.out.println(" is on the same line and on the same line segment");
        }
        else {
            System.out.print(" is on the right side");
        }
        sonyazı(x0,y0,x1,y1);

    }



       public static void sonyazı ( double x0 , double y0,double x1, double y1){
       System.out.print(" of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }


    public static double calculate(double x0, double y0, double x1, double y1, double x2, double y2) {
        double result = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
        boolean resultofLineSegment =((x1-x0 )<(x2-x0)) && ((y1-y0)<(y2-y0)) ;
        ifSection(result ,x0 ,y0,x1,y1,resultofLineSegment);
        return result;

    }
public static double writings (){
        Scanner bilal = new Scanner(System.in);
        double x0, y0, y1, x1, x2, y2;
        System.out.println("Enter the X0 ");
        x0 = bilal.nextDouble();
        System.out.println("Enter the Y0 ");
        y0 = bilal.nextDouble();
        System.out.println("Enter the X1 ");
        x1 = bilal.nextDouble();
        System.out.println("Enter the Y1 ");
        y1 = bilal.nextDouble();
        System.out.println("Enter the X2 ");
        x2 = bilal.nextDouble();
        System.out.println("Enter the Y2 ");
        y2 = bilal.nextDouble();
    System.out.print("(" + x2 + " , " + y2 + ") point ");
    double result = calculate(x0, y0, x1, y1, x2, y2);
   return result;
    }

}

