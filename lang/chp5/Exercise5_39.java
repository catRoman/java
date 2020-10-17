public class Exercise5_39{
    public static void main(String[] args){
        double baseSalary = 5000;
        double commission = 0;
        double totalSales = 0;
        double sales= 0.01;

        for(int i =1; commission <= 30000; i++){
            
            commission = commissionRateFunction((double)sales);

            totalSales = sales;
            sales = sales + 0.01;
        }
      //  totalSales = (int)(Math.round(totalSales * 100)) / 100;
        System.out.println("In order to make $30000 a year including your base salary "
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