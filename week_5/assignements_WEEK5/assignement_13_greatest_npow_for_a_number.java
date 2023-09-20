package week_5.assignements_WEEK5;

import java.util.Scanner;
//(Find the largest n such that 𝑛 < 12,000) Use a while loop to �nd the largest n pow(3)
//integer n such that 𝑛 is less than 12,000
public class assignement_13_greatest_npow_for_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
int counter = 1;

        while (Math.pow(counter,3)<12000) {

      counter++;
        }
        System.out.println("The largest n is : "+(counter-1));
    }
}
