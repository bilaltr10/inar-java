package Week_13.Q_5;

public class testOfGeometricClasses {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(15);
        GeometricObject circle = new Circle(10);

        System.out.println(GeometricObject.max(circle1, circle));


        Rectangle rectangle = new Rectangle(40, 40);
        Rectangle rectangle1 = new Rectangle(10, 5);
        System.out.println(GeometricObject.max(rectangle1, rectangle));
    }
}
