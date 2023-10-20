package week_8_multiDimensinalArray;

public class assignment_10 {

    public static void main(String[] args) {


        int[][] list = fillTheArray(makeTheArray());
        showTheList(list);
        int maxRow = findTheLargestRow(list);
        int maxColumn = findTheLargestColumn(list);
        writeTheLargestRowAndColumn(maxRow, maxColumn);

    }

    public static int[][] makeTheArray() {

        int[][] list = new int[4][4];
        return list;
    }

    public static int[][] fillTheArray(int[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (int) (Math.random() * 2);
            }
        }
        return list;
    }

    public static int findTheLargestRow(int[][] list) {
        int max = Integer.MIN_VALUE;
        int maxRow = -1;
        for (int i = 0; i < list.length; i++) {
            int total = 0;
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j] == 1) {
                    total++;
                }
            }
            if (total > max) {
                max = total;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static int findTheLargestColumn(int[][] list){
        int max = Integer.MIN_VALUE;
        int maxColumn= -1;
        for (int i = 0; i < list[0].length; i++) {
            int total = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j][i] == 1) {
                    total++;
                }
            }
            if (total > max) {
                max = total;
                maxColumn = i;
            }
        }
        return maxColumn;
    }

public static void writeTheLargestRowAndColumn(int maxRow, int maxColumn){
    System.out.println("The largest row is : " + maxRow);
    System.out.println("The largest column is : "+ maxColumn);

}

public static void showTheList(int[][] list) {
    for (int i = 0; i < list.length; i++) {
        for (int j = 0; j < list[0].length; j++) {
            System.out.print(list[i][j] + " ");
        }
        System.out.println();
    }
}


}


