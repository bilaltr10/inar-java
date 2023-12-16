package week_14;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Objects;

public class Q_13 {

    public static void main(String[] args) {

        ArrayList<Integer> list = generateNumbers();


        System.out.println("Generated Integers : " + list);

        ArrayList<Integer> numberMoreThanThree = elementsMoreThanThree(list);
        System.out.println("Elements appearing more than n/3 times : " + (numberMoreThanThree.isEmpty() ?" No item ": numberMoreThanThree));
    }

    public static ArrayList<Integer> elementsMoreThanThree(ArrayList<Integer> str) {

        Collections.sort(str);

        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.size() - 1; i++) {
            if (Objects.equals(str.get(i), str.get(i + 1))) {
                count++;
                if (count >= 3) {
                    list.add(str.get(i));
                }
            } else {
                count = 1;
            }

        }

        return list;
    }

    public static ArrayList<Integer> generateNumbers() {
        int numberOfIntegers = (int) (Math.random() * 25 + 10);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfIntegers; i++) {
            int a = (int) (Math.random() * 20);
            list.add(a);
        }
        return list;
    }

}
