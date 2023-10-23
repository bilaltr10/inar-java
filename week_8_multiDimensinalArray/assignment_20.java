package week_8_multiDimensinalArray;
import java.util.Scanner;
public class assignment_20 {
    static Scanner input = new Scanner(System.in);
       public static void main(String[] args) {
        String[][] list = makeTheList();
        showTheTable(list);
        putTheGameInLoop(list);
    }
    public static void putTheGameInLoop(String[][] list) {
        boolean laFin ;
        int i =0;
        while (i<list.length*list[0].length) {

            dropTheRed(list);i++;
            laFin = checkTheGame(list);
            if (laFin) {
                System.out.println("The RED player won");
                break;
            }
            dropTheYellow(list);i++;
            laFin = checkTheGame(list);
            if (laFin) {
                System.out.println("The YELLOW player won");
                break;
            }}
        System.out.println("It is draw.");}


    public static String[][] makeTheList() {

        String[][] list = new String[6][7];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = " ";
            }}
        return list;
    }

    public static void showTheTable(String[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print("|" + list[i][j]);
                if (j == list[0].length - 1) {
                    System.out.print("|");
                }}
            System.out.println();
     }}

    public static void dropTheRed(String[][] list) {

        System.out.print("Drop a red disc at column (0-6) : ");
        int columnOfRedThrown = input.nextInt();
        int color = 0;
        checkThePlace(list, columnOfRedThrown, color);
    }

    public static void checkThePlace(String[][] list, int columnChosen, int color) {
        int row = list.length - 1;

        boolean isEmpty = false;
        while (!isEmpty) {
            isEmpty = true;
            if (list[row][columnChosen].equals(" ") && color == 0) {
                list[row][columnChosen] = "R";
            } else if (list[row][columnChosen].equals(" ") && color == 1) {
                list[row][columnChosen] = "Y";
            } else if (!list[row][columnChosen].equals(" ")) {
                row--;
                isEmpty = false;
            }}
        showTheTable(list);

    }

    public static void dropTheYellow(String[][] list) {

        System.out.print("Drop a yellow disc at column (0-6) : ");
        int columnOfRedThrown = input.nextInt();
        int color = 1;
        checkThePlace(list, columnOfRedThrown, color);
    }

    public static boolean checkTheGame(String[][] list) {
        return (checkTheRow(list) || checkTheColumn(list) || checkTheDiagonal(list));
    }

    public static boolean checkTheRow(String[][] list) {
        int count;
        for (int i = list.length - 1; i > 0; i--) {
            count = 1;
            for (int j = 0; j < list[0].length - 1; j++) {
                if (list[i][j].equals("R") || list[i][j].equals("Y")) {
                    if (list[i][j].equals(list[i][j + 1])) {
                        count++;
                    } else {
                        count = 1;
                    }}
                if (count == 4) {
                    return true;
                }}}
               return false;
    }

    public static boolean checkTheColumn(String[][] list) {
        int count;
        for (int i = 0; i < list[0].length; i++) {
            count = 1;
            for (int j = list.length - 2; j > 0; j--) {
                if (list[j][i].equals("R") || list[j][i].equals("Y")) {
                    if (list[j][i].equals(list[j + 1][i])) {
                        count++;
                    } else {
                        count = 1;
                    }}
                if (count == 4) {
                    return true;
                }}}
        return false;
    }

    public static boolean checkTheDiagonal(String[][] list) {

        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < list[0].length; j++) {
                if (checkTheDiagonalLeftToRight(list, i, j) || checkTheDiagonalRightToLeft(list, i, j)) {
                    return true;
                }}}
        return false;
    }
    public static boolean checkTheDiagonalRightToLeft(String[][] list, int row, int column) {
        if (column < 3) {
            return false;
        }
        if (row < 3) {
            return false;
        }
        String x = list[row][column];
        int count = 0;
        if (!x.equals(" ")) {
            for (int i = 0; i < 4; i++) {
                if (x.equals(list[row - i][column - i])) {
                    count++;
                }}}
        return count == 4;
    }
    public static boolean checkTheDiagonalLeftToRight(String[][] list, int row, int column) {
        if (column > list[0].length - 4) {
            return false;
        }
        if (row < list.length - 4) {
            return false;
        }
        String x = list[row][column];
        int count = 0;

        if (!x.equals(" ")) {

            for (int i = 0; i < 4; i++) {
                if (x.equals(list[row - i][column + i])) {
                    count++;
                }}}
        return count == 4;
    }}



