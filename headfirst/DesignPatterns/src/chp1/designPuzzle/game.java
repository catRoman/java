package chp1.designPuzzle;

import chp1.designPuzzle.characters.*;
public class game {
    public static void main(String[] args){
        CharacterClass[] roster = {new King(1000),
                                new Knight(750),
                                new Queen(1000),
                                new Troll(750) };

        CharacterClass fighterOne = roster[(int)(Math.random() * roster.length)];
        CharacterClass fighterTwo = roster[(int)(Math.random() * roster.length)];

        fighterOne.fight();
        fighterTwo.fight();
        System.out.println();
        
        int block = 1;
        int round = 1;

        while(fighterOne.getHealth() > 0 && fighterTwo.getHealth() > 0){
            int player1roll =  (int)(Math.random()*3);
            int player2roll =  (int)(Math.random()*3);
            System.out.println("Round " + round++);
            System.out.println("\t" + fighterOne.getClass().getSimpleName() + " Health: " + fighterOne.getHealth());
            System.out.println("\t" + fighterTwo.getClass().getSimpleName() + " Health: " + fighterTwo.getHealth());
            if(block == player1roll)
                System.out.println(fighterOne.getClass().getSimpleName() + " blocked!");
            else
                fighterOne.setHealth(fighterOne.getHealth() - fighterTwo.getWeapon().useWeapon());

            if(block ==player2roll) 
                System.out.println(fighterTwo.getClass().getSimpleName() + " blocked!");
            else
                fighterTwo.setHealth(fighterTwo.getHealth() - fighterOne.getWeapon().useWeapon());
            System.out.println();
            }
       String winner = ""; 

        if(fighterOne.getHealth() > 0)
            winner = fighterOne.getClass().getSimpleName();
        else
            winner =  fighterTwo.getClass().getSimpleName(); 
        
      System.out.println("The winner is " + winner);
    }    
}
