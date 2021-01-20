import java.util.Scanner;

public class Exercise6_22{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Loan Amount: ");
    int amount = input.nextInt();
    System.out.print("Number of years: ");
    int years = input.nextInt();
    System.out.print("Annual interest rate: ");
    int annualInterestRate = input.nextInt();
    System.out.println();

    double monthlyPayment = (amount * (annualInterestRate / 1200.0));

    System.out.println("Monthly Payment: " + monthlyPayment + " " + (amount/12.0));
}
}