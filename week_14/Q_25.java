package week_14;

import java.util.ArrayList;

public class Q_25 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Generated ArrayList : ");
        System.out.println(list);

        int generatedTargetSum = (int) (Math.random() * 150);
        System.out.println("Generated Target Sum : " + generatedTargetSum);

        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            int first = list.get(i);
            int remain = generatedTargetSum - first;
            if (list.contains(remain) ) {
                System.out.println("Numbers are " + first + " , " + remain);
                System.out.println("Result : " + true);
                result = true;
                break;
            }
        }
        if (!result)
            System.out.println("Result : " + result);

    }
}
