public class Exercise5_7{
    public static void main(String[] args){
        double tuition = 10000;
        double increase = 0.05;
        int year = 0;
        double totalCost = 0;
        System.out.println();
        System.out.printf("year\ttuition\t\t\ttotalcost for 4 years after ten year price\n\n");
        double tuition10 = 0;
        for(int i = 1; i <= 14; i++){
            tuition = tuition + (tuition * increase);
            
            System.out.printf("%d\t%1.2f",i,tuition);
            if(i >= 11)
            totalCost += tuition;   

             System.out.printf("\t\t%1.2f\n", totalCost);
            
             if(i == 10){
               tuition10 = tuition;
               year = 10;
             }
             
        }

        System.out.println();
        System.out.printf("The tuition after %d years will be %1.2f\n"
                    +   "And the total cost after 4 years will be %1.2f\n",year,tuition10,totalCost);
    }
}