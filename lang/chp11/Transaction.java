/**===================
 *      Transaction
 * ===================
 * -date: java.util.Date
 * -type: char
 * -amount: double
 * -balance: double
 * -description: String
 * +Transacation(type: char, amount: double,
 *               balance: double, description: String)
 * +getDate(): java.util.Date
 * +getType(): char
 * +getAmount(): double
 * +getBalance(): double
 * +getDescription(): String
 * +setDate(date: java.util.Date ): void
 * +setType(type: char): void
 * +setAmount(balance: double): void
 * +setBalance(balance: double): void
 * +setDescription(description: String): void
 * +toString()
 */
import java.util.Date;


 public class Transaction{
     private Date date;
     private char type;
     private double amount;
     private double balance;
     private String description;

     public Transaction(char type, double amount, 
                        double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }
    public Date getDate(){
        return date;
    }
    public char getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getDescription(){
        return description;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setType(char type){
        this.type = type;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return getDate().toString() 
            + String.format("\t| %c | $%5.2f\t| $%1.2f\t| %s", 
                            getType(),getAmount(),getBalance(), 
                            getDescription());
    }
 }