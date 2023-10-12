package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_19_isSorted {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the list");
        int arrayLenght = input.nextInt();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = input.nextInt();

        }

        if (isSorted(array)) {
            System.out.println("The list is already sorted ");
        } else {
            System.out.println("The list is not sorted ");
        }
    }

    public static boolean isSorted(int[] array) {
        boolean isSorted = true;

        if (array[0] > array[1]) {

            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array.length - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        return false;
                    }
                }
            }
        }

        return isSorted;
    }


}
