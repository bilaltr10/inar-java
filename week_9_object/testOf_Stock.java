package week_9_object;

public class testOf_Stock {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock name : "+stock.name);
        System.out.println("Stock symbol : "+ stock.symbol);
        System.out.println("Price-change percentage : "+ stock.getChangePercent(34.5,35.35));
    }
}
