package week_7_arrays.assignments;

import java.util.*;
import java.math.*;

public class assignment_16 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[100000];

        int key = (int) (Math.random() * 100000);
        System.out.println(key);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }


       int timeOfLinearSearch = linearSearch(array, key);
       int timeOfBinarySearch = binarySearch(array, key);
        System.out.println("Execution time of invoking the linear search in milliseconds : "+timeOfLinearSearch);
        System.out.println("Execution time of invoking the binary search in milliseconds : "+timeOfBinarySearch);

    }

    public static int linearSearch(int[] list, int key) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                break;
            }
        }
        long endOfTime = System.currentTimeMillis();

        return (int) (endOfTime - startTime);
    }

    public static int binarySearch(int[] list, int key) {
        Arrays.sort(list);
        int start = 0;
        int end = list.length-1;
        long startTime = System.currentTimeMillis();

        while (end >= start) {
            int middle = (start+end)/2;

            if (list[middle] == key) {
                break;
            } else if (key >list[middle]) {
                start = middle+1;

            }else{
                end = middle-1;

            }


        }
        long endOfTime = System.currentTimeMillis();

        return (int) (endOfTime - startTime);

    }


}
