package week_11.Q_1.Q_14;

import java.util.ArrayList;

public class CombineTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(8);
        list1.add(4);
        list1.add(45);
        list1.add(123);
        list1.add(10);
        list1.add(5);
        list2.add(999);
        list2.add(10);
        list2.add(47);
        list2.add(87);
        list2.add(81);
        list2.add(28);
        System.out.println(union(list1, list2).toString());


    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){

        list1.addAll(list2);

        return list1;
    }
}
