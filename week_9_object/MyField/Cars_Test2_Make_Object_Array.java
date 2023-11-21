package week_9_object.MyField;

import java.util.Scanner;

public class Cars_Test2_Make_Object_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Test2[] list = new Test2[3];

       list[0] = new Test2("Audi","A4",1998,125000);
       list[1]= new Test2("BMW","420",2008,45000);
       list[2]= new Test2("Nissan","Quasgai",2022,14500);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].write());
        }

        System.out.println("*********************************");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].brand+" "+list[i].model+" "+ list[i].year+" "+list[i].km);
        }
    }
}
