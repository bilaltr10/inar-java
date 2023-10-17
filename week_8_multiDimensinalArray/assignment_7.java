package week_8_multiDimensinalArray;

public class assignment_7 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
                {-1.5, 4, 2}, {5.5, 4, -0.5}};
        findTheDistance(points);
    }


    public static void findTheDistance(double[][] list) {
        double distance;
        double closestPoint = 1000;
        double[] m= new double[3];
        double[] n= new double[3];
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                distance = Math.sqrt(Math.pow(list[i][0] - list[j][0], 2) + Math.pow(list[i][1] - list[j][1], 2) + Math.pow(list[i][2] - list[j][2], 2));
                if (distance < closestPoint) {
                    closestPoint = distance;
                     m = list[i];
                     n = list[j];
                }
            }
        }
       write(m,n);
    }
    public static void write(double[] a, double [] b){
        System.out.print("The closest two points are (");
        for (int i = 0; i <a.length ; i++) {
            if(i!=2){
                System.out.print(a[i]+" , ");
            }
            else{
                System.out.print(a[i]);
            }
        }
        System.out.print(") and (");
        for (int i = 0; i <b.length ; i++) {
            if(i!=2){
                System.out.print(b[i]+" , ");
            }
            else{
                System.out.print(b[i]+")");

            }
        }
    }
}
