package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_17 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of banks :");
        int numberOfBanks = input.nextInt();
        System.out.println("Enter minimum total assets for keeping a bank safe : ");
        int minimumTotalAssset = input.nextInt();

        int[][] list = new int[numberOfBanks][5];

        int[] totalAssetOfTheEachBank = new int[5];

        borrowers(numberOfBanks, list, totalAssetOfTheEachBank);


        int[] numberOfUnsafeBank = {-1, -1, -1, -1, -1};

        findTheUnsafeBank(totalAssetOfTheEachBank, minimumTotalAssset, numberOfUnsafeBank);

        checkTheBorrowersGivesLoanToTheUnsafeBank(list, numberOfUnsafeBank, totalAssetOfTheEachBank);

        int[] unsafeBanks = findTheUnsafeBank(totalAssetOfTheEachBank, minimumTotalAssset, numberOfUnsafeBank);
        System.out.print("Unsafe bank" + (indisNumberOfUnsafeBank(numberOfUnsafeBank) > 1 ? "s are " : " is "));
        for (int unsafeBank : unsafeBanks) {
            if (unsafeBank != -1)
                System.out.print("{bank-" + unsafeBank + "}" + " ");
        }
    }

    public static void borrowers(int numberOfBanks, int[][] list, int[] totalAssetOfTheEachBank) {

        for (int i = 0; i < numberOfBanks; i++) {
            System.out.print("Enter bank " + i + " 's total assets. Enter the number of banks " +
                    "that borrowed money from bank" + i + " . Enter borrowers ID and amount borrowed");
            totalAssetOfTheEachBank[i] = input.nextInt();
            int numberOfBanksBorrowedMoney = input.nextInt();
            for (int j = 0; j < numberOfBanksBorrowedMoney; j++) {
                int borrowersID = input.nextInt();
                list[i][borrowersID] = input.nextInt();
                totalAssetOfTheEachBank[i] += list[i][borrowersID];
            }

        }


    }

    public static int[] findTheUnsafeBank(int[] totalAssetOfTheEachBank, int minimumTotalAssset, int[] numberOfUnsafeBank) {
        int m = 0;
        for (int i = 0; i < totalAssetOfTheEachBank.length; i++) {
            if (totalAssetOfTheEachBank[i] < minimumTotalAssset) {
                numberOfUnsafeBank[m] = i;
                m++;
            }

        }
        return numberOfUnsafeBank;
    }

    public static void checkTheBorrowersGivesLoanToTheUnsafeBank(int[][] list, int[] numberOfUnsafeBank, int[] totalAssetOfTheEachBank) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < numberOfUnsafeBank.length; j++) {
                if (numberOfUnsafeBank[j] != -1)
                    totalAssetOfTheEachBank[i] -= list[i][numberOfUnsafeBank[j]];
            }
        }
    }

    public static int indisNumberOfUnsafeBank(int[] ss) {
        int count = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != -1) {
                count++;
            }
        }

        return count;

    }
}
// 25 2 1 100 4 320
// 125 2 2 40 3 85
//175 2 0 125 3 75
// 75 1 0 125
// 181 1 2 125