/** ========================
 *         UML Diagram
 *  ========================
 *          Account
 *  ------------------------
 *  - id : int
 *  - balance : double
 *  - annualInterestRate : double
 *  - dateCreated : Date
 *  ------------------------
 *  + account()
 *  + account(int id, double balance)
 *  + getId() : int id
 *  + setId(int id)
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

 public class Account{

    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated = new Date();

    public Account(){

    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
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
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    @Override
    public String toString(){
        return  "-------------------------------\n"
                + "Account Id: " + getId()
                + "\nDate Created: " + getDateCreated()
                + "\nBalance: " + getBalance()
                + "\n-------------------------------\n";
    }

 }


