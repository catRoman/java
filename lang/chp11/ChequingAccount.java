/**======================
 *      ChequingAccount
 * ======================
 * -overdraftLimit : int 
 * +ChequingAccount()
 * +ChequingAccount(overDraftLimit : int)
 * +ChequingAccount(overDraftLimit : int, id : int,
 *                   balance : double)
 * +setBalance(double balance)
 * +setOverDraftLimit(int overDraftLimit) : void
 * +getOverdraftLimit() : int
 * +withdrawal(double amount)
 * +toString()
 */

 public class ChequingAccount extends Account{
     private int overDraftLimit = 500;
     
     public ChequingAccount(){
     }
     public ChequingAccount(int overDraftLimit){
         this.overDraftLimit = overDraftLimit;
     }
     public ChequingAccount(int overDraftLimit, 
                            int id, double balance){
        super.setId(id);
        this.overDraftLimit = overDraftLimit;
        this.setBalance(balance);
     }
     public int getOverDraftLimit(){
         return overDraftLimit;
     }
     public void setOverDraftLimti(int overDraftLimit){
         this.overDraftLimit = overDraftLimit;
     }
     @Override
     public void setBalance(double balance){
         if(balance >= (overDraftLimit * -1)){
             super.setBalance(balance);
         }else{
             System.out.println("Error balance is below alloted overdraft");
         }
     }
     @Override
     public void withdraw(double amount){
         if(balance - amount < (overDraftLimit * -1)){
             System.out.println("insuffeicent funds");
         }else
            super.withdraw(amount);
     }
     @Override
     public String toString(){
         return "Chequing Account\n" + super.toString();
     }
     
 }