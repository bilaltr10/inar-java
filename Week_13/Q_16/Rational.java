package Week_13.Q_16;



import java.math.BigInteger;

    public class Rational extends Number implements Comparable<Week_13.Q_16.Rational> {
        private long[] r = new long[2];

        public long[] getR() {
            return r;
        }

        public void setR(long[] r) {
            this.r = r;
        }

        public Rational() {
            this(0, 1);
        }

        /**
         * Construct a rational with speci�ed numerator and denominator
         */
        public Rational(long numerator, long denominator) {
            long gcd = gcd(numerator, denominator);
            r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
            r[1] = Math.abs(denominator) / gcd;
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
            return r[0];
        }

        /**
         * Return denominator
         */
        public long getDenominator() {
            return r[1];
        }

        /**
         * Add a rational number to this rational
         */
        public Week_13.Q_16.Rational add(Week_13.Q_16.Rational secondRational) {
            long n = r[0] * secondRational.getDenominator() +
                    r[1] * secondRational.getNumerator();
            long d = r[1] * secondRational.getDenominator();

            return new Week_13.Q_16.Rational(n, d);
        }


        public Week_13.Q_16.Rational subtract(Week_13.Q_16.Rational secondRational) {
            long n = r[0] * secondRational.getDenominator()
                    - r[1] * secondRational.getNumerator();
            long d = r[1] * secondRational.getDenominator();
            return new Week_13.Q_16.Rational(n, d);
        }


        public Week_13.Q_16.Rational multiply(Week_13.Q_16.Rational secondRational) {
            long n = r[0] * secondRational.getNumerator();
            long d = r[1] * secondRational.getDenominator();
            return new Week_13.Q_16.Rational(n, d);

        }


        public Week_13.Q_16.Rational divide(Week_13.Q_16.Rational secondRational) {
            long n = r[0] * secondRational.getDenominator();
            long d = r[1] * secondRational.r[0];
            return new Week_13.Q_16.Rational(n, d);

        }


        @Override

        public String toString() {
            if (r[1] == 1)
                return r[0] + "";
            else
                return r[0] + "/" + r[1];

        }

        @Override // Override the equals method in the Object class


        public boolean equals(Object other) {
            return (this.subtract((Week_13.Q_16.Rational) (other))).getNumerator() == 0;
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
            return r[0] * 1.0 / r[1];

        }


        @Override // Implement the abstract longValue method in Number


        public long longValue() {
            return (long) doubleValue();

        }


        @Override // Implement the compareTo method in Comparable


        public int compareTo(Week_13.Q_16.Rational o) {
            if (this.subtract(o).getNumerator() > 0)
                return 1;
            else if (this.subtract(o).getNumerator() < 0)
                return -1;
            else return 0;

        }


    }




