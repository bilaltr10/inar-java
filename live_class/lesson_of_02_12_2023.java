package live_class;

import exception.ArrayList;

public class lesson_of_02_12_2023 {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
           list.add("bid");
           list.add("bid");
           list.add("bid");
           list.add("bid");
           list.add("bid");
           list.add("bid");
        list.trimToSize();
        System.out.println(list);
    }
}
