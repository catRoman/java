public class Exercise9_7{
    public static void main(String[] args){
        Account myAccount = new Account(1122, 20000);

        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        System.out.println("Account " + myAccount.getId() + " Info: ");
        System.out.println("Acount Created: " + myAccount.getDateCreated());
        System.out.printf("Monthly Interest: $%1.2f\n",myAccount.getMonthlyInterest());
        System.out.printf("Balance: $%1.2f\n",myAccount.getBalance());
    }
}