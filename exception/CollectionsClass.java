package exception;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsClass {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String str = "";
            int a = 0;
            while (a != 5) {
                str += (char) ((Math.random() * 25) + 97);
                a++;
            }
            list.add(str);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // iterator.remove();
        }

        List<String> anotherList = new java.util.ArrayList<>();
        anotherList.add("C++");
        anotherList.add("JavaScript");

        list.addAll(anotherList);

        System.out.println(Collections.frequency(list, "obls"));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        list.removeAll(anotherList);
        System.out.println(list);
        String[] array = list.toArray(new String[3]);
        for(String a : array) System.out.println(a+" ");


    }
}
