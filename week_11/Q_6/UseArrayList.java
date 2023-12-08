package week_11.Q_1.Q_6;

import week_10.Q_11.Circle2D;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Object loan = new Loan();
        Object circle = new Circle2D();
        Object date = new Date();
        Object str = "Inar Academy";


        list.add(loan);
        list.add(date);
        list.add(str);
        list.add(circle);

        for (Object a : list) {
            System.out.println(a.toString());
            System.out.println("....................................");
        }

    }
}
