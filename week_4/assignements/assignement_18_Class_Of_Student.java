package week_4.assignements;

import java.util.*;

//(Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The �rst
//character indicates the major and the second is number character 1, 2, 3, 4, which
//indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
//the following chracters are used to denote the majors:
//M: Mathematics
//C: Computer Science
//I: Information Technology
public class assignement_18_Class_Of_Student {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        int majorDegreeOfStudent = 0;
        int statusOfStudent = 0;
        String majorOfstudent = null;
        String[] namesOfMajors = new String[]{"Mathematics", " Computer Science ", " Information Technology"};
        String[] degreeOfStudents = new String[]{"Freshman", " Sophomore ", " Junior ", "Senior"};


        do {
            System.out.println("Enter major of student M - MATHEMATİC C- COMPUTER SCIENCE I - INFORMATİON TECHNOLOGY  ");
            majorOfstudent = bilal.next();

            if (majorOfstudent.equalsIgnoreCase("M")) {
                majorDegreeOfStudent = 0;
            } else if (majorOfstudent.equals("C")) {
                majorDegreeOfStudent = 1;
            } else if (majorOfstudent.equals("I")) {
                majorDegreeOfStudent = 2;
            } else {
                System.out.println("Invalid value ");
                System.out.println("Enter major of student ");
                majorOfstudent = bilal.next();
            }
        } while (!(majorOfstudent.equalsIgnoreCase("M") || majorOfstudent.equalsIgnoreCase("C") || majorOfstudent.equalsIgnoreCase("I")));

        do {
            System.out.println("Enter status of student 1-Freshman 2- Sophomore 3-Junior 4-Senior");
            statusOfStudent = bilal.nextInt();
          statusOfStudent--;
            if (!(statusOfStudent >= 0 && statusOfStudent <= 3)) {
                System.out.println("Invalid value");
                System.out.println("Enter status of student");
                statusOfStudent = bilal.nextInt();
            }
        } while (!(statusOfStudent >= 0 && statusOfStudent <= 4));


        System.out.println("This student is "+ namesOfMajors[majorDegreeOfStudent]+" "+ degreeOfStudents[statusOfStudent]);
    }
}
