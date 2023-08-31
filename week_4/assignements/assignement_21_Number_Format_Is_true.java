package week_4.assignements;

import java.util.*;

//(Check SSN) Write a program that prompts the user to enter a Social Security number in the
//format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is
//valid. Here are sample runs
public class assignement_21_Number_Format_Is_true {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Enter your security number as follows XXX-XX-XXXX");
        String securityNumberOfCitizen = bilal.next();

        if (securityNumberOfCitizen.indexOf("-") == 3 || securityNumberOfCitizen.indexOf("-") == 6) {
            System.out.printf("%s is a valid security number",securityNumberOfCitizen);
        }
        else
            System.out.printf("%s is not a valid security number ",securityNumberOfCitizen);


    }
}
