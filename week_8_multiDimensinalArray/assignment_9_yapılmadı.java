package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_9_yapılmadı {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] list = makeTheArray();
        showTheList(list);
        boolean isWin = false;
        int count = 0;
        // 0- draw 1-X wins 2-O wins 3-continue;
        while (!isWin) {

            putTheX(list);
            showTheList(list);
            count++;
            if ((checkTheRow(list) || checkTheColumn(list) || checktheLeftDiagonal(list) || checkTheRightDiagonal(list))) {
                isWin = true;
                break;
            }
            putTheO(list);
            showTheList(list);
           count++;
            if ((checkTheRow(list) || checkTheColumn(list) || checktheLeftDiagonal(list) || checkTheRightDiagonal(list))) {
                isWin = true;
                break;
            }

        }
if(count%2==0) System.out.println("X side wins");
else System.out.println("O side wins");

    }


    public static String[][] makeTheArray() {
        String[][] list = new String[3][3];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = " ";
            }
        }

        return list;
    }

    public static void showTheList(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print("|" + list[i][j]);
                if (j == list[0].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();

        }
    }

    public static String[][] putTheX(String[][] list) {
        boolean isBlank;
        do {
            isBlank = false;
            System.out.print("Choose a row for X ");
            int rowOfX = input.nextInt();
            System.out.print("Choose a column for X");
            int columnOfX = input.nextInt();
            if (list[rowOfX][columnOfX].equals(" ")) {
                isBlank = true;
                list[rowOfX][columnOfX] = "X";
            } else {
                System.out.printf("%nThis place is already marked.");
            }
        } while (!isBlank);

        return list;
    }

    public static String[][] putTheO(String[][] list) {
        boolean isBlank;
        do {
            isBlank = false;
            System.out.print("Choose a row for O");
            int rowOfO = input.nextInt();
            System.out.println("Choose a column for O");
            int columnOfO = input.nextInt();
            if (list[rowOfO][columnOfO].equals(" ")) {
                isBlank = true;
                list[rowOfO][columnOfO] = "O";
            } else {
                System.out.print("This place is already marked.");
            }
        } while (!isBlank);

        return list;
    }

    public static boolean checkTheRow(String[][] list) {
        int countX = 1;
        int countO = 1;
        for (int i = 0; i < list.length; i++) {
            countX = 1;
            countO = 1;
            for (int j = 0; j < list[0].length - 1; j++) {
                if (list[i][j].equals("X")) {
                    countX++;
                } else if (list[i][j].equals("O")) {
                    countO++;
                }
            }
        }
        if (countX == 3 || countO == 3) return true;
        else return false;


    }
    public static boolean checkTheColumn(String[][] list) {
        int countX = 1;
        int countO = 1;
        for (int i = 0; i < list[0].length; i++) {
            countX = 1;
            countO = 1;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j][i].equals("X")) {
                    countX++;
                } else if (list[j][i].equals("O")) {
                    countO++;
                }
            }
        }
        if (countX == 3 || countO == 3) return true;
        else return false;

    }

    public static boolean checktheLeftDiagonal(String [][]list){
        int countX = 1;
        int countO = 1;
        for (int i = 0; i < list.length; i++) {
            if(list[i][i].equals("X")) countX++;
            else if (list[i][i].equals("O")) countO++; {

            }
        }
        if (countX == 3 || countO == 3) return true;
        else return false;



    }
    public static boolean checkTheRightDiagonal(String [][] list){

        if(list[0][2].equals("X") && list[1][1].equals("X")&&list[2][0].equals("X")) return true;
        else if (list[0][2].equals("O") && list[1][1].equals("O")&&list[2][0].equals("O")) return true;
        else return false;


    }











    }