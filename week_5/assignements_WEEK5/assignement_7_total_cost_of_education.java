package week_5.assignements_WEEK5;

import java.util.Scanner;

//Chapter 5 Exercise 7:
// *
// *      (Financial application: compute future tuition)
// *      Suppose that the tuition for a university is $10,000 this year and
// *      increases 5% every year. In one year, the tuition will be $10,500.
// *      Write a program that computes the tuition in ten years and the total
// *      cost of four years’ worth of tuition after the tenth year.
// *
public class assignement_7_total_cost_of_education {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fark = 0;
        double tuition_for_a_university = 10000;
        final double increase_every_year = 0.05;
        double total_cost = 0;
        final int todays_year = 2023;
        double years_later_tutution = 10000;
        double total = 0;
        System.out.println("How many years later you will start your education of university :");
        int start_years_later = input.nextInt();
        System.out.println("In how many year you are plannig to finish your education :");
        int lenght_of_university = input.nextInt();

        int years_of_total = start_years_later + lenght_of_university;

        for (int i = 1; i <= years_of_total; i++) {

            if (i <= start_years_later) {
                years_later_tutution *= (1 + increase_every_year);

                if (i == start_years_later) {
                    fark = years_later_tutution - tuition_for_a_university;
                    tuition_for_a_university += fark;
                }

            } else {

                tuition_for_a_university *= (1 + increase_every_year);
                total += tuition_for_a_university;
            }

        }
        System.out.println("In the year of " + (todays_year + start_years_later) + " tutution will be : " + years_later_tutution);
        System.out.println("Your " + lenght_of_university + " years of  total university tutution from "+(todays_year+start_years_later)+" to "+(todays_year+years_of_total)+
                " will be :" + total);


    }
}


