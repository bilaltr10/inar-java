package myWorkPlace;

import java.util.InputMismatchException;

public class KOLA extends AbstractClassExemple_1 {

    private int numberOfStock;

    public int getNumberOfStock() {
        return numberOfStock;
    }

    KOLA(String nameOfProduct, double value, int numberOfStock) {
        super(nameOfProduct, value);
        this.numberOfStock = numberOfStock;
    }

    @Override
    public void setNumberOfStock(int a) {
        numberOfStock += a;
    }

    @Override
    public void errorMessageForExpirationDate() {

    }


    @Override
    public double calculateTheValue() {
        return valueOfProduct + valueOfProduct * 0.6;
    }

    public void extractFromStock(int numberOfStock) {
        if (this.numberOfStock - numberOfStock < 0) {
            throw new InputMismatchException("Not enough stock !!!");
        } else
            this.numberOfStock -= numberOfStock;
    }

    public String setTheExpirationDate() {
        if (nameOfPruduct.equals("Fanta"))
            return "\nExpiration Date : " + (year + 2) + "/" + month + "/" + day;
        else if (nameOfPruduct.equals("Coca-Cola"))
            return "\nExpiration Date : " + (year + 1) + "/" + month + "/" + day;
        return "-1";
    }


    public String toString() {
        return "Product name : " + nameOfPruduct +
                "\nValue : " + valueOfProduct +
                "\nDate : " + year + "/" + month + "/" + day +
                "\nCurrent Stock : " + numberOfStock +
                setTheExpirationDate();

    }


}
