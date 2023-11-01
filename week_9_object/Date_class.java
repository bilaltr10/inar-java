
package week_9_object;

import java.util.Date;

public class Date_class {

    public static void main(String[] args) {

        for (long i = 10000; i <10000000000000L ; i*= 10) {
            Date date = new Date(i);
            System.out.println("For elapsed "+i+" time is "+date.toString());

        }
    }
}
