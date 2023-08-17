package week_2.assıgnements;
import java.util.*;
public class assignement_5 {
    public static void main (String [] args){
       Scanner bilal = new Scanner(System.in);
        System.out.println("enter the values of subtotal firstly  and then gratuite ");
        double subtotal =bilal.nextDouble();
        double gratuite_rate = bilal.nextDouble();
        System.out.println("subtotal ="+subtotal+" $ "+" gratuite rate = % "+gratuite_rate);
        double gratuite =(subtotal /100)*gratuite_rate;
        System.out.println("gratuite = "+gratuite+" $");
        System.out.println("total = " + (gratuite +subtotal)+ "$");

    }




}
