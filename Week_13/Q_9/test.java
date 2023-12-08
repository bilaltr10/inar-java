package Week_13.Q_9;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10);

        System.out.println("Circle radius: "+ circle.getRadius());
        System.out.println("Circle2 radius: "+ circle2.getRadius());
        System.out.println("Circle3 radius: "+ circle3.getRadius());

        System.out.println(("Circle is"+(circle.Equals(circle2) ? " " : " not ")+"equals to Circle2"));
        System.out.println(("Circle is"+(circle.Equals(circle3) ? " " : " not ")+"equals to Circle3"));

    }
}
