package week_4.assignements;

import java.util.*;
//Write a program that receives an ASCII code (an
//integer between 0 and 127) and displays its character

public class assignement_8_ASCII_value {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

// random alınıyor
        int code = (int) (Math.random() * 128);
        char c = (char) code;
        System.out.printf("The character for ASCII code %d is %c", code, c);


// Bunu da kullanıcı giriyor
        System.out.println("\nEnter and ASCII code ");
        int ascııCode = bilal.nextInt();
        char ofAscııCode = (char) ascııCode;
        System.out.printf("The character for ASCII code %d is %c", ascııCode, ofAscııCode);


    }
}
