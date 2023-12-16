package week_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_21 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = writeListes(1);
        ArrayList<Integer> list2 = writeListes(2);

        System.out.println("Intersection of the two list : " + intersections(list1,list2));
    }

    public static ArrayList<Integer> writeListes(int m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first list-" + m + " : ");
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int a = input.nextInt();
            if (a > 0) list.add(a);
            else break;
        }
        return list;
    }
public static ArrayList<Integer> intersections(ArrayList<Integer> list1, ArrayList<Integer> list2){
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < list1.size(); i++) {
        if(list2.contains(list1.get(i))){
            list.add(list1.get(i));
        }
    }
    return list;

}


}
