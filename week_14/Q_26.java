package week_14;

import java.util.LinkedList;

public class Q_26 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(34);
        list.add(74);
        list.add(70);
        list.add(58);
        list.add(35);

        System.out.println("Original linkedList  : "+ list);
        for (int i = 0; i < list.size()-1; i++) {
            int gdc = findTheGCD(list.get(i), list.get(i + 1));
            list.add(i+1, gdc);
            i++;
                    }
        System.out.println("Updated linkedList : "+list);
    }

    public static int findTheGCD(int a, int b) {

        for (int i = Math.min(a, b); i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }

        }
        return 1;
    }
}
