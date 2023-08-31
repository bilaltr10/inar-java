package week_4.assignements;
import java.util.*;
//Write a program that displays a random uppercase letter
//using the Math.random() method.
public class assignement_16_Char_Equal_To_Letter {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        for ( int i = 0 ; i<=5 ; i++){
            int randomNumber = 65+(int)(Math.random()*26);
char letterOfRandomNumber = (char)randomNumber;
            System.out.printf("The %d is equals to %c\n",randomNumber,letterOfRandomNumber);
        }

    }
}
