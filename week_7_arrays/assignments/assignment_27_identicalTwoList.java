package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_27_identicalTwoList {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the  list (Note: first number is the length of list )");
        int[] listOne = enterTheList();
        System.out.println("Enter the second list (Note: first number is the length of list )");
        int[] listTwo = enterTheList();

        boolean isIdentical = isIdentical(listOne, listTwo);
        if (isIdentical) System.out.println("Two lists are identical");
        else System.out.println("Two lists are not identical");

    }

    public static int[] enterTheList() {
        int a = input.nextInt();
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean isIdentical(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        int a =0;
        for (int k : list1) {
            for (int j = 0; j < list1.length; j++) {
                if (k == list2[j]) {
                    a++;
                    break;
                }
            }
        }
        if (a == list1.length)return true;
        else return false;
    }
}
