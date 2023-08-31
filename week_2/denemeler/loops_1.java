package week_2.denemeler;

import java.util.*;

public class loops_1 {
    public static void main(String[] args) {

      for (int i = 1; i <= 5; i++) {
            for (int m = 1; m < i+1; m++) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}

/*Write a Java program to print the following pattern using nested loops:
1
12
123
1234
12345
123456
1234567*/