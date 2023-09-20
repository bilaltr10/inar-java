package week_5._my_field;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
//Write a Java program to find the longest subarray in an array of integers
// where the sum of the subarray is less than a given target value.
public class find_subarray {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        int [] array = new int [] {5,4,32,54,12,26,9,2,10,11,31,87,56,124,20,6,7,9,12 };

        System.out.println("Bir sayı gir ");
        int input = bilal.nextInt();


        System.out.println(Arrays.toString(findSubarrayWithSum(array, input)));
    }
    public static int[] findSubarrayWithSum(int[] arr, int targetSum) {
        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum == targetSum) {
                    // Found the subarray with the target sum
                    int[] subarray = new int[end - start + 1];
                    System.arraycopy(arr, start, subarray, 0, end - start + 1);
                    return subarray;
                }
            }
        }
        return null; // Subarray not found
    }



}
