/**======================
 *      SavingsAccount
 * ======================
 * -overdraftLimit : int 
 * +SavingsAccount()
 * +SavingsAccount(id : int,
 *                   balance : double)
 * +setBalance(double balance)
 * +withdrawal(double amount)
 * +toString()
 */

public class SavingAccount extends Account{
    
    
    public SavingAccount(){
    }
    
    public SavingAccount(int id, double balance){
       super.setId(id);
       this.setBalance(balance);
    }
    @Override
    public void setBalance(double balance){
        if(balance >= 0){
            super.setBalance(balance);
        }else{
            System.out.println("Error balance is below alloted overdraft");
        }
    }
    @Override
    public void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("insuffeicent funds");
        }else
           super.withdraw(amount);
    }
    @Override
    public String toString(){
        return "Savings Account\n" + super.toString();
    }
    
}