package Week_13.Q_15;

import Week_13.Q_14.Rational;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("5");
        BigInteger num2 = new BigInteger("6");

        RationalClassWithBigInteger class1 = new RationalClassWithBigInteger(num1,num2);

        System.out.println(class1.add(new RationalClassWithBigInteger(new BigInteger("1"), new BigInteger("4"))));


    }
}
