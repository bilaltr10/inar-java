package week_10.Q_6;

import week_10.Q_5.StackOfIntegers;

import java.util.Scanner;

public class Displaying_The_Prime_Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

       while (!stack.empty()){
           System.out.print(stack.pop()+" ");
       }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
