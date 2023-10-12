package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_30_consecutive_four_number {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] list = makeTheList();
        if (isConsecutiveFour(list)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive four");
        }
    }


    public static int[] makeTheList() {
        System.out.print("Enter the number of values : ");
        int value = input.nextInt();
        System.out.print("Enter the values: ");
        int[] list = new int[value];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();

        }
        return list;

    }

    public static boolean isConsecutiveFour(int[] list) {
        int count = 0;


        for (int i = 0; i < list.length; i++) {

            for (int j = i; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                    break;
                }
            }

        }


        return false;
    }
}

