package week_3.assignements;

import java.util.*;


public class assignement_3 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        //    x= ed-bf/ad-bc
        //    y= af-ec/ad-bc*/
       double a ,b ,c ,d ,e, f;
        System.out.println("enter a b c d e f");
        System.out.print(" a ="); a=bilal.nextDouble();
        System.out.print(" b =");b = bilal.nextDouble();
        System.out.print(" c =");c = bilal.nextDouble();
        System.out.print(" d ="); d = bilal.nextDouble();
        System.out.print(" e ="); e = bilal.nextDouble();
        System.out.print(" f =");f = bilal.nextDouble();
        if (a * d - b * c == 0) System.out.println("The equation has no solution");
        else {
            double x = ((e * d) - (b * f)) / (a * d) - (b * c);
            double y = ((a * f) - (e * c) )/ (a * d) - (b * c);
            System.out.println(" x :" + x + " y : " + y);
        }
    }
}
