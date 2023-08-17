package week_2.assıgnements;
import java.util.*;
public class assıgnement_2 {
    public static void main (String [] args){
        Scanner bilal = new Scanner(System.in);
        System.out.println("In this program we will show you finding area and volume of a cylinder"+
        "please press enter if you want to carry on");
        String enter =bilal.nextLine();
        System.out.println("please enter radius of cylinder");
        double radius = bilal.nextDouble();
        System.out.println("please enter lenght of cylinder ");
        double lenght = bilal.nextDouble();
        System.out.print("To see the result you must type yes");
       String enter2 = bilal.next();
        if( enter2.equals("yes")) {
            double area = Math.pow(radius, 2.0) * Math.PI;
            double volume = area * lenght;
            System.out.println("The area of the cylinder with the values you entered is " + area);
            System.out.println("the volume of the cylinder with the values you entered is " + volume);

        }
    }
}
// yes yazımını yapamadım