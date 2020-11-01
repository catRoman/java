/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: October 19 2020
 * Program: Lab4-Repition Logic
 * 
 * This program is a continuation from our previous lab three; it is a simple
 * gambling game which allows the user to enter a wager and after a random
 * selection of 3 out of 5 fruits symbols determines whether the user is a winner
 * or a loser based on preset logic(the logic dictates win/tie/loss). In addition
 * to lab three's requirments this program implements loops ands counts to keep track
 * of the total amount wagered and total losses in order to determine an end-game senerio
 * based on the outcome. The end game senerio displays either a inverveted pyrimid of
 * smiley faces or a pyramid of frowns based on the users money tally, whether 
 * they are in surplus of $50.00 dollars or in deficiet of $50.00 dollars.
 * The program allows for wager change in each iteration as well as displays the current
 * money won/loss to help deterime their input.
 * 
 * Good luck....
 */

 // import for Scanner input
 import java.util.Scanner;



 public class Lab4 {

    public static void main(String[] args){

        // scanner class for input
        Scanner input = new Scanner(System.in); 
      
         // intiialize variables
         double previousWager = 0;
         double wager = 0;
         String winLoss = "Have Fun!";
         String regEx = "yesno0";
         String playAgain;
         
         int randomNumberOne = 0;
         int randomNumberTwo = 0;
         int randomNumberThree = 0;
         double wagerTotal = 0;
         double winAmount= 0;
         double winTotal = 0;
         boolean winner = true;
         boolean error = false;
         boolean playing = false;
         boolean badWager = true;
         
         
        

       
        
        //clear command line of any previous keystrokes
        clearScreen();

        //initial welcome prompt
        System.out.print("\t|------------------------------------------------|\n"
                        +"\t|                                                |\n"
                        +"\t|         Comp-132's Gamblo-Matic Machine        |\n"
                        +"\t|                                                |\n"
                        +"\t|------------------------------------------------|\n"
                        +"\t|  Don't be shy...enter a wager...The rules are  |\n"
                        +"\t| are simple, 3 out of 3 Symbols gets you 3 times|\n"
                        +"\t|  the wager, 2 out of 3 well thats even money,  |\n"
                        +"\t|      1 out of 3 loses your wager-- no prize!   |\n"
                        +"\t|                                                |\n"
                        +"\t| To win you need to have won a total of $50.00  |\n"
                        +"\t|         To lose.. a total loss of $50.00       |\n"
                        +"\t|                                                |\n"
                        +"\t|           To exit at any point enter 0         |\n"
                        +"\t|                                                |\n"
                        +"\t|                Good Luck Player!               |\n"
                        +"\t|------------------------------------------------|\n\n");
        
        //begining of game loop, loops after chosing a new game after win/loss or to continue if
        // bankroll reaches zero
        do{
        // input initial bankroll
        System.out.print("How much money are you bringing to the game?: ");
        double bankRoll = input.nextDouble();
        
        // check for exit input 0
        checkInputForExit(bankRoll);
        
        // clear command screen
        clearScreen();

        //displays the main game screen including title and game info
        displayFunction(previousWager, winLoss, winAmount, bankRoll);

       
      
        //game loop for wagers after each input
        do{
            //three different random numbers between 1 and 4, as per instructed.
            randomNumberOne = randomNumber();
            randomNumberTwo = randomNumber();
            randomNumberThree = randomNumber();

            //loop determines if amount requested to wager is within bankroll
            do{
            System.out.print("Enter a wager: ");
            
            wager = input.nextDouble();
            checkInputForExit(wager);
            if(bankRoll - wager < 0){
                System.out.println("\nYour dont have enough money for that wager, try again...");
            }else{
                badWager = false;
            }
        }while(badWager);
        badWager = true; // resets to allow loop for next iteration of game loop

            // sends wager to method to determine amount won/loss, adjust bankRoll tally and assigns 
            // previous wager for game screen
            winAmount = gameLogic(wager, randomNumberOne, randomNumberTwo, randomNumberThree);
            bankRoll -= wager;
            
            bankRoll += gameLogic(wager, randomNumberOne, randomNumberTwo, randomNumberThree);
            previousWager = wager;

            // determines display message in title 
            if(winAmount == 0)
                winLoss = " You Lose ";
            else if (winAmount == wager)
                winLoss = "Even Money";
            else 
                winLoss = " You  Win! ";

            // clears command line and reprints game title with new information based on previous wager
            // along with reels to show last spin
            clearScreen();
            displayFunction(previousWager, winLoss, winAmount, bankRoll);
            displayReelsFunction(symbolFunction(randomNumberOne),
                                symbolFunction(randomNumberTwo),
                                symbolFunction(randomNumberThree),
                                gameLogic(wager, randomNumberOne, randomNumberTwo, randomNumberThree),
                                wager);
            
            //adds to running totals
            wagerTotal += wager;
            winTotal += winAmount;

          
            // determines if this iteration amounts to an endgame  
            if(winTotal - wagerTotal >= 50){
                endGameDisplay(true);
            }else if(winTotal - wagerTotal <= -50){
                endGameDisplay(false);
            }

        // terminates wager loop if either the bankroll drops below or the is a loss of 50 total
        //or a win of 50 total 
        }while(bankRoll > 0 ^ Math.abs(winTotal - wagerTotal) >= 50);

        //if endgame hasnt been achieved but bankroll reaches zero, ask add to bank roll
        if(bankRoll <= 0){
            System.out.println("\nYou ran out of money :(");
            System.out.println();
            System.out.print("\nWould you like to add to your bankroll? (yes/no): ");
            
            // loop for input of yes/no or 0
            do{
            playAgain = input.next(); //inputs string
            playAgain = playAgain.toLowerCase();    //converts to lower case
            //compares the string inputed to a preset string containg keywords,
            //if the word is included it continue to check which part of the string for
            //the yes or no section
            if(regEx.indexOf(playAgain) > -1){  
                if(regEx.substring(0,2).indexOf(playAgain) > -1){   //if yes
                    playing = true;     //main game loop set to true
                    //(yes/no) set to false as to leave the loop because an understood input was found
                    error = false;      
                    System.out.println();
                }else if(regEx.substring(3).indexOf(playAgain) > -1){   //if no
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.exit(1);     // exits the program
                }
            }else
                error = true;   // if input did not if neither yes/no 0 it loops until inpout matches
            }while(error);

        continue; //continues out of loop skipping the remaing code moving back to the beginning of the main game loop
        }  

        do{     //similiar loop as previous, this is reached when end game senerio is reached
        System.out.print("\nWould you like to play another game?(yes/no): ");
        playAgain = input.next();
        playAgain = playAgain.toLowerCase();
        if(regEx.indexOf(playAgain) > -1){
           if(regEx.substring(0,2).indexOf(playAgain) > -1){    // if yes
                playing = true;
                error = false;
                // since this will be a new game compared to just running out of money
                // both the counts will be reset
                winTotal = 0;       
                wagerTotal = 0;
           }else if(regEx.substring(3).indexOf(playAgain) > -1){    // if no
               System.out.println();
               System.out.println("Thanks for playing!");
               System.exit(1);
           }
        }else
            error = true;   //if input error
        }while(error);

    }while(playing);    // end of main game loop

    } // end of main method
    
    // Methods...

/* 
* game logic method inputs from game the wager and three random numbers
* starts by ensuring max win is within the integer domain
* as well as if a positive integer is used if not the program exits the game logic follows
* and determines if all ramndom numbers are equal followed by if two out of three are
* the the else sets the winLoss variable to zero signifying no win
*
* returns the amount won rounded as a double
*/
public static double gameLogic(double wager, int randomNumberOne, int randomNumberTwo, int randomNumberThree){
        
    double winAmount = 0;
        
            
        if(wager * 3 < 2147483647){
            if (randomNumberOne == randomNumberTwo 
                && randomNumberTwo == randomNumberThree){
                winAmount = wager * 3;
            } else if ((randomNumberOne == randomNumberTwo && randomNumberOne != randomNumberThree)
                    || (randomNumberOne == randomNumberThree && randomNumberOne != randomNumberTwo)
                    || (randomNumberTwo == randomNumberOne && randomNumberTwo != randomNumberThree)
                    || (randomNumberTwo == randomNumberThree && randomNumberTwo != randomNumberOne)
                    || (randomNumberThree == randomNumberTwo && randomNumberThree != randomNumberOne)
                    || (randomNumberThree == randomNumberOne && randomNumberThree != randomNumberTwo)) {

                        winAmount = wager;
            } else {
                winAmount = 0;
            }

        }else {
            System.out.println("Ha yeah ok there, little too high for this machine...");
            System.exit(1); //exits program
        }

        // truncates any extra digits past the 1/100 from the wager 
        // multiplicatation assigned to winLoss
        return (int)(winAmount * 100)/100.0;
    }


    // function returns string of symbol from a switch condition function after recieving 
    // unicode symbols included in strings matching words
    // the diffenet random numbers ranging from 1 to 4;
    public static String symbolFunction(int a){
        String symbol = "error";
        switch (a){
            case 1: symbol = "\uD83C\uDF4E Apple"; break;
            case 2: symbol = "\u263E Moon"; break;
            case 3: symbol = "\uD83E\uDD5D Kiwi"; break;
            case 4: symbol =  "\uD83C\uDF4D Pinapple"; break;
            case 5: symbol = "\uD83C\uDF1F Star"; break;
        }
        return symbol;
    }

    /* void method displaying main game title

    */
    public static void displayTitle(){
        System.out.print("\t|------------------------------------------------|\n"
                        +"\t|                                                |\n"
                        +"\t|         Comp-132's Gamblo-Matic Machine        |\n"
                        +"\t|                                                |\n"
                        +"\t|------------------------------------------------|\n\n");
    }

    /* void method displays game title and game information
    *  takes in values from main game method and originizes their display
    */
    public static void displayFunction(double previousWager, String winLoss,double winLossAmount, double bankRoll){
        displayTitle();
       System.out.printf("Last Wager: $%-18.2f%3s\t\tBankroll: $%2.2f\n\n", previousWager, winLoss, bankRoll);
       
    }

    /* void method displays the slot reels takes in wager and and winamount to determine which 
    *  prompt to display and takes in three string to display formated to be within the border
    *  of the game window
    */
    public static void displayReelsFunction(String reelOne, String reelTwo, String reelThree, double winAmount, double wager){
        String winLoss = "";

        if (winAmount > wager){
            winLoss = String.format("Congradulations, you won $ %1.2f", winAmount);
        } else if ( winAmount == 0){
            winLoss = String.format("Sorry, you lost $ %1.2f", wager);
        } else{
            winLoss = String.format("You got your wager of $%1.2f back.", wager);
        }
        
        System.out.println("\t|================================================|");
        System.out.printf("\t| %-13s|| %-15s|| %-13s|\n", reelOne, reelTwo,reelThree);
        System.out.print("\t|================================================|\n");
      System.out.printf("\t| %-46s |\n", winLoss);
       System.out.println("\t|================================================|\n");
    }

    // void method checks that the value of an input is zero, if so the game exits with a prompt
public static void checkInputForExit(double input){
    if(input == 0){
        System.out.println("\nThanks for playing!");
        System.exit(1);
    }
}

// random number method returns and integer between 1 and 5
    public static int randomNumber(){

        return 1 + (int)(Math.random() * 5);
       
        
    }

// void method mimics clearing the command line by printing 50 new blank lines
    public static void clearScreen(){
        for(int i = 0; i < 50; i++){
            System.out.println();
        }
    }

// void method displays either end game result based on boolean input
    public static void endGameDisplay(boolean winner){
        String tabs = "                      "; // used for formating to game screen
        String spacing = "      ";  // used for formating to game screen
        clearScreen();  // clear screen and displays plain title
        displayTitle(); 

        
        if(winner){ // if won a total of 50 or more
            
            System.out.println(tabs + spacing + "  GAME  OVER\n");
            for(int i = 0; i < 4; i++){ // creates 4 rows
                System.out.print(tabs + spacing);   // each row gets centered with the game title
                for(int k = 0; k < i; k++){ // displays whitespaces to create pyramid look
                   
                    System.out.print("  ");
                
                }for(int j = i; j < 4;j++){ // displays faces with decreasing number of columns per line
                    System.out.print("\uD83D\uDE00  "); // displays smiley face
                }
                System.out.println();
            }
            System.out.println("\n" + tabs + "You Won more than $50.00!");
        }else{  // if lost a total of 50 or more
    
            System.out.println(tabs + spacing + "  GAME  OVER\n");
            for(int i = 0; i < 4; i++){ // creates 4 rows
                System.out.print(tabs + spacing);   // each rows gets centered with the game title
                for(int k = 3; k > i; k--){ // creates whites spaces to create pyrimid look
                    System.out.print("  ");
                }for(int j = 0; j <= i;j++){    // displays faces with increasing number of columns per line
                    System.out.print("\uD83D\uDE41  "); //displays frowny face
                }
                System.out.println();
            }
            System.out.println("\n" + tabs + "You Lost more than $50.00!\n");
            
        }
    }
   
 } // end of class