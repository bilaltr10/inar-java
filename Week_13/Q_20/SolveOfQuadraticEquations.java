package Week_13.Q_20;

import Week_13.Q_17.Complex;



public class SolveOfQuadraticEquations extends Complex {


    double a;
    double b;
    double c;

    public SolveOfQuadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {

        return Math.pow(b, 2) - 4 * a * c;
    }

    public String findTheRoots() {
        if (getDiscriminant() > 0) return "The roots are " + işlem1() + " and " + işlem2();
        else if (getDiscriminant() == 0) return "The root is  " + işlem1();
        else return findRationalRoots();
    }


    public double işlem1() {
        double r1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
        return (r1);
    }

    public double işlem2() {
        double r2 = (-b - Math.pow(((b * b) - 4 * a * c), 0.5)) / 2 * a;
        return r2;
    }

    public String findRationalRoots() {
        return "The roots are " + firstRationalRoot() + " and " + secondRationalRoot();
    }

    public String firstRationalRoot() {
        setReal(-b / (2 * a));
        setImaginary(Math.sqrt(Math.abs(getDiscriminant())) / (2 * a));
      return  toString(getReal(), getImaginary());
    }

    public String secondRationalRoot(){
        setReal(-b / ((-2) * a));
        setImaginary(Math.sqrt(Math.abs(getDiscriminant())) / (2 * a));
        return  toString(getReal(), getImaginary());
    }
}



