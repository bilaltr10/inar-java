package week_9_object;

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        name = newName;
        symbol = newSymbol;
    }

    double getChangePercent(double newPreviousClosingPrice, double newCurrentPrice) {
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
return 100-((previousClosingPrice*100)/currentPrice);
    }
}
