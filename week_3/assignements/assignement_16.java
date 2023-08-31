package week_3.assignements;
import java.util.*;
//) Write a program that displays a random coordinate in a rectangle.
//The rectangle is centered at (0, 0) with width 100 and height 200

public class assignement_16 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner ( System.in);
        int width=0;
        System.out.println("Random coordinate in rectangle centered (0,0) \nwith width 100 and height 200 : ");

           width = (int) (Math.random() * 100 - 52);
          int height = (int) (Math.random() * 200 - 100);
          System.out.print(" ("+width + " ," + height+ ")");
    }
}
