package week_11.Q_1.Q_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sumOfArraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("Sum of list : " + sum(list));
    }

    public static double sum(ArrayList<Double> list) {

        //cars.remove(0);
        //cars.size();

        double total = 0;
        while (!list.isEmpty()) {
            total += list.get(0);
            list.remove(0);
        }


        return total;
    }
}
