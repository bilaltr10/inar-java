package week_2.assıgnements;
import java.util.*;
public class assignement_4 {
    public static void main (String [ ] args ){
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the value in form of pound to see its in kg form");
        double pound = bilal.nextDouble();
        System.out.println(pound +"pound = "+(pound*0.454) + "kg");
    }
}
