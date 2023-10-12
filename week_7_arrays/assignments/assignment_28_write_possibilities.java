package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

// kadere saygısızlık olmasın diye içimiz yana yana tebessüm ediyoruz.
public class assignment_28_write_possibilities {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] list = enterList();
        combinations(list);


    }

    public static int[] enterList() {
        System.out.print("Enter the number of numbers will be entered : ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void combinations(int [] list){
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j <list.length ; j++) {
                if(list[i]!=list[j])
                System.out.printf("[ %d , %d ]%n", list[i] , list[j]);
            }

        }

    }

}
