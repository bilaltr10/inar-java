package week_10.Q_15;

import java.math.BigInteger;

public class Divisible {
    //(Divisible by 2 or 3) Find the �rst ten numbers with 50 decimal digits that are
    //divisible by 2 or 3


    void makeList() {
        String str = "1";
        for (int i = 0; i < 49; i++) {
            str = str.concat("0");
        }
        BigInteger numbers = new BigInteger(str);
        putTheNumbersToBigInteger(numbers);
    }


    void putTheNumbersToBigInteger(BigInteger bigInteger) {
        int i = 0;
        while (i < 10) {

            boolean isDivisibleBy2 = bigInteger.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);
            boolean isDivisibleBy3 = bigInteger.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO);
            if (isDivisibleBy2 || isDivisibleBy3) {
                System.out.println(bigInteger);
                bigInteger = bigInteger.add(BigInteger.ONE);
                i++;

            } else {
                bigInteger = bigInteger.add(BigInteger.ONE);
            }
        }

    }

}

