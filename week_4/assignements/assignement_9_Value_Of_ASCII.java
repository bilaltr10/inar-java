package week_4.assignements;
import java.util.*;
//(Find the Unicode of a character) Write a program that receives a character and displays its
//Unicode

public class assignement_9_Value_Of_ASCII {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        System.out.println("ASCII değerini öğrenmek istediğiniz bir karakter girin");
        char userInput = bilal.next().charAt(0);

int valueOfChar = userInput;

        System.out.printf("Value of '%c' is : %d",userInput,valueOfChar);

    }
}
