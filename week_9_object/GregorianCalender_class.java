package week_9_object;

import java.util.*;

import static javax.swing.UIManager.get;


public class GregorianCalender_class {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println("Current year : " + date.get(GregorianCalendar.YEAR));
        System.out.println("Current month : "+ date.get(GregorianCalendar.MONTH));
        System.out.println("Current day : "+ date.get(GregorianCalendar.DAY_OF_MONTH));

        date.setTimeInMillis(1234567898765L);
        System.out.println("\n\nAfter the setTime");
        System.out.println("Current year : " + date.get(GregorianCalendar.YEAR));
        System.out.println("Current month : "+ date.get(GregorianCalendar.MONTH));
        System.out.println("Current day : "+ date.get(GregorianCalendar.DAY_OF_MONTH));
    }


}
