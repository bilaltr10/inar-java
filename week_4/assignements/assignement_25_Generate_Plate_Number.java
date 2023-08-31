package week_4.assignements;

import java.util.*;

//(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
//uppercase letters followed by four digits. Write a program to generate a plate number
public class assignement_25_Generate_Plate_Number {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        char randomNumber =0;
        String total = "";
        char x =0;
        for (int i = 0; i <= 6; i++) {
            if (i <= 2) {
                randomNumber = (char) ((int)( Math.random() * 25)+65);
             //   System.out.print(randomNumber);
              total +=randomNumber;

            }
      else{
           randomNumber = (char)((int)(Math.random()*10)+48);
              //  System.out.print(randomNumber);
              total +=randomNumber;

            }

        }
        System.out.println(total);
    }
}
