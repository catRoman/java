package application;

import application.behaviors.weapons.MeleeWeapon;
import application.characters.CharacterClass;
import application.gameObjects.Battle;
import application.gameObjects.Player;
import application.util.AsciiArt;
import application.util.Helper;
import java.util.Scanner;

public class LabThreeApp {
    public static void main(String[] args){
    Player playerOne;
    Player startingPlayer;
    Battle battle;
    boolean newGame;

    do{
        printTitleScreen();
        getTitleInput();
        Helper.wait(2);
        Helper.clearScreen();
        playerOne = getPlayerSelection();
        Helper.wait(2);
        startingPlayer = coinToss(playerOne);
        Helper.printLine();
        Helper.wait(4);
        Helper.clearScreen();
        if(startingPlayer.equals(playerOne))
            battle = new Battle(startingPlayer, new Player(true));
        else
            battle = new Battle(startingPlayer, playerOne);
        battle.match();
        newGame = Helper.continueCustom("play a new Game");
         
    }while(newGame);    
    }
    /**
     * Displays the game title and intro message/game premise
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
                    +   "\tspecial MERGE combo where your combo is merged\n"
                    +   "\twith your opponents! First opponent to run out of\n"
                    +   "\thealth loses! Good luck Player!\n";
        
        Helper.printLine();
        System.out.println(AsciiArt.introTitle());
        Helper.printLine();
        System.out.println();
        System.out.println(intro);
        Helper.printLine();
      
    }
    
    /**
     * Gets user input after title screen, continue or quite
     */
    public static void getTitleInput(){
        System.out.println();
        if(!Helper.continueCustom("play")){
            System.out.println("Had enough then eh... GoodBye");
            System.exit(0);
        }else
            System.out.println("Ohh boy here weee goooo!");  
    }
    public static Player getPlayerSelection(){
        String name;
        int charChoice;
        int weaponChoice;
        Scanner input = new Scanner(System.in);
        
        //Pick name
        Helper.printLine();
        System.out.print("What your name contender? ");
        name = input.nextLine();
        System.out.println();
        System.out.println("Howdy " + name + "!");
        Helper.wait(2);
        Helper.clearScreen();
        //pick character
        System.out.println("Which character would you like to be " + name + "...");
        System.out.print("\t\t The King (1)\n\t\t Knight (2)\n\t\t Queen (3)\n\t\t The Troll (4)\n");
        System.out.println();
        charChoice = Helper.getSelection("Character", 4);
        Helper.wait(2);
        Helper.clearScreen();
        System.out.println(CharacterClass.getCharacterChoice(charChoice).getImage());
        Helper.printLine();
        System.out.println("You picked the " 
            + CharacterClass.getCharacterChoice(charChoice).getClass().getSimpleName() 
            + "!!!!" );
        Helper.printLine();
        System.out.println(CharacterClass.getCharacterChoice(charChoice).toString());
        Helper.printLine();
        //pick weapon
        System.out.println("Which weapon would you like to use " + name + "...");

        for(int i = 1; i <= MeleeWeapon.weaponsAvailable.size(); i++){
        System.out.print("\t\t The " + MeleeWeapon.getWeaponChoice(i).getWeaponType() + " ("+i+")\n");
        }

        weaponChoice = Helper.getSelection("Weapon", MeleeWeapon.weaponsAvailable.size());

        Player playerOne = new Player(name, 
                                    CharacterClass.getCharacterChoice(charChoice),
                                    MeleeWeapon.getWeaponChoice(weaponChoice),
                                    false);
        Helper.wait(1);
        Helper.clearScreen();
        Helper.printLine();
        System.out.println("You Picked the " + playerOne.getWeapon().getWeaponType() + "!!!");
        Helper.printLine();
        System.out.println();
        /*
        System.out.println("The " + playerOne.getWeapon().getWeaponName() + ": ");
        playerOne.getWeapon().quickAttack();
        System.out.println(playerOne.getWeapon().toString());
        playerOne.getWeapon().lungAttack();
        System.out.println(playerOne.getWeapon().toString());
        playerOne.getWeapon().specialAttack();
        System.out.println(playerOne.getWeapon().toString());
*/
        Helper.printLine();

        return playerOne; 
    }
    public static Player coinToss(Player playerOne){
        Player startingPlayer;

        System.out.println("Time for the toss....");
        Helper.wait(1);
        if(Helper.getRandomChance(0.5f)){
            startingPlayer = playerOne;
            System.out.println("\tYou WON you got first go!");       
        }else{
            startingPlayer = new Player(true);
            System.out.println("\tYou LOST you got second go!");  
        }

        
        return startingPlayer;
    }
    
}
