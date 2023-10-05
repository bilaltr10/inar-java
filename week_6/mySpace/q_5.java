package week_6.mySpace;

import java.util.Scanner;

//Design a Java function that finds the length of the
// longest substring without repeating characters in a given string.
public class q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str = input.nextLine();

        System.out.println("cvc : " + longest_substring_without_repeating_characters(str));
    }

    public static String longest_substring_without_repeating_characters(String str) {
        int j = 0;
        String a = "";
        String longest = "";
        for (int i = 0; i < str.length() - 1; i++) {
            a = Character.toString(str.charAt(i));
            for (j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                } else if (a.contains(Character.toString(str.charAt(j)))) {
                    break;
                }
                a += Character.toString(str.charAt(j));

            }
            if (a.length() > longest.length()) {
                longest = a;

            }
        }

        return longest;
    }


}