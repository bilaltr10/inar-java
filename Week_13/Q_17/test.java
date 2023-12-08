package Week_13.Q_17;

public class test {
    public static void main(String[] args) {
        Complex complex = new Complex(3.5,5.5);
        Complex complex1 = new Complex(-3.5,1);

        System.out.println(complex+" + "+complex1 + " = "+complex.add(complex1));
        System.out.println(complex+" - "+complex1 + " = "+complex.substract(complex1));
        System.out.println(complex+" * "+complex1 + " = "+complex.multiply(complex1));
        System.out.println("| "+complex+" | = " +complex.abs());



    }
}
