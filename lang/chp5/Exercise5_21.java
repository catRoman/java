import java.util.Scanner;

public class Exercise5_21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int years = input.nextInt();

        System.out.printf("\n%s\t%s\t%s\n\n","Interest Rate","Monthly Payment", "Total Payment");
       
        for(double i = 0; i < ((8-5) * 8) + 1; i++){
            
            double interest = (5 + (i * 0.125))/1200;
           
            double monthly = loanAmount * ((interest) / (1 - 1 / Math.pow(1 + interest, years * 12)));
            
            double total = monthly * years * 12;
            
            for(int column = 1; column <=3; column++){
               
                if (column == 1)
                System.out.printf("%-12s\t",addTrailingZeros(interest*1200));
                else if (column == 2)
                System.out.printf("%-13.2f\t",monthly);
                else
                System.out.printf("%-1.2f\n",total);
            }
        }
        
        }
        public static String addTrailingZeros(double number){
           number = Math.round(number * 1000) / 1000.0;
            String numberWithDecimal = "" + number;
            
           
            while(numberWithDecimal.substring(numberWithDecimal.indexOf('.') + 1).length() < 3 ){
               numberWithDecimal += "0";
           }
           numberWithDecimal += "%";

           return numberWithDecimal;
        }
}