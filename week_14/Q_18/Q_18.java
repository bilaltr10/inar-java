package week_14.Q_18;

public class Q_18 {
    public static void main(String[] args) {
ContactManager test = new ContactManager();

test.addContact("bilal","+905416525584");

        System.out.println(test.searchByName("bilal"));
        System.out.println(test.searchByPhoneNumber("+905416525584"));
    }
}
