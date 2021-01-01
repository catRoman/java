/** ========================
 *         UML Diagram
 *  ========================
 *          Account
 *  ------------------------
 *  - id : int
 *  - balance : double
 *  - annualInterestRate : double
 *  - dateCreated : Date
 *  - name : String
 *  - transacations : ArrayList<Transaction>
 *  ------------------------
 *  + account()
 *  + account(int id, double balance)
 *  + getId() : int id
 *  + setId(int id)
 *  + getName() : String
 *  + setName(String name) : void
 *  + getTransactions() : ArrayList<Transactions>
 *  + getBalance() : double balance
 *  + setBalance(double balance)
 *  + getAnnualInterestRate() : double annualInterestRate
 *  + setAnnualInterestRate(double annualInterestRate)
 *  + getDateCreated() : Date dateCreated
 *  + getMonthlyInterestRate() : double monthlyInterestRate
 *  + getMonthlyInterest() : double monthlyInterest
 *  + withdraw(double amount)
 *  + deposit(double ammount)
 *  +toString()
 *  ==========================
 */

import java.util.Date;
import java.util.ArrayList;

 public class Account{

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(){

    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    public Account(int id, double balance, String name){
        this(id, balance);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate / 100.0;
    }
    public String getDateCreated(){
        return this.dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        this.balance -= amount; 
        transactions.add(new Transaction('W',amount,getBalance(),"Withdrawal from Account #" + getId()));
    }
    public void deposit(double amount){
        this.balance += amount;
        transactions.add(new Transaction('D',amount,getBalance(),"Deposited into Account #" + getId()));
    }
    public void printTransactions(){
        for(Transaction e : transactions){
            System.out.println(e.toString());
        }
    }
    @Override
    public String toString(){
        return  "-------------------------------\n"
                + "Customer: " + getName()
                + "\nAccount Id: " + getId()
                + "\nAnnual Interest Rate: " + getAnnualInterestRate()
                + "\nDate Created: " + getDateCreated()
                + "\nBalance: " + getBalance()
                + "\n-------------------------------\n";
    }

 }


