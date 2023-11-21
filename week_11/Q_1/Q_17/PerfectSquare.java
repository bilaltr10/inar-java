package week_11.Q_1.Q_17;

import java.util.ArrayList;
import java.util.Collections;

public class PerfectSquare {

    int value;
    ArrayList<Integer> list = new ArrayList<>();

    PerfectSquare() {

    }

    PerfectSquare(int value) {
        this.value = value;
        addTheNumbersToList();

    }

    public void addTheNumbersToList() {
        int i = 2;
        int valuee = this.value;
        while (valuee > 1) {
            if (valuee % i == 0) {
                list.add(i);
                valuee /= i;
            } else {
                i++;
            }
        }



    }

    public int perfectSquadre() {
        int a = 1;
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) % 2 != 0) {
                a *= i;
            }

        }
        return a;
    }
}
