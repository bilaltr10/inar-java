package week_6.mySpace;

import java.util.Scanner;

//Write a Java function to find the most frequently occurring word
// in a given paragraph, ignoring capitalization and punctuation.
public class q_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine()+" ";

        int numberOfwords = findTheNumberOfWords(str);

        String[] array = assignTheWordToArray(str, numberOfwords);

        most_frequently_occurringword(array);


    }

    public static int findTheNumberOfWords(String str) {
        str = str + " ";
        char ch = ' ';
        int word = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                word++;
            }
        }
        word--;
        return word;
    }


    public static String[] assignTheWordToArray(String str, int word) {
        String[] array = new String[word];
        char ch = ' ';
        int m = 0;
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                array[m] = str.substring(j, i);
                j = i + 1;
                m++;
            }


        }
        return array;
    }

    public static void most_frequently_occurringword(String[] array) {

        int max = 0;
        String maxWord = "";
        int count = 0;
        for (String s : array) {
            count = 0;
            for (int k = 0; k < array.length; k++) {
                if (s.equals(array[k])) {
                    count++;
                }

            }
            if (count > max) {
                maxWord = s;
                max = count;
            }
        }

        System.out.println(maxWord + " " + max);
    }
}

