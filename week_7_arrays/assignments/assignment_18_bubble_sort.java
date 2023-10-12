package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_18_bubble_sort {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] list = new double[10];

        System.out.print("Enter ten number : ");

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random()*100;
            System.out.printf("%.1f  ",list[i]);
        }

        System.out.println();

        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length- 1-i; j++) {

                if (list[j] > list[j + 1]) {
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        for (double  a : list) {
            System.out.printf("%.1f ", a);
        }

    }


}
