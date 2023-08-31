package week_3.assignements;

import java.text.DecimalFormat;
import java.util.*;

//Write a program that prompts the user to enter
//the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
//to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
//Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
//or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
//Here are the sample runs
public class assignement_31 {

    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        System.out.println("Welcome money exchange center please choose your process\n +" +
                " Press (0) for money exchange of dollars to RBM \n " +
                "Press (1 )for money exchange of RMB to dollars \n" +
                "Current exchange rate from dollars to RBM : 6.81 ");
        int codeOfProcess = bilal.nextInt();

        if (codeOfProcess == 0) {
            System.out.print("Enter the dollar amount :");
            double dollarAmount = bilal.nextDouble();
            double yuanAmount=(int)((dollarAmount * 6.81)*100)/100.0;
            String formettedYuan = decimalFormat.format(yuanAmount);
            String formettedDollar = decimalFormat.format(dollarAmount);
            System.out.println("$" + formettedDollar + " is " +formettedYuan+ " yuan");
        } else if (codeOfProcess==1){
            System.out.println("Enter the yuan amount ");
            double yuanAmount = bilal.nextDouble();
            double dollarAmount = ((int)(yuanAmount / 6.81)*100)/100.0;
            String formettedYuan = decimalFormat.format(yuanAmount);
            String formettedDollar = decimalFormat.format(dollarAmount);
            System.out.println(formettedYuan + " yuan is : " + formettedDollar+ " $");
        }
else{
            System.out.println("Incorrect value ");
        }
    }
}

