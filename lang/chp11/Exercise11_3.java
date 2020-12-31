public class Exercise11_3{
    public static void main(String[] args){

        Account account1 = new Account(001, 100.10);
        ChequingAccount account2 = new ChequingAccount(500, 002, 100.50);
        SavingAccount account3 = new SavingAccount(003, 101.25);

        System.out.println(account1.toString());
        System.out.println();
        System.out.println(account2.toString());
        System.out.println();
        System.out.println(account3.toString());
        System.out.println();
        account3.withdraw(200);
        System.out.println();
        System.out.println(account3.toString());
        System.out.println();
        account2.withdraw(400);
        System.out.println();
        System.out.println(account2.toString());
        account2.withdraw(400);
        System.out.println();
        System.out.println(account2.toString());

        SavingAccount account4 = new SavingAccount(004, -10);
        System.out.println(account4.toString());
    }
}