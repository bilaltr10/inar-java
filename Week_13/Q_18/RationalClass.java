package Week_13.Q_18;

import Week_13.Q_14.Rational;
import Week_13.Q_15.RationalClassWithBigInteger;

import java.math.BigInteger;

public class RationalClass {
    public static void main(String[] args) {
int score =0;

        for (int i = 1; i <100 ; i++) {
            RationalClassWithBigInteger rational = new RationalClassWithBigInteger(BigInteger.valueOf(i),BigInteger.valueOf(i+1));
           if(i !=99)
            System.out.print(rational+" + ");
           else System.out.println(rational);
           score += (int)(rational.doubleValue());
        }
        System.out.println("\nscore : " + score);
    }
}
