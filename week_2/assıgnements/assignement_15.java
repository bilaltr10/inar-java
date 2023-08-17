package week_2.assıgnements;
import java.util.*;
// (Geometry: distance of two points) Write a program that prompts the user to enter two
//points (x1, y1) and (x2, y2) and displays their distance between them
public class assignement_15 {
    public static void main ( String [] args ){
       Scanner bilal = new Scanner ( System.in);
        double x1 , x2 , y1 ,y2 ;
        System.out.println( " hey guys this program will show you distance between two points ");
        System.out.println("ok lets start with the values  of first point   " );
        System.out.println("enter x and y of this point ");
        x1 = bilal.nextDouble();
        y1 = bilal.nextDouble();
        System.out.println("entre the x and y of the point ");
        x2 = bilal.nextDouble();
        y2 = bilal.nextDouble();
        System.out.println("distance between  x("+(x1)+" , "+(y1)+" )" +" y("+x2+" , " +y2+ " ) is "+
             Math.pow (Math.pow((x2 - x1 ),2)+Math.pow((y2-y1),2),0.5));





    }
}
