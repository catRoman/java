import java.util.Scanner;
public class Exercise2_13 {

    public static double sixMonthTotal(double amount){
       double total = 0;
        for(int i = 0; i < 6; i++){
             total = (amount + total)*(1+ 0.00417);
             
            
        }
        total = (int)(total * 100)/100.0;
        return total;
    }

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the monthly saving amount: ");
    double amount = input.nextDouble();

    System.out.println("After the sixths month, the account value is $" + sixMonthTotal(amount));

}
}