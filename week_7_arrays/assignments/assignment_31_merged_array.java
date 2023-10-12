package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_31_merged_array {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] listOne = enterList();

        Arrays.sort(listOne);
        for (int a : listOne) {
            System.out.print(a + " ");
        }
        System.out.println();
        int[] listTwo = enterList();

        Arrays.sort(listTwo);
        for (int a : listTwo) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : merge2(listOne, listTwo)) {
            System.out.print(a + " ");

        }
    }

    public static int[] enterList() {
        System.out.print("Enter the number of numbers will be entered : ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        return list;
    }

    public static int[] merge2(int[] list1, int[] list2) {
        int[] mergedArray = new int[list1.length + list2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < list1.length + list2.length; i++) {
            if (a < list1.length && b < list2.length) {
                if (list1[a] < list2[b]) {
                    mergedArray[i] = list1[a];

                    a++;
                } else {
                    mergedArray[i] = list2[b];

                    b++;
                }
            } else {
                if (a == list1.length) {

                    mergedArray[i] = list2[b];
                    b++;

                } else {
                    mergedArray[i] = list1[a];
                    a++;

                }
            }

        }

        return mergedArray;

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedArray = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, mergedArray, 0, list1.length);
        System.arraycopy(list2, 0, mergedArray, list1.length, list2.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }
}
