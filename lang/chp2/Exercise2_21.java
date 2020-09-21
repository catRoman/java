import java.util.Scanner;

public class Exercise2_21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double monthlyInterestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        double value = investmentAmount * Math.pow((1 + monthlyInterestRate),(years * 12));

        System.out.println("Accumulated value is " + (int)value);
    }
}