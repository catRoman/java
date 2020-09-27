/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: September 23 2020
 * Program: Lab2-Variables and Operators
 */

 // import to allow input
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args){
            // Declaring new scanner object input
            Scanner input = new Scanner(System.in);

            final double PST = 0.05;    //PST constant
            final double GST = 0.07;    //GST constant

            System.out.print("Enter the price of the purchased item in dollars and cents ($ **.**):  $");
            double priceOfItem = input.nextDouble();    //input of priceOfItem variable

            System.out.print("Enter the amount of money the cashier receives in dollars and cents ($ **.**):  $");
            double moneyCashierReceives = input.nextDouble();   //input of moneyRecievedVariable

            /** Both the sales taxes are indivdualy multiplied by the price of the item then rounded to the nearest cent.
             *  i acheived this by mutliplying the amount of the tax by 100 and adding 0.5, this way if the number was
             *  1083.6 it would equal 1084.1 and once cast to an integer the ramaing decimal would be truncated leaving
             *  only 1084. in order to return back to the proper format for dollars and cents i divided the result by 100.0
             *  automatically converting the number back into double 
             */
            double itemsProvincalTax = (int)((priceOfItem * PST * 100) + 0.5)/100.0; 
            double itemsFederalTax = (int)((priceOfItem * GST * 100) + 0.5)/100.0;
            
            // simple arithmetic for the priceAfterTax, i did not round instead chose to truncate the remaining 1/1000th fraction
            double priceAfterTax = priceOfItem + itemsProvincalTax + itemsFederalTax;
            priceAfterTax = (int)((priceAfterTax * 100))/100.0;

            /** changeReceived is a working variable i cast the difference into an integear, multiplied by 100 and then used the 
             * modulus to find the remainder of each different denomination through iteration by the number of cents in it
             * changeDue is a double variable made before the modulus deduction to allow to to print the amount with the
             * decimal in the console output
             * 
             */
            int changeReceived = (int)((moneyCashierReceives - priceAfterTax) * 100);
            double changeDue = changeReceived/100.0;

            int numberOfFiveDollarBills = changeReceived / 500;
            changeReceived = changeReceived % 500;
            
            int numberOfOneDollars = changeReceived/ 100;
            changeReceived = changeReceived % 100;
            
            int numberOfQuarters = changeReceived / 25;
            changeReceived = changeReceived % 25;
    
            int numberOfDimes = changeReceived / 10;
            changeReceived = changeReceived % 10;
    
            int numberOfNickels = changeReceived / 5;
            changeReceived = changeReceived % 5;
    
            int numberOfPennies = changeReceived;
        

        // Summerizing the information and calculations to the console

        System.out.println();
        System.out.println("The items price is $" + priceOfItem);
        System.out.println("A provincial sales tax of " + (int)(PST * 100) + "% was added to your original amount\n"
                        +  "as well as a federal sales tax of " + (int)(GST * 100) + "%.");
        System.out.println("Your total PST is $" + itemsProvincalTax);
        System.out.println("Your total GST is $" + itemsFederalTax);
        System.out.println("Your total price after tax $" + priceAfterTax + " consists of");
        System.out.println();
        System.out.println("After recieving the amount of $" + moneyCashierReceives + " your change due is $"
                        + changeDue + "\nand presented to you in the following denominations:" );
        System.out.println();
        System.out.println("\t" + numberOfFiveDollarBills + " Five dollar bills ");
        System.out.println("\t" + numberOfOneDollars + " dollars ");
        System.out.println("\t" + numberOfQuarters + " quarters ");
        System.out.println("\t" + numberOfDimes + " dimes");
        System.out.println("\t"+ numberOfNickels + " nickels");
        System.out.println("\t" + numberOfPennies + " pennies");
        
    }
}