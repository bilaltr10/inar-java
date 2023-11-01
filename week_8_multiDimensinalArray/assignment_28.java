package week_8_multiDimensinalArray;

public class assignment_28 {

    public static void main(String[] args) {

        System.out.println("Enter two 3-by-3 matrix to check whether they are " +
                "strictly identical");

        System.out.println("Enter list-1:");
        double[][] listOne = assignment_25.makeTheList();
        System.out.println("Enter list-2");
        double[][] listTwo = assignment_25.makeTheList();

        System.out.println("The two arrays are"+(equals(listOne,listTwo)?"":" not")+" strictly identical");

    }

    public static boolean equals(double[][] listOne,double[][] listTwo){

        for (int i = 0; i < listOne.length; i++) {
            for (int j = 0; j < listOne[0].length; j++) {
                if(listOne[i][j] != listTwo[i][j] )
                    return false;

            }

        }


        return true;
    }
}
