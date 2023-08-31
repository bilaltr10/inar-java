package week_2.denemeler;
import java.util.*;
//Create a Java program that generates a multiplication table for numbers from 1 to 10 using nested loops.
public class loops_14 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner (System.in);
      int sonuç =0;
        for ( int i = 1; i <=10 ; i++) {
            for (int m = 1; m <= 10; m++) {
                sonuç = i * m;
                System.out.print("     " +sonuç+"     " );

            }
            System.out.println();

        }

        }

}
