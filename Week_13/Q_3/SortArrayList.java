package Week_13.Q_3;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(15);
        list.add(1.15);
        list.add(10);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before sort : ");
        System.out.println(list);

        sortThelist(list);



    }
    public static void sortThelist(ArrayList<Number> list){
        System.out.println("After sort : ");
        System.out.println(list);
    }
}
