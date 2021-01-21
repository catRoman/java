public class Exercise10_7{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        Account[] accountList = new Account[10];
        for(int i = 0; i < accountList.length; i++){
            accountList[i] = new Account(i, 100);
        }

        while(true){
        System.out.print("Enter an id: ");
        int idInput = input.nextInt();
        int choice = 0;
        do{
        System.out.println();
        menuPrint();
        System.out.print("Enter a choice: ");
        choice = input.nextInt();
        menuSelect(choice,accountList[idInput]);
        }while(choice != 4);
        }
    }
public static void menuPrint(){
    System.out.println("Main Menu");
    System.out.println("1: check balance");
    System.out.println("2: withdrawal");
    System.out.println("3: deposit");
    System.out.println("4: exit");
}
    public static void menuSelect(int menuSelection, Account myAccount){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        switch(menuSelection){
            case 1: System.out.println("The balance is " + myAccount.getBalance()); break;
            case 2: {
                System.out.print("Enter an amount to withdrawal: ");
                myAccount.withdraw(input.nextInt());
                break;
            }case 3: {
                System.out.print("Enter an amount to deposit: ");
                myAccount.deposit(input.nextInt());
                break;
            }case 4: System.out.println(); return;
        }
        
    }
}