package week_2.denemeler;
import java.text.DecimalFormat;
import java.util.*;
//Write a Java program that takes an integer input and prints the factorial of that number using a while loop.
public class loops_2 {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);
        System.out.println("write a number to see its factorial value ");
        int number = bilal.nextInt();
        int a = 1;
        int b = 0;
        int array_make = 1;
        int[] array = new int[number];
        int total = 1;
        System.out.print(number + " ! :" + number);
        while (a <= number) {

            total *= a;
            array[b] = a;
            //  System.out.print(array[b]+" * ");
            a++;
            b++;
        }


        for (int i = number - 1; i >= 1; i--) {
            System.out.print(" * " + array[i - 1]);
        }
        System.out.println();
        if (number <= 6) {
            System.out.print(number + "! is : " + total);
        } else {
            DecimalFormat format = new DecimalFormat("#,###");
            String formattedNumber = format.format(total);
            System.out.println(number + "! is : " + formattedNumber);
        }

    }


}
