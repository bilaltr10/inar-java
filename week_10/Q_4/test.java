package week_10.Q_4;



public class test {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 30.5);
        System.out.println(myPoint.distance(myPoint1));
        System.out.println(myPoint1.distance(5,7));
        System.out.println(myPoint1.distance(6,11));

    }
}
