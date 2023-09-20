package week_6;

import java.util.Scanner;

public class assignment_1_get_and_write_pentagonal_numbers {

    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            getPentagonalNumber(i);

        }
    }


    public static void getPentagonalNumber(int number) {
        int pentagonalNumber = number * (3 * number - 1) / 2;
        writeThePentagonalNumber(pentagonalNumber);
    }

    public static void writeThePentagonalNumber(int number) {
        System.out.printf("%5d %s", number, " ");
        count++;
        if (count % 10 == 0)
            System.out.println();


    }


}
