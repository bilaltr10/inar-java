package week_10.Q_8;

public class Tax {
    int filingStatus;
    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;

    int[][] brackets;
    double[] rates;
    int taxableIncome;

    public static int[][] bracketsMethod() {
        return new int[][]{
                {8350, 33950, 82250, 171550, 372950}, // S�ngle f�ler
                {16700, 67900, 137050, 20885, 372950}, // Marr�ed jo�ntly
                {8350, 33950, 68525, 104425, 186475}, // Marr�ed separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
    }

    public static double[] ratesMethod() {
        return new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    }

    public static int getSingleFiler() {
        return SINGLE_FILER;
    }

    public static int getMarriedJointlyOrQualifyingWidow() {
        return MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
    }

    public static int getMarriedSeparately() {
        return MARRIED_SEPARATELY;
    }

    public static int getHeadOfHousehold() {
        return HEAD_OF_HOUSEHOLD;
    }

    public static void setSingleFiler(int singleFiler) {
        SINGLE_FILER = singleFiler;
    }

    public static void setMarriedJointlyOrQualifyingWidow(int marriedJointlyOrQualifyingWidow) {
        MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = marriedJointlyOrQualifyingWidow;
    }

    public static void setMarriedSeparately(int marriedSeparately) {
        MARRIED_SEPARATELY = marriedSeparately;
    }

    public static void setHeadOfHousehold(int headOfHousehold) {
        HEAD_OF_HOUSEHOLD = headOfHousehold;
    }

    Tax(int filingStatus, int[][] brackets, double[] rates, int taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;

    }
    Tax(){
    }

    double getTax(){
        return (calculateTax(filingStatus, brackets, rates, taxableIncome));
    }

    double calculateTax(int filingStatus, int[][] brackets, double[] rates, int amount){
        double taxAmount = 0;

        int i = 0;

        while (i < 5) {
            if (amount > brackets[filingStatus][i] ) {
                taxAmount += brackets[filingStatus][i] * rates[i];
                amount = amount - brackets[filingStatus][i];
                i++;
            }
            if (amount < brackets[filingStatus][i]) {
                taxAmount+= amount * rates[i];
                return taxAmount;
            }
            if(i==4){
                return taxAmount += amount*rates[i];
            }

        }


        return -1;
    }
}
