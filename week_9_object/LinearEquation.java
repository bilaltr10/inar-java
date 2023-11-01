package week_9_object;

public class LinearEquation {
    private double a;
    private double b;

    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double NewA,double NewB,double NewC,double NewD,double NewE,double NewF){
        a = NewA;
        b= NewB;
        c= NewC;
        d=NewD;
        e = NewE;
        f= NewF;
    }
    double getA() {
        return a;
    }
    double getB() {
        return b;
    }  double getC() {
        return c;
    }  double getD() {
        return d;
    }  double getE() {
        return e;
    }  double getF() {
        return f;
    }
boolean isSolvable(){
        return a*d-b-c !=0;
}
double getX(){
        return (e*d -b*f)/(a*d-b*c);
}
double getY(){
        return (a*f-e*c)/(a*d-b*c);
}

}
