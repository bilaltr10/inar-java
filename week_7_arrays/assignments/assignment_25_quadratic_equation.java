package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_25_quadratic_equation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a ,b ,c ");
        char[] letters = new char[]{'a', 'b', 'c'};
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            System.out.print(letters[i] + " : ");
            eqn[i] = input.nextDouble();
        }
        int numberOfRoots = solveQuadratic(eqn);
        if (numberOfRoots != 0) {
            System.out.print("The root" + (numberOfRoots > 1 ? "s" : "") + "of equation :");
            quadratic(eqn, numberOfRoots);
        } else {
            System.out.println("The equation has no real root");
        }
    }
    public static int solveQuadratic(double[] eqn) {
        double discriminant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        if (discriminant > 0) return 2;
        else if (discriminant == 0) return 1;
        else return 0;
  }
    public static void quadratic(double[] eqn, int numberOfRoots) {
        double resultOne;
        double resultTwo;
        if (numberOfRoots == 1) {
            resultOne = (-eqn[1])/2*eqn[0];
            System.out.println(resultOne);
        }
else{
    resultOne = (-eqn[1]+(Math.sqrt(Math.pow(eqn[1],2)-4*eqn[0]*eqn[2])))/2*eqn[0];
    resultTwo=(-eqn[1]-(Math.sqrt(Math.pow(eqn[1],2)-4*eqn[0]*eqn[2])))/2*eqn[0];
            System.out.print(resultOne +"  " +resultTwo);

        }

    }


}
