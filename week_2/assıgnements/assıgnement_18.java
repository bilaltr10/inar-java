package week_2.assıgnements;
import java.util.*;
public class assıgnement_18 {
    public static void main ( String [] args ){

        Scanner bilal = new Scanner ( System.in);
        System.out.println("how many columns you want to see");
        int column = bilal.nextInt();
        System.out.print("a        ");
        System.out.print("b     ");
        System.out.println("pow(a,b)");
        for ( int i = 1; i<column; i++) {
            int a =i;
            int b =i+1;
            int c =(int) Math.pow(a,b);
            System.out.print(a+"        ");
            System.out.print(b+"      ");
            System.out.println(c+"      ");
        }





    }
}
