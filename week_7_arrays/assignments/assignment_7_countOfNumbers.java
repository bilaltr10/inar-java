package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_7_countOfNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = generateNumber();
        int[] countOfNumbers = countNumbers(array);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "s : " + countOfNumbers[i]);

        }


    }

    public static int[] generateNumber() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10);
        }


        return array;
    }

    public static int[] countNumbers(int[] array) {
        int[] numbersInArray = new int[10];
        int z = 0;
        int i =0;
        for ( i = 0; i < 10; i++) {
          int  count = 0;
            for (int m = 0; m < array.length; m++) {
                if (i == array[m]) {
                    count++;
                }
            }
            numbersInArray[i] = count;

        }


        return numbersInArray;
    }
}
