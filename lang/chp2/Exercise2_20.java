import java.util.Scanner;

class Exercise2_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3 %): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate/1200.0);
        System.out.println(interest);
        interest = (int)((interest * 10000)+0.5)/10000.0;
        System.out.println("The interest is " + interest);
    }
}