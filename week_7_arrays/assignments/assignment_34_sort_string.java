package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_34_sort_string {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a string to sort : ");
        String str = input.next();
        System.out.println("Sorted form : " + sort(str));

    }

    public static String sort(String str) {

        int[] array = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);

        }
        Arrays.sort(array);
        String newWord = "";
        for (int i = 0; i < array.length; i++) {
            newWord += (char) (array[i]);
        }

        return newWord;
    }


}
