package week_11.Q_1.Q_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with 0 : ");

        int number = input.nextInt();
        while(number !=0){
            list.add(number);
            number = input.nextInt();
        }

        System.out.println("Before shuffling: ");
        for (int a : list) {
            System.out.print(a + " ");
        }

        Collections.shuffle(list);
        System.out.println("\nAfter shuffling : ");
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
