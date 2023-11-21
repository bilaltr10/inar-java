package week_10.Q_3;

public class MyInteger {
/*(The MyInteger class) Design a class named MyInteger. The class contains:
■ An int data �eld named value that stores the int value represented by this
object.
■ A constructor that creates a MyInteger object for the speci�ed int value.
■ A getter method that returns the int value.
■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the speci�ed value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the speci�ed value is even, odd,
or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the speci�ed value.
■ A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
■ A static method parseInt(String) that converts a string into an int
value*/

    int value;

    MyInteger(int value) {
        this.value = value;
    }

    MyInteger(MyInteger myInteger) {
        value = myInteger.getValue();
    }

    public int getValue() {
        return value;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isPrime() {
        for (int i = 2; i < Math.sqrt(value) + 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int value) {
        return value % 2 == 0;
    }

    static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    static boolean isPrime(int value) {
        for (int i = 2; i < Math.sqrt(value) + 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    boolean isEquals(int value) {
        return this.value == value;
    }

    boolean isEquals(MyInteger myInteger) {
        return value == myInteger.getValue();
    }

    static int parseInt(char[] number) {
        int m = 0;
        for (int i = 0; i < number.length; i++) {
            m += number[i] * (int) (Math.pow(10, number.length - i - 1));
        }
        return m;
    }

    static int parseInt(String str) {
        int m = 0;
        for (int i = 0; i < str.length(); i++) {
            m += (str.charAt(i) - '0') * (int) (Math.pow(10, str.length() - i - 1));
        }
        return m;
    }
}
