import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercise5_1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int value = 0;
        int negCount = 0;
        int posCount = 0;
        double total = 0;
        
        do{
            System.out.print("Enter an integer: ");
            value = input.nextInt();
            if(value < 0)
                negCount++;
            else if (value > 0)
                posCount++;

            total += value;
           } while(value != 0);

           if(value !=0){
           int totalCount = negCount + posCount;
           double avgTotal = total / totalCount;
           System.out.println("The number of positives is " + posCount);
           System.out.println("The number of negatives is " + negCount);
           System.out.println("The total is " + total );
           System.out.printf("The average is %1.2f\n", avgTotal);
           }else 
            System.out.println("No numbers are entered except 0");
    }
}