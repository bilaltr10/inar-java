package week_6.mySpace;

import java.util.Locale;
import java.util.Scanner;

//Develop a Java program that counts the number of
// vowels and consonants in a given string, ignoring spaces and non-alphabetic characters.
public class q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER A STRING ");
        String str = input.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Number of vovels in your string : " + vovels(str));
        System.out.println("Number of consonant in your string : " + consonant(str));
    }


    public static int vovels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

    public static int consonant(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'o')) {
                    count++;
                }
            }
        }
        return count;

    }
}
