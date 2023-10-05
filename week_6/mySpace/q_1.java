package week_6.mySpace;

import java.util.Scanner;

//Write a Java program to reverse a
// given string without using any library functions or built-in methods.
public class q_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println(reverse(str));
    }


    public static String reverse(String str) {

        char[] charArray = str.toCharArray();

        int length = charArray.length;

        char[] reversedStr = new char[length];

        for (int i = 0; i < length; i++) {

            reversedStr[i] = charArray[length - i - 1];

        }
        String reversed = new String(reversedStr);   // yeni öğrendim

        int x =20;


        return reversed;
    }
}
