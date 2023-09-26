package week_6;

import java.util.Scanner;
//shows how to test whether a point is on the left
//side of a directed line, on the right, or on the same line. Write the methods with the
//following headers:
public class assignment_39_Geometr_point_position {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x coordinate of P0");
        double x0= input.nextDouble();
        System.out.println("Enter the y coordinate of P0");
        double y0= input.nextDouble();
        System.out.println("Enter the x coordinate of P1");
        double x1= input.nextDouble();
        System.out.println("Enter the y coordinate of P1");
        double y1= input.nextDouble();
        System.out.println("Enter the x coordinate of P2");
        double x2= input.nextDouble();
        System.out.println("Enter the y coordinate of P2");
        double y2= input.nextDouble();



        if (leftOfTheLine(x0,y0,x1,y1,x2,y2)){
            System.out.printf("(%.1f , %.1f) %s (%.1f , %.1f) to (%.1f ,  %.1f)",x2,y2," is on the left side of the line from ",x0,y0,x1,y1);
        }
        else if (onTheSameLine(x0,y0,x1,y1,x2,y2)){
            System.out.printf("(%.1f , %.1f) %s (%.1f , %.1f) to (%.1f ,  %.1f)",x2,y2," is on the line segment from ",x0,y0,x1,y1);

        }
         else if (onTheRightSegment(x0,y0,x1,y1,x2,y2)){
            System.out.printf("(%.1f , %.1f) %s (%.1f , %.1f) to (%.1f ,  %.1f)",x2,y2," is on the right side of the  line from ",x0,y0,x1,y1);
    }
    }




    public static boolean leftOfTheLine(double x0, double y0,double x1, double y1, double x2, double y2){
return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)>0;

    }


    public static boolean onTheSameLine(double x0, double y0,double x1, double y1, double x2, double y2){
        return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)==0;

    }

    public static boolean onTheRightSegment(double x0, double y0,double x1, double y1, double x2, double y2){
        return (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)<0;

    }

}
