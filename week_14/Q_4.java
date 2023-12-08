package week_14;
/*Write a Java program that prompts the user to enter ‘n’ Integers for ArrayList A and
ArrayList B from the console. Sort ArrayList A in ascending order and B in descending
order. Implement a user-defined method to merge these ArrayLists and create a third
ArrayList C with elements sorted in ascending order. Use ArrayLists A, B, and C as
arguments in the method. Display the contents of the resulting ArrayList C*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for size of first array : ");
        int sizeOfFirstArray = scanner.nextInt();
        ArrayList<Integer> firstList = makeTheList(sizeOfFirstArray,scanner);

        System.out.println("Enter the n for size of  second array : ");
        int sizeOfSecondArray = scanner.nextInt();
        ArrayList<Integer> secondList = makeTheList(sizeOfSecondArray,scanner);

        ascendingOrder(firstList);
        descendinOrder(secondList);

        System.out.println("First List :"+firstList);
        System.out.println("Second List :"+secondList);
        ArrayList<Integer> thirdList=  mergeAndSortArrayLists(firstList,secondList);
        System.out.println("Third list : "+ thirdList);

    }

    public static ArrayList<Integer> makeTheList(int size, Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=size; i++) {
            System.out.println("Enter the "+ i+"/"+size+ "number");
            list.add(scanner.nextInt());
        }
        return list;
    }
    public static void  ascendingOrder(ArrayList<Integer> list){
         Collections.sort(list);
    }
    public static void descendinOrder(ArrayList<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
    }

    private static ArrayList<Integer> mergeAndSortArrayLists(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>(A);
        C.addAll(B);

      //  Collections.sort(C);

        return C;
    }
}
