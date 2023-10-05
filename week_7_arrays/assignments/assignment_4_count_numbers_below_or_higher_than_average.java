package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_4_count_numbers_below_or_higher_than_average {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter scores (negative number signifies end) : ");
        int[] scores = enterNumber();
        double averageOfScores = average(scores);
        int more = moreThanAverage(scores, averageOfScores);
        int less = lessThanAverage(scores, averageOfScores);
        System.out.println("Number of scores above or equal to average : " + more);
        System.out.println("Number of scores below average : " + less);


    }

    public static int[] enterNumber() {

        int[] array = new int[1000];
        int[] newArray;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            int value = input.nextInt();
            if (value < 0) {
                break;
            } else {
                array[i] = value;
            }
        }
        newArray = new int[i];
        System.arraycopy(array, 0, newArray, 0, newArray.length);

        return newArray;
    }

    public static double average(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];

        }
        return total / array.length;
    }

    public static int moreThanAverage(int[] array, double average) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }

        }

        return count;
    }

    public static int lessThanAverage(int[] array, double average) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                count++;
            }

        }

        return count;
    }

}
