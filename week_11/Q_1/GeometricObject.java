package week_11.Q_1;

public class GeometricObject {
     private String color ;
   private boolean filled ;

    public GeometricObject(){
        this("white",false);
    }
    public GeometricObject(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
