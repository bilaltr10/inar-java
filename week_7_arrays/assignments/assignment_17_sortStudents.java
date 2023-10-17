package week_7_arrays.assignments;
import java.util.Scanner;
public class assignment_17_sortStudents {
    static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
        int i = 0;
        topOfCode();
        System.out.println("Enter the number of students : ");
        String[] sortedList = enterNamesAndScore();
        System.out.println("Names sorted way : ");
        for (String a : sortedList) {
            System.out.println((i + 1) + " . student :  " + a);
            i++;
        }
    }
    public static String[] sortTheStudents(String[] students, int[] notes) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (notes[j] < notes[j + 1]) {
                    int temp = notes[j];
                    notes[j] = notes[j + 1];
                    notes[j + 1] = temp;
                    String tempName = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempName;
                }}}
        return students;
    }
    public static void topOfCode() {
        System.out.printf("%60s %n", "Sorting the names of students with their scores ");
        System.out.println("-------------------------------------------------------------------");
    }
    public static String[] enterNamesAndScore() {
        String[] names = new String[input.nextInt()];
        int[] scores = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + (i + 1) + " : ");
            names[i] = input.next();
            System.out.print("Score : ");
            scores[i] = input.nextInt();
        }
        return sortTheStudents(names, scores);
    }

}

