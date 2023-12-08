package Week_13.Q_2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(15);
        list.add(1.15);
        list.add(10);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before shuffle : ");
        System.out.println(list);

        shuffleThelist(list);



    }
    public static void shuffleThelist(ArrayList<Number> list){
        Collections.shuffle(list);
        System.out.println("After shuffle : ");
        System.out.println(list);
    }
}
