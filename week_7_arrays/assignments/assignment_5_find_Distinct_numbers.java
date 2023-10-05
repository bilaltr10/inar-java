package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_5_find_Distinct_numbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = enterNumber();
        for (int a :
                array) {
            System.out.print(a + " " );
        }
       int[] distinctNumber = distinctNumber(array);


        System.out.println();


        for (int a : distinctNumber) {
            System.out.print(a + " ");
        }
    }

    public static int[] enterNumber() {
     int [] array = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] =input.nextInt();

        }

        return array;
    }

    public static int[] distinctNumber(int[] array) {
        //    Arrays.sort(array);
        int[] distinctNumbers = new int[6];
        int m = 0;
        boolean isTrue;
        for (int i = 0; i < array.length; i++) {
            isTrue = true;
            for (int j = 0; j < distinctNumbers.length; j++) {
                if (array[i] == distinctNumbers[j]) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                distinctNumbers[m] = array[i];
                m++;
            }
        }

        return distinctNumbers;

    }


}



