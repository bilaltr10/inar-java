package week_11.Q_1.Q_17;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = input.nextInt();
        PerfectSquare test = new PerfectSquare(m);
        System.out.print("The smallest number for m*n to be a perfect square is : ");
      System.out.println(test.perfectSquadre());
        System.out.print("m*n :" );
        System.out.println(test.list);
        System.out.println(test.value*test.perfectSquadre());
    }
}
