package week_2.denemeler;
import java.util.*;
public class loops_11 {
 //Write a Java program to print the Pascal's triangle of a given number of rows using nested loops.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   "); // Add spaces for formatting
            }
           for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}



