package week_2.assıgnements;
import java.util.*;
public class assignement_1 {
    public static void main (String [] args ){
        Scanner bilal = new Scanner(System.in);
        System.out.println("please enter the degree of heat in form of celsius");
        double degree = bilal.nextDouble();
        double fahrenheit = (9.0/5)*degree + 32;
        System.out.println(degree +" of celsius is   =  "+fahrenheit+ "  fahreneit degree" );




    }
}
