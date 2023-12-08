package Week_13.Q_15;

import Week_13.Q_14.Rational;
import week_12.Q_15.InputAndOutputExample;

import java.math.BigInteger;

/*(Use BigInteger for the Rational class) Redesign and implement the Rational class above
using BigInteger for the numerator and denominator*/
    public class RationalClassWithBigInteger extends Number implements Comparable {
        BigInteger numerator ;
        BigInteger denominator;


        public RationalClassWithBigInteger() {
            this(new BigInteger("0"), new BigInteger("1"));
        }

        public RationalClassWithBigInteger(BigInteger numerator, BigInteger denominator) {
            BigInteger gcd = gcd(numerator, denominator);
            this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE :
                    new BigInteger("-1")).multiply(denominator.divide(gcd));
            this.denominator = denominator.divide(gcd);
        }


        /**
         * Find GCD of two numbers
         */
        private static BigInteger gcd(BigInteger n , BigInteger d) {
            BigInteger n1 = n;
            BigInteger n2 = d;
            BigInteger gcd = BigInteger.ONE;

            for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
                if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                    gcd = k;
                }
            }
            return gcd;
        }


        /**
         * Add a rational number to this rational
         */
        public BigInteger getNumerator() {
            return this.numerator;
        }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public RationalClassWithBigInteger add(RationalClassWithBigInteger secondRational) {
        BigInteger n = (this.numerator.multiply(secondRational.getDenominator())).add(
                this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalClassWithBigInteger(n, d);
    }

    public RationalClassWithBigInteger subtract(RationalClassWithBigInteger secondRational) {
        BigInteger n = (this.numerator.multiply(secondRational.getDenominator())).subtract(
                this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalClassWithBigInteger(n, d);
    }


    public RationalClassWithBigInteger multiply(RationalClassWithBigInteger secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getNumerator());
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalClassWithBigInteger(n, d);
    }


    public RationalClassWithBigInteger divide(RationalClassWithBigInteger secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator());
        BigInteger d = this.denominator.multiply(secondRational.getNumerator());
        return new RationalClassWithBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (this.denominator.compareTo(BigInteger.ONE) == 0) {
            return this.numerator + "";
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (((this.subtract((RationalClassWithBigInteger) (other))).getNumerator()).compareTo(BigInteger.ZERO) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Object o) {
        BigInteger zero = BigInteger.ZERO;
        BigInteger n = this.subtract((RationalClassWithBigInteger) o).getNumerator();
        return Integer.compare(n.compareTo(zero), 0);
    }
}

