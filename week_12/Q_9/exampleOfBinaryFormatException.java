package week_12.Q_9;

import java.util.Scanner;

public class exampleOfBinaryFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        try {
            String number = input.next();
            System.out.println("The decimal value for binary number " + number + " is " + changeToBinary(number));
        } catch (BinaryFormatException bfe) {
            System.out.println(bfe.toString());
        }
    }

    public static int changeToBinary(String number) throws BinaryFormatException {
        for (int i = 0; i < number.length(); i++) {
            if (!(number.charAt(i) == '0' || number.charAt(i) == '1')) {
                throw new BinaryFormatException("It is not a binary number ");
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
