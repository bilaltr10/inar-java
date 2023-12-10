package week_14;

import java.util.ArrayList;
import java.util.Collections;

/*Generate an ArrayList with 10 random Integer numbers and an integer k, return the kth
largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct elemen*/
public class Q_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        int random = (int) (Math.random() * list.size());
        System.out.println("k : " + random);
        Collections.sort(list);
        System.out.println(random+ "th element is " + list.get(random));
    }
}
