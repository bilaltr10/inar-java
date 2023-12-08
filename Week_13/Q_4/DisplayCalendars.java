package Week_13.Q_4;

import java.io.File;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendars {
    Calendar calendar;

    int year;
    int month;
    final int FIRST_DAY =1;

    DisplayCalendars() {
        this(2023, 1);
    }

    DisplayCalendars(int year, int month) {
        this.year = year;
        this.month = month;
        calendar = new GregorianCalendar(year, month, FIRST_DAY);
    }


    public String namesOfMonths() {
        return switch (month) {
            case 1 -> "January" ;
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "cxc";
        };
    }

    public int dayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
    public int daysOfMonth(){
        LocalDate suAnkiTarih = LocalDate.of(year,month,1);

     return suAnkiTarih.lengthOfMonth();

    }


    public void writeTheCalender() {
        int dayOfWeek = 7-dayOfWeek();
        System.out.println(dayOfWeek);
        String nameOfMonth = namesOfMonths();
        int daysOfMonth = daysOfMonth();

        System.out.println("           " + nameOfMonth + "  " + year);
        System.out.println("--------------------------------");
        System.out.println("SUN  MON  THE  WED  THU  FRI  SAT ");

        for (int i = 1; i <= daysOfMonth; i++) {
            if (i == 1) {
                makeSpaces(dayOfWeek);
            }
            System.out.printf("%-5d", i);


            dayOfWeek++;
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
        }
    }


    public void makeSpaces(int dayOfWeek) {

        if (dayOfWeek % 7 == 0) {
            System.out.printf("%-1s ", " ");
        }
        if (dayOfWeek % 7 == 1) {
            System.out.printf("%-4s ", " ");
        }
        if (dayOfWeek % 7 == 2) {
            System.out.printf("%-9s ", " ");

        }
        if (dayOfWeek % 7 == 3) {
            System.out.printf("%-14s ", " ");
        }
        if (dayOfWeek % 7 == 4) {
            System.out.printf("%-19s ", " ");

        }
        if (dayOfWeek % 7 == 5) {
            System.out.printf("%-24s ", " ");
        }
        if (dayOfWeek % 7 == 6) {
            System.out.printf("%-29s ", " ");
        }
    }
}