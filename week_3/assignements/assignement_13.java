package week_3.assignements;

import java.text.DecimalFormat;
import java.util.*;


public class assignement_13 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Enter Your Filing Status ");
        int filingStatus = bilal.nextInt();
        System.out.println("Enter your income");
        double income = bilal.nextDouble();
        double yourTax = 0;
        switch (filingStatus) {
            case 0:
                if (0 <= income && income < 8350) yourTax = income * 0.10;
                else if (8351 <= income && income <= 33950) yourTax = income * 0.15;
                else if (33951 <= income && income <= 82250) yourTax = income * 0.25;
                else if (82251 <= income && income <= 171550) yourTax = income * 0.28;
                else if (171551 <= income && income <= 372950) yourTax = income * 0.33;
                else yourTax = income * 0.35;

            case 1:
                if (0 <= income && income <= 16700) yourTax = income * 0.10;
                else if (16701 <= income && income <= 67900) yourTax = income * 0.15;
                else if (67901 <= income && income <= 137050) yourTax = income * 0.25;
                else if (137051 <= income && income <= 208850) yourTax = income * 0.28;
                else if (208851 <= income && income <= 372950) yourTax = income * 0.33;
                else yourTax = income * 0.35;

            case 2:
                if (0 < income && income <= 8350) yourTax = income * 0.10;
                else if (8351 <= income && income <= 33950) yourTax = income * 0.15;
                else if (33951 <= income && income <= 68525) yourTax = income * 0.25;
                else if (68526 <= income && income <= 104425) yourTax = income * 0.28;
                else if (104426 <= income && income <= 186475) yourTax = income * 0.33;
                else yourTax = income * 0.35;
            case 3:
                if (0 < income && income <= 11950) yourTax = income * 0.10;
                else if (11951 <= income && income <= 45500) yourTax = income * 0.15;
                else if (45551 <= income && income <= 117450) yourTax = income * 0.25;
                else if (117451 <= income && income <= 190200) yourTax = income * 0.28;
                else if (190201 <= income && income <= 372950) yourTax = income * 0.33;
                else yourTax = income * 0.35;

        }
        DecimalFormat writeNumber = new DecimalFormat("# , ###");
        String formattedNumber = writeNumber.format(income);
        double value = ((int) (yourTax * 100) / 100.0);
        String formettedTax = writeNumber.format(value);
        System.out.println(" Your tax for "+formattedNumber+"dollars is " +formettedTax +"dollars");

    }
}
