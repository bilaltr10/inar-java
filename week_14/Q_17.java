package week_14;

import java.util.*;

public class Q_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = fillTheList(input);

        //to find the distinct numbers
        Set<Integer> setList = new HashSet<>(numbers);

//re-assign distinct numbers to arrayList
        ArrayList<Integer> distinctNumbers = new ArrayList<>(setList);
//assign the numbers to hash key distinctnumber value is amount of repeat
        HashMap<Integer, Integer> hashMapList = new HashMap<>();
        for (int i = 0; i < setList.size(); i++) {
            hashMapList.put(distinctNumbers.get(i), 0);
        }

//count the numbers
        for (Integer number : numbers) {
            if (hashMapList.containsKey(number)) {
                int a = hashMapList.get(number) + 1;
                hashMapList.put(number, a);
            }
        }

        //find the repeats and biggest of repeat amount
        ArrayList<Integer> repeatAmount = new ArrayList<>(hashMapList.values());
        int big = findTheBiggestRepeatAmount(repeatAmount);


        showTheMostRepeatedNumber(repeatAmount, distinctNumbers, hashMapList, big);


    }


    public static ArrayList<Integer> fillTheList(Scanner input) {
        System.out.println("Enter integers (enter 0 to stop)");
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int a = input.nextInt();
            if (a != 0) numbers.add(a);
            else break;
        }
        return numbers;
    }

    public static int findTheBiggestRepeatAmount(ArrayList<Integer> repeatAmount) {
        int biggestRepeatAmount = 0;
        for (int i = 0; i < repeatAmount.size(); i++) {
            for (int j = 0; j < repeatAmount.size() - 1; j++) {
                if (repeatAmount.get(j) > repeatAmount.get(j + 1)) {
                    biggestRepeatAmount = repeatAmount.get(j);
                }
            }
        }
        return biggestRepeatAmount;
    }

    public static void showTheMostRepeatedNumber(ArrayList<Integer> repeatAmount, ArrayList<Integer> distinctNumbers,
                                                 HashMap<Integer, Integer> hashMapList, int big) {
        String str = "";

        for (int i = 0; i < repeatAmount.size(); i++) {
            if (hashMapList.get(distinctNumbers.get(i)) == big) {
                str += distinctNumbers.get(i) + " ";
            }
        }

        System.out.println(str + "--> " + big + " times");
    }
}
