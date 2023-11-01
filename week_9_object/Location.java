package week_9_object;

public class Location {
    public static int row;
    public static int column;
    public static double maxValue = 0;

    public static void locateLargest(double[][] a) {
       Location maxLocation = new Location();
       maxLocation.maxValue= a[row][column];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    Location.row = i;
                    Location.column = j;
                }

            }
        }


    }
}
