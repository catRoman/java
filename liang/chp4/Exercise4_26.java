import java.util.Scanner;

public class Exercise4_26{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();


        int numberOfDollars = Integer.parseInt(amount.substring(0,amount.indexOf('.')));

        int cents = Integer.parseInt(amount.substring(amount.indexOf('.')+1));

        int numberOfQuarters = cents / 25;
        cents %= 25;

        int numberOfDimes = cents /10;
        cents%= 10;

        int numberOfNickles = cents / 5;
        cents %= 5;
        
        int numberOfPennies = cents;

        System.out.printf("You amount $%s consists of \n"
                    + "\t%s dollars\n"
                    + "\t%s Quarters\n"
                    + "\t%s dimes\n"
                    + "\t%s nickles\n"
                    + "\t%s pennies\n",
                    amount,numberOfDollars,numberOfQuarters,
                    numberOfDimes,numberOfNickles,numberOfPennies);
                    
                    
    }
}