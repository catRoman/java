import java.util.Scanner;

public class Exercise2_21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

double monthlyInterestRate = annualInterestRate/1200;
double a = monthlyInterestRate + 1;
double b = years * 12;
        double value = investmentAmount * Math.pow(a,b);
System.out.println(Math.pow(a,b));
     
value = ((int)(value * 10) + 0.5)/10;

System.out.println("Accumulated value is " + value);
    }
}