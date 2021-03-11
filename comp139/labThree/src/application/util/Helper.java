package application.util;

import java.util.Scanner;

public class Helper {
    /**private constructor for static method class */
    private Helper(){}
    /**
     * clears terminal screen
     */
    public static void clearScreen(){
        for(int i = 0; i < 50; i++ )
            System.out.println();
    }

    /**
     * used for determining whether there is a hit or miss of a specific 
     * question via given chance
     * @param float percent(in decimal) representing chance of a hit
     * @returns true if there is a hit or false if a miss depending on 
     * givin chance
     */
    public static boolean getRandomChance(float chance){
        return Math.random() <= chance ? true : false;
    }

    /**
     * Pauses program flow until enter is pressed
     */
    public static void pressEnterContinue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        input.nextLine();
    }
    /**
     * gets user input based on string passed of either yes or no and
     * returns true for yes or false for no 
     * @param String string with custom message telling player what they are
     * chossing yes or no for
     * @return true or false depending on whether player wishes
     * to continue 
     */
    public static boolean continueCustom(String contWhat){
        String answer = "";
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Would you like to "+ contWhat +"?(yes/no): ");
            answer = input.nextLine().toLowerCase();
            if(answer.matches("(yes|no)"))   
                break;
            System.out.println("Enter either yes or no...");
        }while(true);

        if(answer.equals("yes"))
            return true;
        
         return false;
    }
    

    /**
     * prints a dashed line 75 character long to terminal
     */
    public static void printLine(){
        for(int i = 0; i < 60; i++)
            System.out.print("-");
        System.out.println();
    }
    /**
     * pauses thread for given time to help with game pacing 
     * @param int number of seconds to pause thread
     * @throws IllegalArgumentException if negative time is input
     * @throws InterruptedException if another Thread attempt to interrupt while sleeping 
     */
    /* just touching threads here and there trust me im far from total understanding
        concurrency in anyuseful way, but when i do ohh boy*/
    public static void wait(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch(IllegalArgumentException ex){
            System.out.println(ex);
            System.out.println("This isnt a time machine... no negative param");
        }catch(InterruptedException ex){
            ex.getStackTrace();
        }
    }

public static int getSelection(String type, int finalChoice){
    Scanner input = new Scanner(System.in);
    String temp = "";
    do{
        System.out.print("Pick a " + type + "(1 - " + finalChoice + "): ");
        temp = input.nextLine();
        if(temp.matches("[1-" + finalChoice + "]"))   
            break;
        System.out.println("You need to pick a number between 1 and " + finalChoice + "...");
    }while(true);
    
    return Integer.parseInt(temp);
}

}
