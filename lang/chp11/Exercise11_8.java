public class Exercise11_8{
    public static void main(String[] args){
        Account georgesAccount = new Account(1122, 1000, "George");
        georgesAccount.setAnnualInterestRate(1.5);

        georgesAccount.deposit(30);
        georgesAccount.deposit(40);
        georgesAccount.deposit(50);
        georgesAccount.withdraw(5);
        georgesAccount.withdraw(4);
        georgesAccount.withdraw(2);

        System.out.println(georgesAccount.toString());
        System.out.println();
        georgesAccount.printTransactions();
    }
}