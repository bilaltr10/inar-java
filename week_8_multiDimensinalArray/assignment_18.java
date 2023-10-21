package week_8_multiDimensinalArray;

public class assignment_18 {
    public static void main(String[] args) {
        int[][] list = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(list);
        assignment_16.showTheArray(list);
    }

    public static int[][] shuffle(int[][] list) {
        int[][] temp = new int[1][2];
        for (int i = 0; i < list.length; i++) {
            int m = (int) (Math.random() * list.length);
            for (int j = 0; j <list[0].length; j++) {
                temp[0][j] = list[m][j];
                list[m][j] = list[i][j];
                list[i][j] = temp[0][j];
            }
        }

        return list;
    }
}
