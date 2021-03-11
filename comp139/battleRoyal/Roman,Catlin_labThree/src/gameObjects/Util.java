package gameObjects;

import java.util.Scanner;
/**
 * static Helper class
 */
public class Util {
    //used with printLine for easy change of game wide param
    public static final int STD_WIDTH =75;
    
    /**
     * private constructor ensures no instatniation of static class
     */
    private Util(){}

    /**
     * used in all chance equations
     * @param float chance percentage of hit
     * @return true if randomly selcted number is within chance param; false if not 
     */
    public static boolean useChance(float chance){
        return Math.random() <= chance ? true : false;
    }
     
      /**
       * clears terminal screen
       */
      public static void clearScreen(){
          for(int i = 0; i < 50; i++ )
              System.out.println();
      }
    
     /**
     * creates a string a dashed line length depending on param
     * @param int length of line
     * @return string of dashes
     */
    public static String printLine(int num){
        String line = "";
        for(int i = 0; i < num; i++)
            line += "-";
        return line;
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

   
    /**
     * used in game UI for picking various player attributes
     * @param String custom message for what is being selected
     * @param int total number of choices in list
     * @return int of item selected
     */
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
 /**
     * gets user input based on string passed of either yes or no and
     * returns true for yes or false for no 
     * @param String string with custom message telling player what they are
     * chossing yes or no for
     * @return true or false depending on whether player wishes
     * to continue 
     */
    public static boolean continueQuestion(String question){
        String answer = "";
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print( question +"?(y/n): ");
            answer = input.nextLine().toLowerCase();
            if(answer.matches("(y|n)"))   
                break;
            System.out.println("Enter either y or n...");
        }while(true);

        if(answer.equals("y"))
            return true;
        
         return false;
    }
    /**
     * Pauses program flow until enter is pressed
     */
    public static void pressEnterContinue(){
        Scanner input = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        input.nextLine();
    }

}
