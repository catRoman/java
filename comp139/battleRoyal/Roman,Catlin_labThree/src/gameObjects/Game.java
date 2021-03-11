package gameObjects;

import java.util.Scanner;

import characters.CharacterClass;
import collections.LinkedQueue;
import exceptions.EmptyQueueException;
import weapons.MeleeWeapon;
/** 
 * Static class with static game methods,
 * organized here either for ease of use
 * 
 */
public class Game {
   /**
    * private constructor prevents instantiating class
    */
    private Game() {}
/**
 * intro title sequence
 */
    public static void printTitleScreen(){

        String intro =  "\tWelcome  to Comp139 Lab three Battle  Royal!\n"
                    +   "\tThe game  is simple, pick your  player, pick\n"
                    +   "\tyour weapon and then  get ready to battle! \n"
                    +   "\t          -----------------------            \n"
                    +   "\tBefore each round of  play youll be asked to\n"
                    +   "\tenter your combo attack(LinkedQueue anyone?)\n"
                    +   "\tand based on the luck of the draw you may do\n"
                    +   "\tdamage! If your lucky enough you might get a\n"
                    +   "\tspecial FIRST STRIKE BONUS(LinkedQueue#first)\n"
                    +   "\twhere you get a double attack of your first move!\n"
                    +   "\tAnd if your interested in art, know that the above\n"
                    +   "\tArt was created by MERGING two individual pictures!\n"
                    +   "\tPick your combosFirst opponent to run out ofhealth \n"
                    +   "\tGood luck Player!\n"
                    +   "HINT: if your looking for a quick win pick the LISA";
        
        Util.printLine(Util.STD_WIDTH);
        System.out.println(AsciiArt.introTitle());
        Util.printLine(Util.STD_WIDTH);
        System.out.println();
        System.out.println(intro);
        Util.printLine(Util.STD_WIDTH);
      
    }
    /**
     * Gets user input after title screen, continue or quite
     */
    public static void getTitleInput(){
        System.out.println();
        if(!Util.continueQuestion("Would you like to play")){
            System.out.println("Had enough then eh... GoodBye");
            System.exit(0);
        }else
            System.out.println("Ohh boy here weee goooo!");  
    }

    /**
     * deisplays varies options and dialogue for player attribute selection
     * @return player with custom attributes based on selections
     */
    public static Player getPlayerSelection(){
        String name;
        int charChoice = -1;
        int weaponChoice = -1;
        Scanner input = new Scanner(System.in);
        
        //Pick name
        Util.printLine(Util.STD_WIDTH);
        System.out.print("What's your name contender? ");
        name = input.nextLine();
        System.out.println();
        System.out.println("Howdy " + name + "!");
        Util.wait(2);
        Util.clearScreen();
        
        //pick character
        System.out.println("Which character would you like to be " + name + "...");

        for(int i = 0; i < CharacterClass.availableCharacters.size(); i++){
            System.out.print("\t\t The " + CharacterClass.availableCharacters.get(i).getClass().getSimpleName() + " ("+(i+1)+")\n");
            }

        System.out.println();

        charChoice += Util.getSelection("Character", CharacterClass.availableCharacters.size());
        Util.wait(2);
        Util.clearScreen();
        System.out.println(CharacterClass.availableCharacters.get(charChoice).getCharImage());
        Util.printLine(Util.STD_WIDTH);
        System.out.println("You picked the " 
            + CharacterClass.availableCharacters.get(charChoice).getClass().getSimpleName() 
            + "!!!!" );
        Util.printLine(Util.STD_WIDTH);
        Util.printLine(Util.STD_WIDTH);
        
        //pick weapon
        System.out.println("Which weapon would you like to use " + name + "...");

        for(int i = 0; i < MeleeWeapon.availableWeapons.size(); i++){
        System.out.print("\t\t The " + MeleeWeapon.availableWeapons.get(i).getType() + " ("+(i+1)+")\n");
        }

        weaponChoice += Util.getSelection("Weapon", MeleeWeapon.availableWeapons.size());

        Player playerOne = new Player(name, 
                                    CharacterClass.availableCharacters.get(charChoice),
                                    MeleeWeapon.availableWeapons.get(weaponChoice),
                                    false);
        Util.wait(1);
        Util.clearScreen();
        Util.printLine(Util.STD_WIDTH);
        System.out.println("You Picked the " + MeleeWeapon.availableWeapons.get(weaponChoice).getType() + "!!!");
        Util.printLine(Util.STD_WIDTH);
        System.out.println();
    
        Util.printLine(Util.STD_WIDTH);

        return playerOne; 
    }
    /**
     * simulates a coin toss
     * @return player who won the toss
     */
    public static Player coinToss(Player playerOne){
        Player startingPlayer;

        System.out.println("Time for the toss....");
        Util.wait(1);
        if(Util.useChance(0.5f)){
            startingPlayer = playerOne;
            System.out.println("\tYou WON you got first go!");       
        }else{
            startingPlayer = new Player();
            System.out.println("\tYou LOST you got second go!");  
        }

        
        return startingPlayer;
    }

/**
 * merges two string linkedQueues, used to merge two asciia art linkedQueues
 * formats both images bottom to line up
 * @return linkedQueue<String> representing new image in queue 
 */
    public static LinkedQueue<String> mergeImage(LinkedQueue<String> queueA, LinkedQueue<String> queueB){
        LinkedQueue<String> newQueue = new LinkedQueue<>();
        
        int startingLine = Math.max(queueA.size(), queueB.size()) - Math.min(queueA.size(), queueB.size());
        
        try{
        if(queueA.size() == Math.max(queueA.size(), queueB.size())){
            for(int i = 0; i < startingLine; i++){
                newQueue.enqueue(queueA.dequeue());
            }
             while(!queueB.isEmpty()){
                 newQueue.enqueue(String.format("%s\t\t%s", queueA.dequeue(), queueB.dequeue()));
             }

        }else{
            for(int i = 0; i < startingLine; i++){
                newQueue.enqueue(queueB.dequeue());
            }
             while(!queueA.isEmpty()){
                newQueue.enqueue(String.format("%s\t\t%s", queueB.dequeue(), queueA.dequeue()));
             }
        }
        }catch(EmptyQueueException ex){
            ex.printStackTrace();
        }
        return newQueue;
    }
}
