package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_26_StrictlyTwoList {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the  list (Note: first number is the length of list )");
        int[] listOne = enterTheList();
        System.out.println("Enter the second list (Note: first number is the length of list )");
        int[] listTwo = enterTheList();


        boolean isStrictlySame = isStrictlySame(listOne, listTwo);
        if (isStrictlySame) System.out.println("Two lists are strictly identical");
        else System.out.println("Two lists are not strictly identical");

    }

    public static int[] enterTheList() {
        int a = input.nextInt();
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean isStrictlySame(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }
        return true;
    }


}
