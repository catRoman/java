
/**     UML Diagram
 *  ------------------------
 *          Stock
 *  ------------------------
 *  symbol : String
 *  name: String
 *  previousClosingPrice : double
 *  currentPrice : double
 *  ------------------------
 *  + Stock(symbol, name : String, previousClosingPrice : double )
 *  + getChangePercent(): double
 */

public class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String newSymbol, String newName, double newPrevClosePrice){
        symbol = newSymbol;
        name =newName;
        previousClosingPrice = newPrevClosePrice;
    }

    public double getChangePercent(){
        return (int)((currentPrice - previousClosingPrice) * 100 )/100.0;
    }
}