import java.util.Scanner;

public class Exercise3_18{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of your package to be shipped: ");
        double weight = input.nextDouble();

        double price;
        if (weight < 50){
            if(weight <= 1){
                price = 3.5;
                System.out.println("The shipping cost is $" + price );
            } else if (weight > 1 && weight <= 3){
                 price = 5.5;
                 System.out.println("The shipping cost is $" + price );
            } else if (weight > 3 && weight <= 10){
                 price = 8.5;
                 System.out.println("The shipping cost is $" + price );
            } else if (weight > 10){
                 price = 10.5;
                 System.out.println("The shipping cost is $" + price );
            }       
        }
        else {
            System.out.println("the package cannot be shipped");
        }
    
        
    
    }
    
}