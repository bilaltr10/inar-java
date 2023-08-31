package week_2.denemeler;
//Write a Java program that takes a string input and prints the reverse of that string without
// using the built-in reverse() function.

import java.util.*;

public class loops_9 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("type sth");
        String typed = bilal.nextLine();
        char [] array = new char[typed.length()];
        array =typed.toCharArray();

        for(int i =typed.length()-1; i>= 0 ; i-- ) {

            System.out.print(array[i] + "  " );

        }


    }
}

