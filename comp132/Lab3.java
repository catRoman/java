/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: September 30 2020
 * Program: Lab3-Conditional Logic
 */

 // import for Scanner input
 import java.util.Scanner;

 public class Lab3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
      
        //working variable for total won
        double winLoss = 0;

        //initial greeting and input prompt 
        System.out.println("How much would you like to wager?");
        System.out.print("Enter the dollar amount inserted into the slot machine: ");
        double wager = input.nextDouble();
        
        //three different random numbers between 1 and 4, as per instructed.
            int randomNumberOne = 1 + (int)(Math.random() * 4);
            int randomNumberTwo = 1 + (int)(Math.random() * 4);
            int randomNumberThree = 1 + (int)(Math.random() * 4);
            

       /** nested if statements with game logic
        * starts by ensuring max win is within the integer domain
        * as well as if a positive integer is used if not the program exits the game logic follows
        * and determines if all ramndom numbers are equal followed by if two out of three are
        * the the else sets the winLoss variable to zero signifying no win
        */
        if(wager * 3 < 2147483647){
            if (randomNumberOne == randomNumberTwo 
                && randomNumberTwo == randomNumberThree){
                winLoss = wager * 3;
            } else if ((randomNumberOne == randomNumberTwo && randomNumberOne != randomNumberThree)
                    || (randomNumberOne == randomNumberThree && randomNumberOne != randomNumberTwo)
                    || (randomNumberTwo == randomNumberOne && randomNumberTwo != randomNumberThree)
                    || (randomNumberTwo == randomNumberThree && randomNumberTwo != randomNumberOne)
                    || (randomNumberThree == randomNumberTwo && randomNumberThree != randomNumberOne)
                    || (randomNumberThree == randomNumberOne && randomNumberThree != randomNumberTwo)) {

                        winLoss = wager;
            } else {
                winLoss = 0;
            }
        } else if (wager < 0){
            System.out.println("Come on, ive never seen a negitive coin before...");
            System.exit(1); 

        }else {
            System.out.println("Ha yeah ok there, little too high for this machine...");
            System.exit(1);
        }

        // truncates any extra digits past the 1/100 from the wager 
        // multiplicatation assigned to winLoss
        winLoss = (int)(winLoss * 100)/100.0;
        
       // prints the results of the randomnumbers as symbols, i passed the 
       // randomNumbers through a function i created for simplicity
        System.out.println();
        System.out.println(" \t " + symbolFunction(randomNumberOne) + " \t " 
            + symbolFunction(randomNumberTwo) + " \t " + symbolFunction(randomNumberThree));
        System.out.println();

        // final if statement of winning, including dollar amount or generic lossing statement
        if (winLoss > 0){
            System.out.println("Congradulations, you won $ " + winLoss);
        } else{
            System.out.println("Sorry, you lost");
        }

    }

    // function returns string of symbol from a switch condition function after recieving 
    // the diffenet random numbers ranging from 1 to 4;
    public static String symbolFunction(int a){
        String symbol = "error";
        switch (a){
            case 1: symbol = "Apple"; break;
            case 2: symbol = "Orange"; break;
            case 3: symbol = "Cherry"; break;
            case 4: symbol = "Pinapple"; break;
        }
        return symbol;
    }
 }