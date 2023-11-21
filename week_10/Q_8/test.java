package week_10.Q_8;

public class test {
    public static void main(String[] args) {
        Tax tax = new Tax();
        int file = tax.filingStatus;
        int[][] list = tax.brackets;
        double[] rates = tax.rates;
        int taxableIncome = 50000;

        for (int i =taxableIncome ; i <60000; i+=1000 ) {
            Tax tax1 = new Tax(file, list, rates, taxableIncome);

            System.out.println(tax1.calculateTax(1, list,rates,i));

        }




    }
}
