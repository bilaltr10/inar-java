package week_6.mySpace;

import java.util.*;

//Write a Java function to determine whether two strings are anagrams
// of each other (contain the same characters in a different order).
public class q_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String str_1 = input.nextLine();
        System.out.println("Enter second string");
        String str_2 = input.nextLine();

        if(isAnagram(str_1,str_2)){
            System.out.println("Words are anagrams.");
        }
        else{
            System.out.println("Words are not anagrams.");
        }


    }


    public static boolean isAnagram(String str_1, String str_2) {
        if ((str_1.length() == str_2.length())) {

            for (int i = 0; i < str_1.length(); i++) {
                int count = 0;
                for (int j = 0; j < str_1.length(); j++) {

                    if (str_1.charAt(i) == str_2.charAt(j)) {
                        count++;
                        if (count == 0) {
                            return false;
                        }

                    }

                }
            }
        } else {
            return false;
        }


        return true;
    }

   //chatgpt
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
