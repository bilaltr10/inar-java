package week_8_multiDimensinalArray;

import java.util.Scanner;

//x = (ed - bf) / (ad - bc)
public class assignment_31 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4,");
        double[][] list = new double[4][2];
        writeTheList(list);
        getIntersectingPoint(list);
    }

    public static void writeTheList(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();
            }
        }
    }


    public static void getIntersectingPoint(double[][] list) {
        double a = list[0][1] - list[1][1];
        double b = list[0][0] - list[1][0];
        double e = ((list[0][1] - list[1][1]) * list[0][0] )- (list[0][0] - list[1][0]) * list[0][1];
        double c = (list[2][1] - list[3][1]);
        double d = list[2][0] - list[3][0];
        double f = ((list[2][1] - list[3][1]) * list[2][0] )- (list[2][0] - list[3][0]) * list[2][1];
        findTheCrammerRule(a, b, c, d, e, f);
    }

    public static void findTheCrammerRule(double a, double b, double c, double d, double e, double f) {

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
if(x== Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY){
    System.out.println("The two lines are parallel");
}
else{
    System.out.printf("The intersecting point is at (%.3f , %.3f)" , x,y);
}

    }
}
