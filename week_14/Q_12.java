package week_14;

import java.util.*;

/*Write a Java program that prompts the user to input a String 's'. Implement a method to
find and return the index of the first non-repeating character(incase-sensitive) in the
String. If no such character exists, return -1. Use the entered String 's' as an argument in the
method*/
public class Q_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = input.nextLine().replace(" ", "").toUpperCase(Locale.ROOT);


        int indis = findTheFirstNonRepeatingCharacter(str);
        if (indis == -1) {
            System.out.println("There is no non-repeating character.");
        } else {
            System.out.printf("The first non-repeating character is  '%c' : %d. character of the string", str.charAt(indis), indis + 1);
        }

    }

    public static int findTheFirstNonRepeatingCharacter(String str) {

        int[] numbers = new int[128];

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            numbers[a]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (numbers[str.charAt(i)] == 1) {
                return i;
            }

        }

        return -1;
    }
// testCases: iloveInarAcadeMy  **  bilalbil1al

}
