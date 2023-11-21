package week_10.Q_5;

import java.util.Scanner;
import java.util.Stack;

public class Displaying_Prime_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        int[] list = findTheFactors(number);

        StackOfIntegers stack = new StackOfIntegers();

// write decreasing order;
        System.out.print("Decreasing order : ");
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != 0) {
                System.out.print(list[i] + " ");
                stack.push(list[i]);
            }
        }
        System.out.println();
        System.out.print("We used pop() method : ");
        for (int i = stack.getSize() - 1; i >= 0; i--) {

            System.out.print(stack.pop() + " ");

        }

    }


    public static int[] findTheFactors(int number) {
        int x = (int) Math.sqrt(number);
        int[] numbers = new int[x];
        int m = 2;
        int indis = 0;
        while (number != 1) {
            if (number % m == 0) {
                numbers[indis] = m;
                number /= m;
                indis++;
            } else {
                m++;
            }
        }
        return numbers;
    }

}


