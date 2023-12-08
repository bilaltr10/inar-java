package Week_13.Q_21;

import Week_13.Q_16.Rational;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class VertexFormEquations extends Rational {
    double a;
    double b;
    double c;

    VertexFormEquations(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
// line 23 and 33 Math.abs()  added and looked in lines 25 and 35 whether number is  positive or negative
    public String findTheH() {
        String s = "" + b / (-2 * a);
        String[] list = s.split("\\.");
        Rational rational1 = new Rational(Math.abs(Long.parseLong(list[0])), 1);
        Rational rational2 = convertTheNumber((long) Double.parseDouble(list[1]), list[1].length());
       return  "h is --> "+(s.charAt(0) == '-' ? "-" : "") + rational1.add(rational2);


    }

    public String findTheK() {
        String s= "" + (c - a * Math.pow(h(), 2));
        String[] list = s.split("\\.");
        Rational rational1 = new Rational(Math.abs(Long.parseLong(list[0])), 1);
        Rational rational2 = convertTheNumber((long) Double.parseDouble(list[1]), list[1].length());
             return "k is --> " +(s.charAt(0) == '-' ? "-" : "")+  rational1.add(rational2);
    }



    public Rational convertTheNumber(long x, int y) {
        return new Rational(x, (long) Math.pow(10, y));
    }

    public double k(){
       return  (c - a * Math.pow(h(), 2));
    }

    public double h(){
        return  b / (-2 * a);
    }
}
