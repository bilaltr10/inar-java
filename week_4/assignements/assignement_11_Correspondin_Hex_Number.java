package week_4.assignements;

import java.util.*;

//(Decimal to hex) Write a program that prompts the user to enter an integer between 0 and
//15 and displays its corresponding hex number.
public class assignement_11_Correspondin_Hex_Number {

    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        System.out.println("Write an integer between 0 and 15 for its corresponding hex number ");
       String number = bilal.next();

        int value=Integer.parseInt(number) ;
        boolean isTrue = value <= 15 && value >= 0; //16 = false

        if (isTrue) {
            switch (value) {

                case 0:
                    number = number;
                    break;
                case 1:
                    number = number;
                    break;
                case 2:
                    number = number;
                    break;
                case 3:
                    number = number;
                    break;
                case 4:
                    number = number;
                    break;
                case 5:
                    number = number;
                    break;
                case 6:
                    number = number;
                    break;
                case 7:
                    number = number;
                    break;
                case 8:
                    number = number;
                    break;
                case 9:
                    number = number;
                    break;
                case 10:
                    number = "A";
                    break;
                case 11:
                    number = "B";
                    break;
                case 12:
                    number = "C";
                    break;
                case 13:
                    number = "D";
                    break;
                case 14:
                    number = "E";
                    break;
                case 15:
                    number = "F";
                    break;


            }
            System.out.println("The hex value is : " + number);

        }

         else {
            System.out.printf("%s is out of boundaries between %d and %d ", number, 0, 15);
        }

    }
}
