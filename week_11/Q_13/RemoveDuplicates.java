package week_11.Q_1.Q_13;

import java.util.ArrayList;

import java.util.Objects;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter Ten Integers : ");
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 9));

        }
        System.out.print(list);


        removeDuplicate(list);
        System.out.print("\nDistinct  ıntegers are : (" + list.size() + " numbers) : \n");
        System.out.println(list);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                  list.remove(j);
                  j--;
                }
            }
        }


    }
}
