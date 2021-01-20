/* Will return cant get it to work logic is wrong */

public class Exercise6_11{
    public static void main(String[] args){
    
    System.out.printf("%-12s\t%12s\n", "Sales Amount", "Commission");
    for(int i = 0; i< 28; i++){
        System.out.print("-");
    }
    System.out.println();
    for(int i = 10000; i <= 100000; i +=5000){
        System.out.printf("%-12d%12.1f\n", i, computeCommission((double)i));
    }
    }

    public static double computeCommission(double salesAmount){  
    
       
        double commission1 = 0;
        double commission2 = 0;
        double commission3 = 0;

          //  for(int i = 1; i < salesAmount/1; i++){
            if(salesAmount > 10000){
                commission3 = (salesAmount - 10000) * 0.12;
            }
            if(salesAmount > 5000 && salesAmount <= 10000){
                commission2 = (salesAmount - 5000)* 0.10;
            }
            if(salesAmount > 0 && salesAmount <= 5000){
                commission1 = salesAmount * 0.08;
            }
            
            
         
   //     }
        double commission = commission1 + commission2 + commission3;
    commission = (int)(Math.round(commission * 100)) / 100.0;

    return commission;
    }    
    
}