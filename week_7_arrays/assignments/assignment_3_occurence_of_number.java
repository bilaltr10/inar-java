package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_3_occurence_of_number {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = enterNumber();
        Arrays.sort(array);
        int count;
        int t = 0;
        for (int i = t; i < array.length; i++) {
            count = 0;
            for (int j = t; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            t += count;
            if (count >= 1) {

                write(array[i], count);
            }

        }


    }

    public static int[] enterNumber() {

        int[] array = new int[1000];
        int[] newArray;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            int value = input.nextInt();
            if (value < 0) {
                break;
            } else {
                array[i] = value;
            }
        }
        newArray = new int[i];
        System.arraycopy(array, 0, newArray, 0, newArray.length);

        return newArray;
    }

    // bu kodu sevdimm..........................
    public static int numberOfDifferentNumber(int[] array) {
        Arrays.sort(array);
        int count = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count--;
            }
        }


        return count;
    }


    public static void write(int number, int occurence) {
        System.out.println(number + " occurs " + occurence + (occurence == 1 ? " time " : " times "));


    }


}

