package week_12.Q_6;

import java.util.Scanner;

public class NumberFormatException {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
       try{
           System.out.print("Enter a hex number: ");
           String hex = input.nextLine();
           System.out.println("The decimal value for hex number "
                   + hex + " is " + hexToDecimal(hex.toUpperCase()));
       }catch (java.lang.NumberFormatException nfe){
           System.out.println(nfe.getMessage());
       }



    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ((ch >= 'A' && ch <= 'F') || (ch - '0') >= 0 && ch - '0' <= 9) {
            if (ch >= 'A')
                return 10 + ch - 'A';
            else // ch is '0', '1', ..., or '9'
                return ch - '0';
        } else {
            throw new java.lang.NumberFormatException("It is not a hex number. ");
        }

    }
}



