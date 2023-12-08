package week_14;

import java.util.ArrayList;
import java.util.Scanner;

/*Generate an ArrayList with random Integer numbers, design and implement a method that
rearranges the elements such that all odd numbers appear before all even numbers. The
order of odd and even numbers within their respective groups should be preserved.*/
public class Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (-1 for exit)");

        int number = scanner.nextInt();
        while (number != -1) {
            list.add(number);
            number = scanner.nextInt();
        }

        ArrayList<Integer> newArray = new ArrayList<>();
        for (int element : list) {
            if (element %2 != 0) {
                newArray.add(element);
            }
        }

        for (int element : list) {
            if (element  %2 == 0) {
                newArray.add(element);
            }
        }

        System.out.println(newArray);

    }
}
