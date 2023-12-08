package exception;

public class equalsMethod {
    public static void main(String[] args) {
        String xx = "   Bil al   ";
        String yy = "Bilal";
        String zz = "Hilal";

        Object mm = new String("ailal"); //downcasting implicit şekilde olur
        yy = (String) mm; // upcasting

        System.out.println(xx.trim());

    }
}
