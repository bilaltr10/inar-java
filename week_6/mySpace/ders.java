package week_6.mySpace;

public class ders {
    public static void main(String[] args) {
        int [] m = new int[] {0,1,2,3,4,5,6,7};

        int temp =m[0];

        for (int i = 1; i <m.length ; i++) {
            m[i-1] = m[i];
        }
        m[m.length-1]=temp;
       for (int n :m){
           System.out.println(n);
       }
    }
}
