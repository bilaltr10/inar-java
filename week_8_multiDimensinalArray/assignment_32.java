package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_32 {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3");
        double[][] list=fillTheList();
      double area=getTriangleArea(list);
        if(area>0){
            System.out.printf("The area of triangle is : %.2f ",area);

        }else{
            System.out.println("The three points are on the same line");

        }
    }

    public static double[][] fillTheList(){
        double [][] list =new double[3][2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();

            }
        }
         return list;
    }

    public static double getTriangleArea(double[][] points){
       double[] sides= findTheLengthOFSides(points);
       double totalSide=0;
        for (double side : sides) {
            totalSide += side;
        }
     return findTheArea(sides,totalSide/2);

    }

    // d = √(x,-x₂)²+(y₁-Y)²
    public static double[] findTheLengthOFSides(double[][] points){
        double [] lengthOFSides = new double[3];
        lengthOFSides[0] =Math.sqrt(Math.pow((points[0][0]-points[1][0]),2)+Math.pow((points[0][1]-points[1][1]),2));
        lengthOFSides[1] =Math.sqrt(Math.pow((points[1][0]-points[2][0]),2)+Math.pow((points[1][1]-points[2][1]),2));
        lengthOFSides[2] =Math.sqrt(Math.pow((points[0][0]-points[2][0]),2)+Math.pow((points[0][1]-points[2][1]),2));

        return lengthOFSides;
}

public static double findTheArea(double[] sides , double totalSide){

        return Math.sqrt(totalSide*(totalSide-sides[0])*(totalSide-sides[1])*(totalSide-sides[2]));


}
}
