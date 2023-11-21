package week_9_object.MyField;

public class Student_Test1 {
    public static void main(String[] args) {

        Test1 [] test1s = new Test1[10];
        test1s[0] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[1] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[2] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[3] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[4] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[5] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[6] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[7] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[8] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);
        test1s[9] = new Test1("Bilal", "Topal", 11, 'B', 4301, 75, 55, 56);

       for(Test1 show : test1s){
          show.write();
           System.out.println("***************");
       }


    }
}
