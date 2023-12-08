package Week_13.Q_13;

import Week_13.Q_7.Colorable;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Coursee implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Coursee(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        LinkedList<String> list = new LinkedList<>(List.of(students));
        list.remove(student);
        students = list.toArray(new String[0]);

    }


    public StringBuilder writeNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < getNumberOfStudents(); i++) {
            stringBuilder.append(students[i]).append(" ");
        }
        return stringBuilder;
    }

    @Override
    public Coursee clone() throws CloneNotSupportedException {
        Coursee courseClone = (Coursee) super.clone();
        //deep copy
        courseClone.students=(String[])students.clone();
        return courseClone;
    }
}
