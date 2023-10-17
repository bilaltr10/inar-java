package week_7_arrays.assignments;

public class assignment_23_student_locker {
    public static void main(String[] args) {

        boolean[] list = makeTheList();
       boolean[] changedList = changeTheLocker(list);
       writeTheList(changedList);



    }

    public static boolean[] makeTheList() {
        boolean[] lockers = new boolean[100];
        return lockers;

    }

    public static boolean[] changeTheLocker(boolean [] list) {

        for (int i = 1; i <= list.length; i++) {
            for (int j = i; j <= list.length; j++) {
                if (j % (i) == 0) {
                    list[j-1] = !list[j-1];
                }}}
        return list;
    }
        public static void writeTheList(boolean[] list){
            System.out.println("Open lockers : ");
        for (int i = 0; i < list.length; i++) {
                if(list[i]){
                    System.out.print("L"+(i+1)+" ");
                }
            }

        }

}
