package week_7_arrays.assignments;
import java.util.Arrays;
public class assignment_24_pick_4_card {
   static String temp = "";
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] names = new String[]{"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] namesOfCard = new String[52];
        int m = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < names.length; j++) {
                namesOfCard[m] = numbers[i] + " of " + names[j];
                m++;
            }
        }
        int pick = 0;
        String[] chosenNames = new String[4];
        while (!Arrays.equals(names,chosenNames)) {
            System.out.println("************** ("+ (pick+1)+". pick)"+" **********************");

            for (int i = 0; i < 4; i++) {
                int a = (int) (Math.random() * 52);
                System.out.println((i + 1) + ". card : " + namesOfCard[a]);
                chosenNames[i] = namesOfCard[a].substring(namesOfCard[a].indexOf('f') + 2);
              namesOfCard[namesOfCard.length-1]= namesOfCard[a];

                for (int j = 0; j < namesOfCard.length-1; j++) {
                    temp = namesOfCard[a];
                    namesOfCard[a]=namesOfCard[namesOfCard.length-1];
                    namesOfCard[namesOfCard.length-1]=temp;


                }

            }
            pick++;
       }
        System.out.println("*************************************************");
       System.out.println("Number of picks : " + pick);

    }
}
