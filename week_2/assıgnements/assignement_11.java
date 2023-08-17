package week_2.assıgnements;

import java.text.DecimalFormat;
import java.util.*;

public class assignement_11 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        int current_population = 312032486;
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(current_population);
        System.out.println("In the year of 2010 America'S current population is :" +formattedNumber);
        System.out.println("for how many year's population project you want to sea ");
        int year = bilal.nextInt();
        int year_now = 2010 + year;
        int one_year_seconds = 365 * 24 * 60 * 60;
        int one_birth_every_sec = one_year_seconds / 7;
        int one_death_every_sec = one_year_seconds / 13;
        int one_new_immigrant_sec = one_year_seconds / 45;
        int projected_poulation = current_population + (year * (one_birth_every_sec + one_new_immigrant_sec - one_death_every_sec));
         decimalFormat = new DecimalFormat("#,###");
    String  formattedNumber1= decimalFormat.format(projected_poulation);
        System.out.println("In the years of " + year_now +" America's population projection is "+ formattedNumber1);

    }
}
/*(Population projection ) The U.S. Census Bureau projects population based on the
following assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
■ Current population is 312,032,486
Write a program to prompt the user to enter the number of years and displays the
population after the number of years*/
