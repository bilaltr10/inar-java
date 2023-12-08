package week_14;
/*Write a Java program that generates ten Integers and displays them in reverse order using
an ArrayList. Display both lists*/

import java.util.ArrayList;
import java.util.Collections;

public class Q_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*250));
        }
        System.out.println(" list : " +list);

        Collections.reverse(list);
        System.out.println("Reverse list : "+ list);
    }
}
