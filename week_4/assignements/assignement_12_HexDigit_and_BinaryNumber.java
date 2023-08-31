package week_4.assignements;

import java.util.*;
//(Hex to binary) Write a program that prompts the user to enter a hex digit and displays its
//corresponding binary number.

public class assignement_12_HexDigit_and_BinaryNumber {

    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        System.out.print("Enter an hex digit ");
        String hexDigit = bilal.next();

        char c = hexDigit.charAt(0);

        int numberFromString = (int) c;
        boolean isTrue = (numberFromString >= 48 && numberFromString <= 57) || (numberFromString >= 65 && numberFromString <= 70) || (numberFromString >= 97 && numberFromString <= 102);

        //   CharSequence charSequence="123456789ABCDEFabcdef"; BUNU ÖĞREN...
        //  boolean isTrue = hexDigit.contains(charSequence);

        if (isTrue) {

            switch (hexDigit) {

                case "0":
                    hexDigit = "0000";
                    break;
                case "1":
                    hexDigit = "0001";
                    break;
                case "2":
                    hexDigit = "0010";
                    break;
                case "3":
                    hexDigit = "0011";
                    break;
                case "4":
                    hexDigit = "0100";
                    break;
                case "5":
                    hexDigit = "0101";
                    break;
                case "6":
                    hexDigit = "0110";
                    break;
                case "7":
                    hexDigit = "0111";
                    break;
                case "8":
                    hexDigit = "1000";
                    break;
                case "9":
                    hexDigit = "1001";
                    break;
                case "A":
                    hexDigit = "1010";
                    break;
                case "B":
                    hexDigit = "1011";
                    break;
                case "C":
                    hexDigit = "1100";
                    break;
                case "D":
                    hexDigit = "1101";
                    break;
                case "E":
                    hexDigit = "1110";
                    break;
                case "F":
                    hexDigit = "1111";
                    break;
                case "a":
                    hexDigit = "1010";
                    break;
                case "b":
                    hexDigit = "1011";
                    break;
                case "c":
                    hexDigit = "1100";
                    break;
                case "d":
                    hexDigit = "1101";
                    break;
                case "e":
                    hexDigit = "1110";
                    break;
                case "f":
                    hexDigit = "1111";
                    break;
            }
            System.out.printf("The binary number is : %s", hexDigit);
        } else {
            System.out.printf("%s is an invalid input ", hexDigit);
        }

    }
}
