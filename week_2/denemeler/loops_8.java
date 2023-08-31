package week_2.denemeler;

import java.util.*;

public class loops_8 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("kaç haneli bir password istiyorsunuz");
        int lenghtOfPassword = bilal.nextInt();
        int değer;

        for (int i = 1; i <= lenghtOfPassword; i++) {

            değer = 33 + (int) (System.currentTimeMillis() % Math.random() * 100);

            char char1 = (char) değer;
            System.out.print("  " + char1 + "  ");

        }
    }
}