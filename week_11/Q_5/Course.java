package week_11.Q_1.Q_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Course {
    private String courseName;
    ArrayList<String> students = new ArrayList<>();


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);

    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}

