package week_10.Q_11;

public class test {
    public static void main(String[] args) {
        Circle2D circle2D = new Circle2D(2,2,5.5);

        System.out.println("Circle area : "+ circle2D.getArea());
        System.out.println("Circle perimeter :"+ circle2D.getPerimeter());
        System.out.println("Does circle contains point (3,3)? -->"+ circle2D.contains(3,3));
        System.out.println("Does circle contains circle centered (4,5) and radius 10.5? -->"+ circle2D.contains(new Circle2D(4,5,10.5)));
        System.out.println("Does circle overlaps circle centered (3,5) and radius 2.3? -->"+ circle2D.overlaps(new Circle2D(3,5,2.3)));
    }
}
