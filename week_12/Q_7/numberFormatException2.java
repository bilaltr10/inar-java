package week_12.Q_7;

import java.util.Scanner;

public class numberFormatException2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        try {
            String number = input.next();
            System.out.println("The decimal value for binary number " + number + " is " + changeToBinary(number));
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
    }

    public static int changeToBinary(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!(number.charAt(i) == '0' || number.charAt(i) == '1')) {
                throw new NumberFormatException("It is not a binary number ");
            }
        }
        return findTheBinaryNumber(number);
    }


    public static int findTheBinaryNumber(String number) {
        int decimalNumber = 0;
        for (int i = 0; i < number.length(); i++) {
            decimalNumber += (int) ((number.charAt(i) - '0') * Math.pow(2, i));
        }
        return decimalNumber;
    }

}
