package week_11.Q_1.Q_15;

import java.util.ArrayList;
import java.util.Scanner;

public class areaOfConvex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       AreaOFFConvex test =new AreaOFFConvex();
        System.out.println("Enter the number of sides : ");
        int numberOfSides = input.nextInt();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();


        for (int i = 0; i < numberOfSides; i++) {
            list1.add(input.nextDouble());
            list2.add(input.nextDouble());

        }
        AreaOFFConvex.printClockwise(list1,list2);
        System.out.println("Area of convex : "+test.AreaOfConvex(list1, list2));

    }
}
