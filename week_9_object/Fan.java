package week_9_object;

public class Fan {

    int slow = 1;
    int medium = 2;
    int fast = 3;
    private int speed = slow;
    boolean on;
    private double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    Fan() {
    }

    /*■ A method named toString() that returns a string description for the fan. If
    the fan is on, the method returns the fan speed, color, and radius in one combined
    string. If the fan is not on, the method returns the fan color and radius
    along with the string “fan is off” in one combined string.*/
    String toSstring() {
        if (on) {
            return " Fan speed :" + speed + ", color:  " + color + ", radius:  " + radius;
        } else {
            return "Fan color : "+color + ", radius :  " + radius + "\nFan is off";
        }
    }

}
