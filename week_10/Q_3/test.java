package week_10.Q_3;

public class test {
    public static void main(String[] args) {
        char[] ch = new char[]{1, 2, 3, 4, 5, 6, 7};
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(myInteger.isEquals(10));
        System.out.println(myInteger.isEquals(new MyInteger(41614161)));
        System.out.println(MyInteger.isEven(41614161));
        System.out.println(MyInteger.isOdd(41614161));
        System.out.println(MyInteger.isPrime(41614161));
        System.out.println(MyInteger.parseInt(ch));
        System.out.println(MyInteger.parseInt("123"));
    }


}
