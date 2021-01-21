import java.util.Scanner;

public class Exercise6_7 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.println("Years\tFuture Value");
        for(int i = 1; i <= years; i++){
            System.out.printf("%-5d\t%12.2f\n",i,futureInvestmentValue(investmentAmount, annualInterestRate, i));
        }
        
    }
    public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years){
        
        double monthlyInterestRate = annualInterestRate/12;
        double a = monthlyInterestRate + 1;
        double b = years * 12;
        double value = investmentAmount * Math.pow(a,b);
       
     
        value = Math.floor(value * 100) / 100.0;
        
        return value;
    }

}