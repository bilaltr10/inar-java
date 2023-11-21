package week_10.Q_9;

public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        checkTheSize(numberOfStudents++);
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
        for (int i = 0; i < student.length(); i++) {
            if (student.equals(students[i])) {
                students[i] = "";
            }
        }
    }

    public void enlargeTheList() {
        String[] list = new String[students.length * 2];
        System.arraycopy(students, 0, list, 0, students.length);
        students = list;

    }

    public void remove() {
        students = new String[100];
    }

    public void checkTheSize(int number) {
        if (number == students.length - 1) {
            enlargeTheList();
        }
    }

    public void removeStudent(String student) {
        for (int i = 0; i < student.length(); i++) {
            if (student.equals(students[i])) {
                scrollTheList(i);
            }
        }
    }

    public void scrollTheList(int indis) {
        for (int i = indis; i < numberOfStudents; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }
}

