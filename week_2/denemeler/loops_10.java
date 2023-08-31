package week_2.denemeler;

import java.util.*;

public class loops_10 {
    //Implement the Sieve of Eratosthenes algorithm in Java to print all prime numbers up to a given limit.
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("up to what number you want to inspect ");
        int upToWhat = bilal.nextInt();
        int sonuç=0;

        for (int i = upToWhat ; i >= 3; i--) {

            for (int m = 2; m <= Math.pow(upToWhat, 0.5); m++) {
                sonuç = upToWhat % m;
                if (sonuç == 0) {
                    break;
                }
            }
            if (sonuç != 0) System.out.print(upToWhat + " * ");

            upToWhat--;
        }
        System.out.println("3 * 2");  // bunları nasıl yaparız
    }
}