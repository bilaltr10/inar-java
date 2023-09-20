package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Find the smallest n such that 𝑛*n > 12,000) Use a while loop to �nd the smallest
//integer n such that 𝑛 is greater than 12,000
public class assignement_12_smallest_n_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      int n = 0;
        while (n*n <=12000) {
            n++;
        }

        System.out.println("Smallest n " + (-n));
        System.out.println(n*n);
    }

}
