import java.util.Scanner;

public class Exercise2_22{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer amount in cents for example $11.56 is equaol to 1156: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int numberOfOneDollars = remainingAmount/ 100;
        remainingAmount = remainingAmount % 100;
        
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

       
        System.out.println("Your amount $" + (double)amount/100 + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars ");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    "+ numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
        

    }
}