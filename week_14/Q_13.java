package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q_13 {

    public static void main(String[] args) {

        ArrayList<Integer> list = generateNumbers();


        System.out.println("Generated Integers : " + list);

        ArrayList<Integer> numberMoreThanThree = elementsMoreThanThree(list);
        System.out.println("Elements apeearing more than n/3 times : " + (numberMoreThanThree.size()==0 ?" No item ": numberMoreThanThree));
    }

    public static ArrayList elementsMoreThanThree(ArrayList str) {

        Collections.sort(str);

        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.size() - 1; i++) {
            if (str.get(i) == str.get(i + 1)) {
                count++;
                if (count >= 3) {
                    list.add((Integer) str.get(i));
                }
            } else {
                count = 1;
            }

        }

        return list;
    }

    public static ArrayList generateNumbers() {
        int numberOfIntegers = (int) (Math.random() * 25 + 10);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfIntegers; i++) {
            int a = (int) (Math.random() * 20);
            list.add(a);
        }
        return list;
    }

}
