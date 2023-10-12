package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_21_ballFell {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many ball you will send :");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the number of slot in machine : ");
        int numberOfSlots = input.nextInt();
        int count;

        int[] ballsInSlot = new int[numberOfSlots];
        for (int a = 0; a < numberOfBalls; a++) {
            count = 0;
            String str = "";
            for (int i = 0; i < numberOfSlots; i++) {
                int direction = (int) (Math.random() * 2);
                if (direction == 0) {
                    str += "L";
                } else {
                    str += "R";
                    count++;

                }
            }
            System.out.println(str + "   " + count);
            ballsInSlot[count]++;
        }

        for (int i = 0; i < ballsInSlot.length; i++) {
            System.out.println((i + 1) + " : slot : " + ballsInSlot[i]);
        }

        System.out.println();
        int[] biggestumber = new int[numberOfSlots];
        System.arraycopy(ballsInSlot, 0, biggestumber, 0, biggestumber.length);
        Arrays.sort(biggestumber);
        int a = biggestumber[biggestumber.length - 1];


        for (int d = 0; d < a; d++) {
            for (int i = 0; i < ballsInSlot.length; i++) {
                makespaces(i);
                if (a - d <= ballsInSlot[i]) {
                    System.out.printf("\b%s", "0");

                }
            }
            System.out.println();

        }

        System.out.println();
        for (int i = 0; i < numberOfSlots + 1; i++) {
            int m =i%9;
            makespaces(i);

            System.out.printf("\b%d", (m + 1));

        }
    }


    public static void makespaces(int a) {
        System.out.print(" ");
    }
}
