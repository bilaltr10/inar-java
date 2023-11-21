package week_10.Q_9;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course course = new Course("Math");

        course.addStudent("bilal");
        course.addStudent("ali");
        course.addStudent("mehmet");
        course.addStudent("fevzi");

        String[] list = course.getStudents();


     // course.dropStudent("mehmet");
        course.removeStudent("ali");
        course.removeStudent("fevzi");
        course.removeStudent("bilal");

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(list[i]);
        }
    }
}
