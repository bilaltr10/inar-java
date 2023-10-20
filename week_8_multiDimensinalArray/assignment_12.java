package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_12 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double[] rates = ratesMethod();
        int[][] brackets = bracketsMethod();

        int file = askTheFile();
        int amount = askTheAmount();
        double taxAmount = (calculateTax(file, amount, rates, brackets));
        System.out.printf("The tax amount is : $ %.2f  ",taxAmount);

    }

    public static double[] ratesMethod() {
        return new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    }

    public static int[][] bracketsMethod() {
        return new int[][]{
                {8350, 33950, 82250, 171550, 372950}, // S�ngle f�ler
                {16700, 67900, 137050, 20885, 372950}, // Marr�ed jo�ntly
                {8350, 33950, 68525, 104425, 186475}, // Marr�ed separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
    }

    public static int askTheFile() {
        System.out.println("(0-single filer , 1- married jointly or qualifying widow(er), " +
                "2- married seperately ,3-head of household) \n Enter the filing status :  ");
        return input.nextInt();
    }

    public static int askTheAmount() {
        System.out.println("Enter the taxable income : ");
        return input.nextInt();
    }

    public static double calculateTax(int file, int amount, double[] rates, int[][] brackets) {
        double taxAmount = 0;

        int i = 0;

        while (i < 5) {
          if (amount > brackets[file][i] && i <4) {
                taxAmount += brackets[file][i] * rates[i];
                amount = amount - brackets[file][i];
                i++;
            }
            if (amount < brackets[file][i]) {
                taxAmount+= amount * rates[i];
                return taxAmount;
            }
            if(i==4){
              return taxAmount += amount*rates[i];
            }

        }


        return -1;
    }

}
