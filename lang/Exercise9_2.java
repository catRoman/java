public class Exercise9_2{
    public static void main(String[] args){
        Stock newStock = new Stock("ORCL", "Oracle Corporation", 34.5);

        newStock.currentPrice = 34.35;

        System.out.println("Name: " + newStock.name);
        System.out.println("Symbol: " + newStock.symbol);
        System.out.println("Current Price: " + newStock.currentPrice);
        System.out.println("Previous Close: " + newStock.previousClosingPrice);
        System.out.println("Change: " + newStock.getChangePercent());
    
        Stock test = new Stock("test", "TST", 10);

        System.out.println("Test current Price: " + test.currentPrice);
    
       

    }
}

