package exception;

public class check {
    public static void main(String[] args) {
        Shapes xx = new square();
        Shapes yy = new triangle();
        send(xx);
        send(yy);

        square zz = ((square) xx);
        send(zz);
//        Object o = new Circle();
//        Circle c = (Circle)o; // No new object is created
//        Now reference variables o and c point to the same object.

    }

    public static void send(Shapes xx) {
        if (xx instanceof square) {
            square mm = (square) xx;
            System.out.println("Square : " + mm.getArea());
            System.out.println("Square different casting  : " + ((square) xx).getArea());
        } else if (xx instanceof triangle) {
            System.out.println("Triangle : " + ((triangle) xx).getArea());
        }
    }

// we can call overridden methods without downcasting.
    // but if superclass method doesnt have the that method we must upcasting for using Shapes as super class and senf
    // to the method as variable.
}
