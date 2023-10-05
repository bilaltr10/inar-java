package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_2_reverse_int_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number will be entered");
        int number = input.nextInt();

        int [] array = new int [number];

        System.out.println("Enter "+  number+ " integer : ");
        for (int i = 0; i <number ; i++) {
            System.out.print((i+1) +"/"+number +" number : ");
            array[i] = input.nextInt();

        }

        int [] reversedArray = new int [number];

        for (int i = 0; i < number; i++) {
            reversedArray[number-i-1] =array[i];

        }

        for (int a : reversedArray){
            System.out.print(a + " ");
        }
    }
}
