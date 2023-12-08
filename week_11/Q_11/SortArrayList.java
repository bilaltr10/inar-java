package week_11.Q_1.Q_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0 : ");

        int number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (number !=0 ){
            list.add(number);
            number = input.nextInt();
        }

        System.out.println("Before sorting..");
        for(int a : list){
            System.out.print(a+" ");

        }

        Collections.sort(list);
        System.out.println("After sorting..");
        for(int a : list){
            System.out.print(a+ " ");
        }


    }
}
