package Week_13.Q_17;

public class Complex implements Cloneable {

    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }


    public String add(Complex number) {
      return   toString(this.getReal() + number.getReal(), this.getImaginary() + number.getImaginary());
    }


    public String substract(Complex number) {
      return   toString(this.getReal() - number.getReal(), this.getImaginary() - number.getImaginary());
    }

    public String multiply(Complex number) {
     return    toString(this.getReal() * number.getReal() - this.getImaginary() * number.getImaginary(),
                this.getImaginary() * number.getReal() + this.getReal() * number.getImaginary());
    }

    public String divide(Complex number) {
     return    toString(this.getReal() / number.getReal(), this.getImaginary() / number.getImaginary());
    }

    public String abs() {
        return Math.sqrt((Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2))) + "";
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex) super.clone();

    }


    public String toString(double a, double b) {
        if (a != 0 && b != 0) return a + " + " + b + "i";
        else if (a == 0 && b != 0) return b + "i";
        else return a + "";
    }
    public String toString(){
        if (this.getReal() != 0 && this.getImaginary() != 0) return "("+this.getReal() + " + " + this.getImaginary() + "i)";
        else if (this.getReal() == 0 && this.getImaginary() != 0) return "("+this.getImaginary() + "i)";
        else return "("+this.getReal() + ")";    }
}
