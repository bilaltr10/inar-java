package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_8_two_overloadedMethods_findAverage {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double[] array = writeArray();

        double resultDouble = average(array);
        System.out.println("The average value : " + resultDouble);
    }

    public static double[] writeArray() {
        System.out.println("Write ten number : ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }

    public static int average(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result/array.length;
    }


    public static double average(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result/array.length;
    }
}