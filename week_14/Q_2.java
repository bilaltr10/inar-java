package week_14;

import java.util.*;

/*Write a Java program that generates an ArrayList containing 50 random Integer numbers
between 0 and 100 and then removes any duplicate numbers from the list. Display the list*/
public class Q_2 {
    public static void main(String[] args) {
        ArrayList<Integer > list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int)(Math.random()*100));
        }
        Set<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("list : "+ list);

        uniqueNumbers.addAll(list);

        System.out.println("Set : "+ uniqueNumbers);

        System.out.println("Number of removed numbers : " +(list.size()- uniqueNumbers.size()) );
    }
}
