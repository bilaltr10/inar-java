package week_6;

import java.util.Scanner;

public class assignment_15_Financial_application_print_a_tax_table_yet {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int taxableIncome = 50000;
        int status = 0;

        writeTopSide();

        while (taxableIncome <= 60000 ) {

            System.out.printf("%-20d", taxableIncome);

            while (status < 4) {

                System.out.printf("%-22.0f", computeTax(status, taxableIncome));
                status++;
            }
            System.out.println();
            status = 0;
            taxableIncome += 50;

        }


    }


    public static void writeTopSide() {

        System.out.printf("%-20s %-20s %-20s %-20s %s %n", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("%-10s%45s%16s%20s%n", "Income", "or Qualfiying", "Seperate", "a House");
        System.out.printf("%51s %n", "Widow(er)");
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }


    public static double computeTax(int status, double taxableIncome) {

        if (status == 0) {
            return single(taxableIncome);
        } else if (status == 1) {
            return marriedFilingJointly(taxableIncome);
        } else if (status == 2) {
            return marriedFilingSeparately(taxableIncome);
        } else if (status == 3)
            return headOfHousehold(taxableIncome);

        return 1;
    }


    public static double single(double tax) {
        if (tax <= 8350) {
            return tax * 0.10;
        } else if (tax <= 33950) {
            return 8350 * 0.10 + (tax - 8350) * 0.15;
        } else if (tax <= 82250) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(tax-33950) * 0.25;
        } else if (tax <= 171950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(tax-82250) * 0.28;
        } else if (tax <= 372950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(tax-171950) * 0.33;
        } else {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(372950-171950) * 0.33+(tax-372950) * 0.35;
        }
    }

    public static double marriedFilingJointly(double tax) {
        if (tax <= 16700) {
            return tax * 0.10;
        } else if (tax <= 67900) {
            return 16700 * 0.10 + (tax - 16700) * 0.15;
        } else if (tax <= 82250) {
            return 16700 * 0.10 + (67900 - 16700) * 0.15+(tax-67900) * 0.25;
        } else if (tax <= 171950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(tax-82250) * 0.28;
        } else if (tax <= 372950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(tax-171950) * 0.33;
        } else {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(372950-171950) * 0.33+(tax-372950) * 0.35;
        }
    }

    public static double marriedFilingSeparately(double tax) {
        if (tax <= 8350) {
            return tax * 0.10;
        } else if (tax <= 33950) {
            return 8350 * 0.10 + (tax - 8350) * 0.15;
        } else if (tax <= 68525) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(tax-33950) * 0.25;
        } else if (tax <= 171950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(tax-82250) * 0.28;
        } else if (tax <= 372950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(tax-171950) * 0.33;
        } else {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(372950-171950) * 0.33+(tax-372950) * 0.35;
        }
    }

    public static double headOfHousehold(double tax) {
        if (tax <= 11950) {
            return tax * 0.10;
        } else if (tax <= 45500) {
            return 11950 * 0.10 + (tax - 11950) * 0.15;
        } else if (tax <= 117450) {
            return 11950 * 0.10 + (45500 - 11950) * 0.15+(tax-45500) * 0.25;
        } else if (tax <= 171950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(tax-82250) * 0.28;
        } else if (tax <= 372950) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(tax-171950) * 0.33;
        } else {
            return 8350 * 0.10 + (33950 - 8350) * 0.15+(82250-33950) * 0.25+(171950-82250) * 0.28+(372950-171950) * 0.33+(tax-372950) * 0.35;
        }
    }
}


