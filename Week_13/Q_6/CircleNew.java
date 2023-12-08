package Week_13.Q_6;



public class CircleNew  {
    public static void main(String[] args) {
        ComparableCircle comparableCircle = new ComparableCircle("red",true,5);
        ComparableCircle comparableCircle1 = new ComparableCircle("green",false,2);
        System.out.println("comparableCircle");
        System.out.println(comparableCircle);
        System.out.println("\ncomparableCircle1");
        System.out.println(comparableCircle1);

        System.out.println();
        System.out.println((comparableCircle.compareTo(comparableCircle1)>0 ? "comparableCircle ":"comparableCircle1 ")+" is the larger of two Circles");

    }

    }


