package week_11.Q_1.Q_2;

public class Student extends Person {
     int classStatus;


    Student() {
this.classStatus =-1;

    }

    Student(String name, String address, String phoneNumber, String email, int classStatus) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.classStatus = classStatus;
    }

    public String toString() {
        return "     _Student_" +
                "\nName : " + name +
                "\nAdress : " + address +
                "\nPhone number : " + phoneNumber +
                "\nE-mail : " + email +
                "\nClass status : " + classStatus;


    }

}
