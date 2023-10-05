package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_9_findSmallestValue {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayLength = assignArrayLenght();
        double[] array = makeArray(arrayLength);
        for (double a : array) {
            System.out.printf("%.1f ", a);
        }
        System.out.println();
        double findTheSmallestInTheArray = findSmallestNumberInTheArray(array);
        System.out.printf("The minimum number is : %.1f ", findTheSmallestInTheArray);
    }


    public static int assignArrayLenght() {
        return (int) (Math.random() * 40) + 10;

    }

    public static double[] makeArray(int arrayLength) {
        double[] array = new double[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = Math.random() * 10;

        }

        return array;
    }

    public static double findSmallestNumberInTheArray(double[] array) {
        double smallest = array[0];
        double temp ;
        for (int i = 1; i < array.length ; i++) {
           for (int j = 0; j <array.length ; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j]= temp;

            }

            }
            smallest= array[i];
        }
        return smallest;
    }


}
