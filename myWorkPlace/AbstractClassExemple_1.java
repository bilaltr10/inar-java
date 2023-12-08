package myWorkPlace;

import java.util.GregorianCalendar;

public abstract class AbstractClassExemple_1 {
    // dükkandaki ürünler...
    String nameOfPruduct;
    double valueOfProduct;
    int year;
    int month;
    int day;

    AbstractClassExemple_1() {

    }

    AbstractClassExemple_1(String nameOfPruduct, double valueOfProduct) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.nameOfPruduct = nameOfPruduct;
        this.valueOfProduct = valueOfProduct;
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    public abstract double calculateTheValue();

    public abstract int getNumberOfStock();

    public abstract void setNumberOfStock(int a );

    public abstract void errorMessageForExpirationDate();
    public abstract String setTheExpirationDate();
}
