package week_8_multiDimensinalArray;


import java.util.Scanner;

public class assignment_21 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of cities : ");
        int numberOfCities = input.nextInt();
        System.out.println("Enter the coordinates of the cities ");
        double[][] coordinatesOfCities = enterTheCoordinates(numberOfCities);
        double[] array = findTheCentralCity(coordinatesOfCities);
        writeTheCentralCity(array);


    }

    private static double[][] enterTheCoordinates(int numberOfCities) {
        double[][] list = new double[numberOfCities][2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();
            }

        }
        return list;


    }


    public static double[] findTheCentralCity(double[][] coordinatesOfCities) {

        double distance;
        double minDistance = Integer.MAX_VALUE;
        double[] cityAt;
        double[] centralCity = new double[3];
        for (double[] ofCity : coordinatesOfCities) {
            cityAt = ofCity;
            distance = 0;
            for (double[] coordinatesOfCity : coordinatesOfCities) {
                distance += Math.sqrt(Math.pow(cityAt[0] - coordinatesOfCity[0], 2) + Math.pow(cityAt[1] - coordinatesOfCity[1], 2));

            }
            if (distance < minDistance) {
                minDistance = distance;
                System.arraycopy(cityAt, 0, centralCity, 0, cityAt.length);
                // ilk baş bunu centralCity= cityAt diye yaptım ve aşağıda 2. indisi verdiğimde hep hata aldım çünkü böyle yaparak direk iki array birbirine kopyalıyoruz
            }

        }
        centralCity[2] = minDistance;

        return centralCity;
    }

    public static void writeTheCentralCity(double[] city) {
        System.out.printf("The central city is at (%.1f , %.1f) %n", city[0], city[1]);
        System.out.printf("The total distance to all other cities is : %.2f", city[2]);

    }
}
//2,5 5 5,1 3 1 9 5,4 54 5,5 2,1
