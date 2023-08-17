package week_2.assıgnements;
import java.util.*;
/*Convert feet �nto meters) Wr�te a program that reads a number �n feet, converts �t to

meters, and d�splays the result. One foot �s 0.305 meter.*/
public class assignement_3 {
    public static void main (String [] args ){
        Scanner bilal =new Scanner(System.in);
        System.out.println("enter the feet value to learn in form of meter");
        double feet = bilal.nextDouble();
        System.out.println(feet+" feet is "+(feet*0.305)+" meter ");


    }
}
