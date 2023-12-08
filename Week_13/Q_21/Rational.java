package Week_13.Q_21;

import week_12.Q_4.Loan;

public class Rational extends  Number {
    private long x;
    private long y;


    /**
     * Construct a rational with speci�ed numerator and denominator
     */
    public Rational(long x, long y) {
        this.x = x;
        this.y = y;
    }



    /**
     * Find GCD of two numbers
     */
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public long getNumerator() {
        return x;
    }

    /**
     * Return denominator
     */
    public long getDenominator() {
        return y;
    }

    /**
     * Add a rational number to this rational
     */
    public Rational add(Rational secondRational) {
        long n = x * secondRational.getDenominator() +
                y * secondRational.getNumerator();
        long d = x * secondRational.getDenominator();

        return new Rational(n, d);
    }


    public Rational subtract(Rational secondRational) {
        long n = x * secondRational.getDenominator()
                - y * secondRational.getNumerator();
        long d = y * secondRational.getDenominator();
        return new Rational(n, d);
    }


    public Rational multiply(Rational secondRational) {
        long n = x * secondRational.getNumerator();
        long d = y* secondRational.getDenominator();
        return new Rational(n, d);

    }


    public Rational divide(Rational secondRational) {
        long n = x * secondRational.getDenominator();
        long d = y * secondRational.x;
        return new Rational(n, d);

    }


    @Override

    public String toString() {
        if (y == 1)
            return x+ "";
        else
            return x+ "/" + y;

    }

    @Override // Override the equals method in the Object class


    public boolean equals(Object other) {
        return (this.subtract((Rational) (other))).getNumerator() == 0;
    }


    @Override // Implement the abstract intValue method in Number
   public int intValue() {
        return (int) doubleValue();

    }

    @Override // Implement the abstract �oatValue method in Number
    public float floatValue() {

        return (float) doubleValue();

    }


    @Override // Implement the doubleValue method in Number


    public double doubleValue() {
        return x * 1.0 / y;

    }


    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();

    }


}





