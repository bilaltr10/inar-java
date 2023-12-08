package week_11.Q_1.Q_2;

public class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    Person() {
        this("null", "null", "null", "null");
    }

    Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "_Person_" +
                "\nName : " + name +
                "\nAdress : " + address +
                "\nPhone number : " + phoneNumber +
                "\nE-mail : " + email;
    }
}
