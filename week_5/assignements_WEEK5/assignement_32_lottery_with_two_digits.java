package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_32_lottery_with_two_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birlerbas=0;
        int onlarbas=0;
boolean isSameDigit = true;
        int firstNumberGivenByPc=0;
        int secondNumberGivenByPc=0;
        while(isSameDigit) {
            firstNumberGivenByPc = (int) (Math.random() * 10);
             secondNumberGivenByPc = (int) (Math.random() * 10);
       if (firstNumberGivenByPc==secondNumberGivenByPc) {
           isSameDigit = true;
       }
       else {
         isSameDigit=false;
           }

       }
        System.out.print(firstNumberGivenByPc+""+secondNumberGivenByPc);

        do {
            System.out.print("Enter your lottery pick (two distinct digits ) : ");
            int userInput = input.nextInt();
             birlerbas = userInput % 10;
             onlarbas = userInput / 10;
        } while ((birlerbas == onlarbas)) ;


if ( firstNumberGivenByPc== onlarbas && secondNumberGivenByPc==birlerbas){
    System.out.print("Your award is $10.000");

    }
else if ((firstNumberGivenByPc==onlarbas || firstNumberGivenByPc == birlerbas) && ((secondNumberGivenByPc== onlarbas)||(secondNumberGivenByPc==birlerbas))){

    System.out.print("Your award is $3.000");
}
else if ((firstNumberGivenByPc==onlarbas || firstNumberGivenByPc == birlerbas) || (secondNumberGivenByPc== onlarbas || secondNumberGivenByPc==birlerbas)) {
    System.out.print("Your award is $1.000");
}
else {
        System.out.print("Sorry no match.");
    }



















            }
        }
