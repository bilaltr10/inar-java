package week_8_multiDimensinalArray;

public class assignment_29 {

    public static void main(String[] args) {

        System.out.println("Enter two 3-by-3 matrix to check whether they are identical");

        System.out.println("Enter list-1:");
        double[][] listOne = assignment_25.makeTheList();
        System.out.println("Enter list-2");
        double[][] listTwo = assignment_25.makeTheList();

        System.out.println("The two arrays are"+(equals(listOne,listTwo)?"":" not")+" identical");

    }
    public static boolean equals(double[][] listOne,double[][] listTwo){
boolean isContains = true;
        for (int i = 0; i < listOne.length; i++) {
            for (int j = 0; j < listOne[0].length; j++) {
            if(!isContain(listOne[i][j],listTwo))
                return false;
            }

        }


        return true;
    }

    public static boolean isContain(double x,double[][] listTwo){

        for (int i = 0; i <listTwo.length ; i++) {
            for (int j = 0; j < listTwo[0].length; j++) {
                if (x ==listTwo[i][j]){
                    return true;
                }

            }

        }
        return false;

    }
        }

