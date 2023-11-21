package week_11.Q_1.Q_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int a = input.nextInt();

        while (a != 0) {
             a = input.nextInt();
            list.add(a);
        }

        System.out.println(MaxElementInArrayList.max(list));
    }
}
