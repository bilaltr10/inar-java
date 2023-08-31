package week_2.denemeler;
import  java.util.*;
//Write a Java program to calculate the sum of the series 1/2 + 2/3 + 3/4 + ... + n/(n+1) using a loop.
public class loops_6 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("until where you want to go ");
        int goThere = bilal.nextInt();
        double result =0;
        for (int i =1 ; i<=goThere; i++){
            result +=  ((double)i/(i+1));
            System.out.print(((double)i/(i+1)) +" ");

        }
        System.out.println("\nyour result : "+ result);










    }
}
