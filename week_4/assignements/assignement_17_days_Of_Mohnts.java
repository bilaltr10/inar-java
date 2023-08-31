package week_4.assignements;
import java.util.*;
//Write a program that prompts the user to enter a year and the
//�rst three letters of a month name (with the �rst letter in uppercase) and displays
//the number of days in the month.
public class assignement_17_days_Of_Mohnts {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = bilal.nextInt();
                System.out.println("Enter the the Month with its first 3 letter  ");
                String month = bilal.next();
                String monthdWithBigLetter= month.toUpperCase();


                switch (month) {
                    case "Jan":
                        System.out.println("January "+ year + " has " +31+ " days ");break;
                    case "Feb":
                        if ( (year %4==0 && !(year%100==0)) || year % 400 ==0){
                            System.out.println(monthdWithBigLetter+" " + year + " has " + 29 + " days ");
                        }
                        else {
                            System.out.println(monthdWithBigLetter+" " + year + " has " + 28 + " days ");
                        }
                        break;
                    case "Mar":
                        System.out.println(monthdWithBigLetter+" "+ year + " has " +31+ " days ");break;
                    case "Apr":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +30+ " days ");break;
                    case "May":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +31+ " days ");break;
                    case "Jun":

                        System.out.println(monthdWithBigLetter+" " + year + " has " +30+ " days ");break;
                    case "Jul":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +31+ " days ");break;
                    case "Aug":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +31+ " days ");break;
                    case "Sep":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +30+ " days ");break;
                    case "Oct":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +31+ " days ");break;
                    case "Nov":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +30+ " days ");break;
                    case "Dec":
                        System.out.println(monthdWithBigLetter+" " + year + " has " +31+ " days ");break;



                }
            }
        }


