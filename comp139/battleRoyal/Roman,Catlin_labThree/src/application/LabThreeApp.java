package application;
import characters.CharacterClass;
import characters.King;
import characters.Knight;
import characters.Lisa;
import characters.Queen;
import characters.Troll;
import gameObjects.Game;
import gameObjects.Match;
import gameObjects.Player;
import gameObjects.Util;
import moves.MeleeAttack;
import weapons.MeleeWeapon;

/**
 * Comp 139 lab Three - linkedQueue application
 * 
 * A simple battle game where you pick a character and a weapon
 * -Each character has a strength and a specific chance value for first strike bonus
 * -each weapon has a specific damage and hit chance value
 * You then pick a combination of moves based on available strikepoints
 * Each round checks whether the play gets a double first stike based
 * on the players characters first strike bonus, if activated an extra first move is
 * preformed ahead of your combo
 * -each move has a damage multiplier and hitchance multiplier
 * 
 * Overall damage is determined with the following equation:
 * Total Damage = Character strength * (weapons damage * damage multiplier)
 * Overall hitChance is determined with the following equation:
 * Total hitChance = (weapon hitChance * move hitChance multiplier)
 * 
 * The amount of strikpoints determines how many moves go into you combo Queue
 * for every attack that hits an additional strikepoint is added for the next turn
 * if a miss occurs your strikpoints are reset to 1.
 * 
 * Lab Specifics: 
 * -combo class wrapps the linkedQueue class and utilizes its functions
 * for adding removing moves to the players combo
 * -first strike bonus utilizes the linkedList#first to use he players first move
 * of the combination twice before removing it from the queue
 * -the rounds ascii Art utilizes a specific merge method.
 * -the combo class has a mergeComboQueue method that is only tested not
 * utilized in the game
 * 
 * @author Cat Roman 01/03/2021
 */
public class LabThreeApp {
    /**
     * main game driver
     */
    public static void main(String[] args) throws Exception {


        Player playerOne;
        Match battle;
        boolean newGame;
        initGameObjects();
       
        //art display
        System.out.print(
              Game.mergeImage(
                  CharacterClass.availableCharacters.get(
                      (int)(Math.random() * CharacterClass.availableCharacters.size())).getCharImage(),
                  CharacterClass.availableCharacters.get(
                      (int)(Math.random() * CharacterClass.availableCharacters.size())).getCharImage()
                      ).toString()
              ); 
        System.out.println();
        
        //main game loop
        do{
            Game.printTitleScreen();
            Game.getTitleInput();
            Util.wait(2);
            Util.clearScreen();
            playerOne = Game.getPlayerSelection();
            Util.wait(2);
            Util.clearScreen();
            battle = new Match(playerOne, new Player());
            battle.fight();
            newGame = Util.continueQuestion("Would you like to play a new Game");
             
        }while(newGame);    
        }
    /**
     * Initializes game objects, used to allow static arrayLists to contain all
     * available options for in game lists and random computer player
     * attribute selection. 
     * 
     * To add new character to game create new class extending CharacterClass
     * and instantiate here
     * 
     * To create new MeleeAttack or MeleeWeapon in game instantiate in this method 
     */
    public static void initGameObjects() {
        new King();
        new Troll();
        new Queen();
        new Knight();
        new Lisa(); // made for my gf- has higher stats then rest, still available to
                    //computer for selection though so watch out lol 

        new MeleeWeapon("Sword", 10, 0.9f);
        new MeleeWeapon("Axe", 12, 0.8f);

        
        new MeleeAttack("Quick Attack", 1.0f, 0.9f);
        new MeleeAttack("Lunge Attack", 1.5f, 0.8f);
        new MeleeAttack("Special Attack", 5.0f, 0.1f);

    }
  
}
