package week_9_object;

public class testOf_Fan {
    public static void main(String[] args) {
//        Write a test
//        program that creates two Fan objects. Assign maximum speed, radius 10, color
//        yellow, and turn it on to the �rst object. Assign medium speed, radius 5, color
//        blue, and turn it off to the second object. Display the objects by invoking their
//        toString method
//
        Fan fan = new Fan();
        Fan fan1 = new Fan();
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        fan1.setSpeed(2);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);

        System.out.println(fan.toSstring());
        System.out.println("---------------------------");
        System.out.println(fan1.toSstring());
    }
}
