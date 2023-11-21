package week_11.Q_1.Q_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxElementInArrayList {



    public MaxElementInArrayList(){
    }


    public static Integer max( ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return Collections.max(list);
        }

    }


}
