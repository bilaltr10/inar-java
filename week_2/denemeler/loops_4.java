package week_2.denemeler;
import java.lang.*;
import java.util.*;

//Write a Java program to determine if a given number is a prime number using a for loop.
public class loops_4 {

    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
String yes ;
       do {
           System.out.println("write a number to learn whether it's prime or not");
           int sonuç = 0;
           int isPrime = bilal.nextInt();
           for (int i = 2; i <= Math.pow(isPrime, 0.5); i++) {

               sonuç = isPrime % i;
               if (sonuç == 0) {
                   break;
               }

           }
           if (sonuç == 0) System.out.println(isPrime + " is not prime number ");
           else System.out.println(isPrime + " is a prime number");
           System.out.println("please type yes to enter new number ");
            yes= bilal.next();
       }
       while(yes.equals("yes"));
        System.out.println("thank for using our app");

    }


}
