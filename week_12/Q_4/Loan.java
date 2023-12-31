package week_12.Q_4;
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default constructor
     */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /**
     * Construct a loan with speci�ed annual interest rate,
     * 13 * number of years, and loan amount
     * 14
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException("loanAmount must be greater than 0.");
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
        if (numberOfYears <= 0)
            throw new IllegalArgumentException("numberOfYears must be greater than 0.");

        this.annualInterestRate = annualInterestRate;
         this.numberOfYears = numberOfYears;
         this.loanAmount = loanAmount;
         loanDate = new java.util.Date();

         }


    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
         return annualInterestRate;
         }

         /** Set a new annualInterestRate */
        public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
         }

         /** Return numberOfYears */
         public int getNumberOfYears() {
        return numberOfYears;
        }

         /** Set a new numberOfYears */
         public void setNumberOfYears(int numberOfYears) {
         this.numberOfYears = numberOfYears;
         }

         /** Return loanAmount */
         public double getLoanAmount() {
         return loanAmount;
         }

         /** Set a new loanAmount */
         public void setLoanAmount(double loanAmount) {
         this.loanAmount = loanAmount;
         }

         /** Find monthly payment */
         public double getMonthlyPayment() {
         double monthlyInterestRate = annualInterestRate / 1200;
         double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
         return monthlyPayment;
         }

         /** Find total payment */
         public double getTotalPayment() {
         double totalPayment = getMonthlyPayment() * numberOfYears * 12;
         return totalPayment;
        }

         /** Return loan date */
         public java.util.Date getLoanDate() {
         return loanDate;
         }

}