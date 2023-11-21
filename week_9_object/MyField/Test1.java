package week_9_object.MyField;

public class Test1 {
    String name;
    String surname;
    int grade;
    char nameOfClass;
    int numberOfStudent;
    double exam1;
    double exam2;
    double exam3;

    // bu üç değeri buraya yazma çünkü bunları diğer değişkenlerle buluruz
//    String pointInLetter;
//    double averageOfStudent;
//
//    boolean isSuccessful;

    Test1(String name, String surname, int grade, char nameOfClass, int numberOfStudent, double exam1, double exam2, double exam3) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.nameOfClass = nameOfClass;
        this.numberOfStudent = numberOfStudent;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;

    }

    double averageOfStudent() {
        return (exam1 + exam2 + exam3) / 3;

    }

    String findThePointInLetter() {
        double averageOfStudent = (exam1+exam2+exam3)/3;

        if (averageOfStudent > 90) {
            return "A";

        } else if (averageOfStudent > 80) {
            return "B";

        } else if (averageOfStudent > 70) {
            return "C";


        } else if (averageOfStudent > 60) {
            return "C";


        } else if (averageOfStudent > 50) {
            return "D";

        } else if (averageOfStudent < 50) {
            return "F";

        }

        return "cccc";
    }


    boolean isSuccesful() {
        return findThePointInLetter().equals("F");
    }

    void write() {
        System.out.println("Name :" + name + " Surname : " + surname + " Grade : " + grade + " Number :" + numberOfStudent);
        System.out.println("Average of 3 exam : " + averageOfStudent());
        System.out.println("The grade : " + findThePointInLetter());
        System.out.println("Result : " + (isSuccesful() ? "Not Pass" : "Pass"));
    }
}