package week_10.Q_2;

import week_9_object.MyField.Book;

public class BMI {
    String name;
    int age;
    double weight;
    double height;

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    public static final int INCH_PER_FOOT = 12;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, inches + feet * INCH_PER_FOOT);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    double findTheBMI() {
      return (double)Math.round(  weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH)));
    }

    String BMIInterpretation() {
        double BMI = (findTheBMI());
        if (BMI < 18.5) return " BELOW NORMAL WEIGHT";
        else if (BMI >= 18.5 && BMI < 25) {
            return " NORMAL WEIGHT";
        } else if (BMI >= 25 && BMI < 35) {
            return " OVERWEIGHT";
        } else {
            return " OBESE";

        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
