package week_5._my_field;

import java.util.*;

public class findNine {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        int[] array = new int[]{1, 5, 3, 5, 45, 78, 12, 45, 36, 10, 5, 9, 4, 3, 6, 5, 1, 0, 6, 9, 54, 65, 89};

        System.out.println("Bir sayı yazın ");
        int number = bilal.nextInt();

        for (int i = 0; i < array.length / 2; i++) {
            if (number == array[i]) {
                System.out.printf("%d is in the %d . number of the array ", number, i);
                System.out.println("");
            }

        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {

            if (number == array[i]) {
                System.out.printf("%d is in the %d. number of the array ", number, i);
            }
        }



    }
}
