package week_11.Q_5;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        week_11.Q_1.Q_5.Course course = new week_11.Q_1.Q_5.Course("Math");

        // add the names
        course.addStudent("bilal");
        course.addStudent("ali");
        course.addStudent("ahmet");


        ArrayList<String> list = course.getStudents();

        System.out.println("After adding students to the course ...");
        System.out.println("Course name : " + course.getCourseName());
        for (String a : list) {
            System.out.println(a);
        }
        System.out.println("Number of students : " + course.getNumberOfStudents());

        course.dropStudent("bilal"); // drop the student...

        System.out.println("After dropping student from the course ...");
        System.out.println("Course name : " + course.getCourseName());
        for (String a : list) {
            System.out.println(a);
        }
        System.out.println("Number of students : " + course.getNumberOfStudents());
    }
}
