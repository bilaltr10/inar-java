package Week_13.Q_19;

import Week_13.Q_15.RationalClassWithBigInteger;
import Week_13.Q_16.Rational;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class ConvertDecimalsToFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        String str = scanner.next();
        String[] list = str.split("\\.");

        Rational rational1 = new Rational(Long.parseLong(list[0]), 1);
        Rational rational2 = convertTheNumber((long) Double.parseDouble(list[1]), list[1].length());
        System.out.println("The fraction number is  :" + (str.charAt(0) == '-' ? "-" : "") + rational1.add(rational2));
    }

    public static Rational convertTheNumber(long x, int y) {
        return new Rational(x, (long) Math.pow(10, y));
    }
}
