package week_8_multiDimensinalArray;

import java.util.Arrays;

public class assignment_3 {

    public static void main(String[] args) {

        int[][] list = checkTheAnswers(makeTheList());
          writeTheNamesAndScores(list);
    }


    public static char[][] makeTheList() {
        char[][] list = new char[8][10];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                int randomNumber = (int) (Math.random() * 5);
                list[i][j] = (char) (randomNumber + 'A');
                System.out.print(list[i][j] + " ");
            }
            System.out.println();

        }
        return list;
    }

    public static int[][] checkTheAnswers(char[][] list) {
        char[] answers = new char[]{'D', 'C', 'A', 'B', 'D', 'E', 'A', 'B', 'D', 'E'};
        int count;
        int[] namesOfStudentAndNumberOfTrueAnswers = new int[8];
        int[][] nameAndScore = new int[8][2];

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j] == answers[j]) {
                    count++;
                }

            }
            System.out.println(count);
            nameAndScore[i][0] = i;
            nameAndScore[i][1] = count;
        }
        return nameAndScore;

    }

    public static void writeTheNamesAndScores(int[][] list) {

        for (int i = 0; i <list.length-1 ; i++) {
            for (int j = i+1; j < list.length; j++) {
                int noteOne=list[i][1];
                int noteTwo = list[j][1];
                if(noteOne>noteTwo){
                    int[] temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

            }

        }
        for(int [] a :list){
            System.out.println("Student "+a[0] + ": " + a[1] + " correct answers");

        }

}






    }






