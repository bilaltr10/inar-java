package week_14;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range = findTheRange(input);
        ArrayList<Integer> list = assignTheFirstList(input, range);
        ArrayList<Integer> missingNumbers = missingNumbers(list);
        showTheTwoLists(list, missingNumbers);

    }


    public static ArrayList<Integer> assignTheFirstList(Scanner input, int targetNumber) {

        System.out.println("Enter the elements of ArrayList (each in the range [1,n])");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < targetNumber; i++) {
            int n = input.nextInt();
            if (n > targetNumber) {
                System.out.println("range is from 1 to " + targetNumber);
            } else {
                list.add(n);
            }
        }
        return list;
    }


    public static ArrayList<Integer> missingNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= list.size(); i++) {
            if (!list.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static int findTheRange(Scanner input) {
        System.out.println("Enter the number of elements   (n) : ");
        return input.nextInt();
    }

    public static void showTheTwoLists(ArrayList<Integer> list, ArrayList<Integer> missingNumbers) {
        System.out.println("Entered numbers : " + list);
        System.out.println("Numbers missing from the ArrayList  : " + missingNumbers);
    }
}
