package week_2.assıgnements;
import java.util.*;
public class assignement_7 {
    public static void main (String [] args){
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the number of minutes to see it in year and days version");
        double  minutes = bilal.nextDouble();
        double  year = 365*24*60;
        int year_min=( int) (minutes/year);
        double days = 24*60;
        int days_min = (int)((minutes%year)/days);
        System.out.println(minutes +" minutes is approximetely " + year_min +" years " +
                days_min+ " days");


    }
}
