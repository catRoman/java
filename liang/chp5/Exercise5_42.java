/*  (Financial application: find the sales amount) Rewrite
    Programming Exercise 5.39 as follows:
    --> Use a for loop instead of a do-while loop.
    --> Let the user enter COMMISSION_SOUGHT instead of
         fixing it as a constant.
*/
/* alll dickered might come back to fix feel like moving on issue with logic */

public class Exercise5_42{
    public static void main(String[] args){
       java.util.Scanner input = new java.util.Scanner(System.in);
       
        double baseSalary = 5000;
        double commission = 0;
        double totalSales = 0;
        

        System.out.println("Enter the commission sought: ");
        int COMMISION_SOUGHT = input.nextInt();

        for(int sales =1; commission <= COMMISION_SOUGHT; sales++){
            
            commission += commissionRateFunction((double)sales/100);

            totalSales = sales;
            
        }
        totalSales = (int)(Math.round(totalSales * 100)) / 100.0;
        System.out.println("In order to make " + COMMISION_SOUGHT + " a year excluding your base salary "
                            + "you would need to have a sales amount of $" + totalSales);
    }

    public static double commissionRateFunction(double amount){
      double commission = 0;
        if (amount > 0 && amount <= 5000)
            commission = amount * 0.08;
            
        else if ( amount > 5000 && amount <= 10000)
            commission = amount * 0.1;
        else if ( amount > 10000)
            commission = amount * 0.12;

        return commission;
    }
}