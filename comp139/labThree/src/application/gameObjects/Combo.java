package application.gameObjects;
import exceptions.*;
import application.behaviors.WeaponBehavior;
import collections.LinkedQueue;

public class Combo {
   LinkedQueue<WeaponBehavior> currentCombo;
   LinkedQueue<WeaponBehavior> lastCombo;

   public Combo(){
      currentCombo = new LinkedQueue<>();             
   }
   public LinkedQueue<WeaponBehavior> getCurrentCombo() {
      return currentCombo;
   }
   public void setCurrentCombo(Player player) 
      throws StrikePointException{
         int strikeCount = player.getStrikePoints();
         while(strikeCount > 0){
            displayMoves(moveA, moveB, moveC);
            System.out.println("Enter Combo Moves: ")
         }   
   }
   public void displayMoves(String moveA, String moveB, String moveC){
      System.out.print("\t\t " + moveA + " (1)"
                       + "\n\t\t " + moveB + " (2)"
                       + "\n\t\t " + moveC + " (3)"
                       + "\n");
   }
}
