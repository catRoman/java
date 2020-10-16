public class Exercise5_30{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = input.nextInt();
        System.out.print("Enter an annual interest rate: ");
        double annualInterest = input.nextDouble();

        double newAmount = 0;
        for(int i = 1; i <=6; i++){
            newAmount = (newAmount + amount) * (1 + (annualInterest / 12));
            System.out.printf("Month %d ---> %1.3f\n",i,newAmount); 
        }
    }
}