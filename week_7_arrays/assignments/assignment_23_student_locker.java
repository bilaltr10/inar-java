package week_7_arrays.assignments;
public class assignment_23_student_locker {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[100];
        for (int i = 0; i < lockers.length; i++) {
            if (i == 0) {
                for (int j = 0; j < 100; j++) {
                    lockers[j] = true;
                }
            } else if (i == 1) {
                for (int j = 1; j < 100; j++) {
                    lockers[j] = false;
                }
            } else {
                for (int j = i; j <lockers.length; j += i) {
                    lockers[j] = !lockers[j];
                }
            }
        }
//
        System.out.print("Closed lockers : ");
        for (int i = 0; i <lockers.length ; i++) {
            if (!lockers[i]){
                System.out.print("L" + (i+1)+" ");
            }
        }
    }
}
