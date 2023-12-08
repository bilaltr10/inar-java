package week_12.Q_10;

public class OutOfMemoryError extends Throwable {


    public static void main(String[] args) {
        try {
          int [] list ;
          list = new int[55555*555555*4555*555555];
        } catch (java.lang.OutOfMemoryError ex) {
            System.out.println("Out of memory occurs !  : Java heap space");
        }
    }

}
