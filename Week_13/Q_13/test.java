package Week_13.Q_13;

import java.util.Arrays;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coursee course = new Coursee("Java");

        course.addStudent("bilal");
        course.addStudent("ali");
        course.addStudent("eşref");
        course.addStudent("fikret");
        Coursee course2 =   course.clone();
        course2.addStudent("Jemmy");
        course2.addStudent("Fredy");
        System.out.println("Number of students in course Java-1 :"+course.getNumberOfStudents());
        System.out.println(course.writeNames());
        System.out.println("Names of students in the course Java-2 :"+ course2.getNumberOfStudents());
        System.out.println(course2.writeNames());
    }

}
