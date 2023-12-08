package week_14;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/*Write a Java program that takes ‘n’ Integer numbers in ArrayList, nums, as input. Move all
occurrences of 0 to the end of the ArrayList while preserving the relative order of the
non-zero elements*/
public class Q_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (-1 for exit)");

        int number = 1;
        while (number != -1) {
            number = scanner.nextInt();
            list.add(number);
        }

        ArrayList<Integer> newArray = new ArrayList<>();
        for (int element : list) {
            if (element != 0) {
                newArray.add(element);
            }
        }

        for (int element : list) {
            if (element == 0) {
                newArray.add(element);
            }
        }

        System.out.println(newArray);


    }

}
