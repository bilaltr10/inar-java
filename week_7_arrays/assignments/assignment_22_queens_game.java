package week_7_arrays.assignments;

public class assignment_22_queens_game {
    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            makeTheTablau();
            System.out.println();
            System.out.println();
            System.out.println();

        }
    }
    public static void makeTheTablau() {
        char[] list1 = new char[17];
        int[] list = new int[8];
        int[] placesCanBeAvaibleForQueen = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        for (int w = 0; w < 8; w++) {
          int m = 0;
            for (int i = 0; i < list1.length; i++) {
                if (i % 2 == 0) {
                    list1[i] = '|';
                    System.out.print(list1[i]);
                } else {

                    if (i == m) {
                        list1[i] = 'Q';
                        System.out.print(list1[i]);
                    } else {
                        list1[i] = ' ';
                        System.out.print(list1[i]);
                    }}}
            System.out.println();
        }
    }






        }






















