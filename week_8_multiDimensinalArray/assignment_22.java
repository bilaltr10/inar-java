package week_8_multiDimensinalArray;

public class assignment_22 {

    public static void main(String[] args) {
        int[][] list = {{1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 0, 1,},
                        {1, 1, 1, 0, 1, 0},
                        {0, 1, 0, 1, 1, 1},
                        {0, 1, 0, 1, 0, 1}};


        //fillTheArrayWithOnesAndZeros();

        assignment_16.showTheArray(list);
        System.out.println("Every row " + (!countTheRows(list) ? "does not " : " ") + "have an even number of 1s");
        System.out.println("Every column " + (!countTheColumns(list) ? "does not " : " ") + "have an even number of 1s");

    }

    public static int[][] fillTheArrayWithOnesAndZeros() {
        int[][] list = new int[6][6];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (int) (Math.random() * 2);
            }
        }

        return list;

    }

    public static boolean countTheRows(int[][] list) {
        int total;
        for (int i = 0; i < list.length; i++) {
            total = 0;
            for (int j = 0; j < list[0].length; j++) {
                total += list[i][j];

            }
            if (total % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean countTheColumns(int[][] list) {
        int total;
        for (int i = 0; i < list[0].length; i++) {
            total = 0;
            for (int j = 0; j < list.length; j++) {
                total += list[j][i];

            }
            if (total % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
