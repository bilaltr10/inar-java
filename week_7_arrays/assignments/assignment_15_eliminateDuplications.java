package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_15_eliminateDuplications {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("%45s %n","Eliminate Duplicates ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*15);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNew format : ");
        for (int a : eliminateDuplicates(array)) {
            System.out.print(a + " ");


        }
    }

    public static int[] eliminateDuplicates(int[] array) {

        int[] onlyOnes = new int[10];
        int m = 0;
        boolean isTrue = true;
        for (int i = 0; i < array.length; i++) {
            isTrue = true;
            for (int j = 0; j < onlyOnes.length; j++) {
                if (array[i] == onlyOnes[j]) {
                    isTrue = false;
                    break;
                }

            }
            if (isTrue) {
                onlyOnes[m] = array[i];
                m++;
            }

        }
        int[] newArray = new int[m];
        System.arraycopy(onlyOnes, 0, newArray, 0, newArray.length);
        return newArray;
    }
}
