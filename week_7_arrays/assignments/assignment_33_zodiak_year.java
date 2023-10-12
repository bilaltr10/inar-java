package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_33_zodiak_year {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] namesOfYears = new String[]{"MONKEY","ROOSTER","DOG","PİG",
                "RAT","OX","TIGER","RABBIT","DRAGON","SNAKE","HORSE","SHEEP"};


        System.out.print("Enter a year : ");
        int year = input.nextInt();

        System.out.println(year+" is a year of "+namesOfYears[year%12]+" in zodiac. ");






    }
}
