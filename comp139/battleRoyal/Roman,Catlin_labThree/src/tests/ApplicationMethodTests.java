package tests;


import gameObjects.*;
import characters.CharacterClass;
import characters.King;
import characters.Knight;
import characters.Lisa;
import characters.Queen;
import characters.Troll;
import collections.LinkedQueue;
import gameObjects.Game;
import moves.MeleeAttack;
import moves.Move;
import weapons.MeleeWeapon;
/**
 * various tests for in game methods
 */
public class ApplicationMethodTests {

  /*
  
    public static void main(String[] args){

      initGameObjects();
      
      LinkedQueue<Move> testA = new LinkedQueue<>();
          LinkedQueue<Move> testB = new LinkedQueue<>();
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testA.enqueue(new MeleeAttack("Quick Attack", 1.0f, 0.9f));
          testB.enqueue(new MeleeAttack("Lunge Attack", 1.5f, 0.8f));
          testB.enqueue(new MeleeAttack("Lunge Attack", 1.5f, 0.8f));
          testB.enqueue(new MeleeAttack("Lunge Attack", 1.5f, 0.8f));
          testB.enqueue(new MeleeAttack("Lunge Attack", 1.5f, 0.8f));
          testB.enqueue(new MeleeAttack("Lunge Attack", 1.5f, 0.8f));

        Combo mergedCombo = Combo.mergeComboQueue(testA, testB);

        System.out.println(mergedCombo.toString());
      chanceTest(0.5f);
      Util.pressEnterContinue();
      testWait(5);
      chanceTest(0.3f);
      boolean cont = Util.continueQuestion("continue");
      System.out.println("Continue? " + cont);
      cont = Util.continueQuestion("start a new game");
      testWait(2);
      System.out.println("start new game? " + cont);
      Game.printTitleScreen();
      testCharImageMerge();

    }
    public static void chanceTest(float chance){
        int heads = 0, tails = 0;
        for(int i = 0; i < 1000000; i++){
            if(Util.useChance(chance))
                    heads++;
                else
                    tails++;
        }
        System.out.println("Number of heads @"+ (chance*100) +"%: " + heads);
        System.out.println("Number of tails @"+ (100-chance*100) +"%: " + tails);
        System.out.println();
    }
    public static void testWait(int seconds){
        long startTime = System.currentTimeMillis();
        Util.wait(seconds);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " milli seconds");
    }
    public static void testCharImageMerge(){

        for(int i = 0; i < CharacterClass.availableCharacters.size(); i++){
            for(int j = 0; j < CharacterClass.availableCharacters.size(); j++){
              System.out.print(
                  Game.mergeImage(CharacterClass.availableCharacters.get(i).getCharImage(),
                                  CharacterClass.availableCharacters.get(j).getCharImage()).toString()
                  + "\n"); 
            
                }  
          }
        }
        public static void initGameObjects() {
          new King();
          new Troll();
          new Queen();
          new Knight();
          new Lisa();
    
          new MeleeWeapon("Sword", 10, 0.9f);
          new MeleeWeapon("Axe", 12, 0.8f);
    
          



          
          new MeleeAttack("Quick Attack", 1.0f, 0.9f);
          new MeleeAttack("Lunge Attack", 1.5f, 0.8f);
          new MeleeAttack("Special Attack", 5.0f, 0.1f);
    
      }

      */
}
