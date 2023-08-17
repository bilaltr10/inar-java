package week_2.assıgnements;
import java.util.*;
public class assignement_9 {
    public static void main (String [ ] args ){
        Scanner bilal = new Scanner(System.in );
        System.out.println("this program will show you average acceleration");
        double v1  , v2 , t , a;
        System.out.println("enter v1 and then v2");
        v1 = bilal.nextDouble();
        v2 =bilal.nextDouble();
        System.out.println("enter the t ");
        t = bilal.nextDouble();
        System.out.println("acceleration is "+(int) ((v2-v1)/t*1000)/1000.0);


    }
}
