package week_3.assignements;

import java.util.*;
//Write a program to display the hour using a 12-hour clock.You can use this
//method to obtain the current time, and then compute the current second,
//minute, and hour as follows

//soru : mesela saat 1 de 01 diye nasıl yazdırabiliriz

public class assignement_30 {
    public static void main(String[] args) {
      Scanner bilal = new Scanner(System.in);

        System.out.println(System.currentTimeMillis());

        long totalSeconds = System.currentTimeMillis() / 1000;
        int currentSecond =(int) (totalSeconds % 60);

        long totalMinutes =totalSeconds/60;
        int currentMinutes =(int)( totalMinutes%60);

        long totalHours = totalMinutes/60;
        int currentHour=(int)( totalHours%24);

       System.out.println(currentHour+ " "+ currentMinutes+" " + currentSecond);

        System.out.println("Enter the time zone offset to GMT ( Turkey GMT+3)");
        int offsetOfGMT = bilal.nextInt();
             int currentTimeOfChosenTimeZome=( currentHour + offsetOfGMT) % 24 ;

        System.out.println("Time of GMT+"+offsetOfGMT+ " --->" +currentTimeOfChosenTimeZome + ":"+ currentMinutes+ ":"+ currentSecond);
    }
}
