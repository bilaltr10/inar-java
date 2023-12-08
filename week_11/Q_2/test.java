package week_11.Q_1.Q_2;

import week_10.Q_14.MyDate;

public class test {
    public static void main(String[] args) {
        Person person = new Person("Bilal", "Bandırma", "+905416525584", "bilal@gmail.com");
        Student student = new Student("Bilal", "Bandırma", "+905416525584", "bilal@gmail.com", 0);
        Faculty faculty = new Faculty("Bilal", "Bandırma", "+905416525584", "bilal@gmail.com","102", 50000, "'10am to 6 pm'", "'manager'");
        Employee employee = new Employee("Bilal", "Bandırma", "+905416525584", "bilal@gmail.com", "910", 600000);
        Staff staff = new Staff("Bilal", "Bandırma", "+905416525584", "bilal@gmail.com", "910", 600000, "CEO");

        System.out.println(person.toString());
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
        System.out.println(employee.toString());
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff.toString());
    }
}
