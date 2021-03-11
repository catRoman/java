package gameObjects;


import java.util.Scanner;

import collections.LinkedQueue;
import exceptions.EmptyQueueException;
import moves.MeleeAttack;

/** combat class
 *  creates a match with a simgle winner
 */
public class Match {
    private Player playerOne;
    private Player playerTwo;
    private int round = 1;
    private boolean matchOver =false;
    
  
    /**
     * simple constructer with two players who will fight
     */
    public Match(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    /**
     * main match logic results in one winner of match 
     */
    public void fight(){
        while((playerOne.isAlive() && playerTwo.isAlive())
            || (!playerTwo.isAlive() && !playerOne.isAlive())){
            Util.clearScreen();
           

            if(playerOne.isAlive()){
                playerOne.setTurn(true);
                displayPlayers();
                displayStats();
                takeTurn(playerOne);
                Util.wait(4);
                Util.clearScreen();
            }else
                break;

            

            if(playerTwo.isAlive()){
                playerTwo.setTurn(true);
                displayPlayers();
                displayStats();
                takeTurn(playerTwo);
                Util.wait(4);
                Util.clearScreen();
            }else
                break;

            round++;
            
        }
        String winner = (playerOne.isAlive())? playerOne.getName() : playerTwo.getName();
        Util.clearScreen();
        matchOver = true;
        System.out.println((playerOne.isAlive())? AsciiArt.win() : AsciiArt.loss());
        displayStats();
    }

    /**
     * allows for user input of selected combination of moves
     */
    public void getCombo(Player player){
        Scanner input = new Scanner(System.in);
        boolean sure;
        Combo currentCombo;
        int usedStrikePoints;
        boolean cont = false;

        System.out.println();
        int i = 1;

        if(player.isComputer()){
            System.out.println("Thinking...");
            Util.wait(3);
            usedStrikePoints = 0;
            currentCombo = new Combo();
            while(usedStrikePoints < player.getStrikePoints()){
                currentCombo.addMove(MeleeAttack.availableAttacks.get(
                    ((int)(Math.random()* MeleeAttack.availableAttacks.size()))));  
                usedStrikePoints++;  
            }
            player.setCurrentCombo(currentCombo);

        }else{
            for(MeleeAttack e : MeleeAttack.availableAttacks){
                System.out.print("\t" + e.getName() + "(" + i++ + ")\n" );
                
            }

            do{
                
                usedStrikePoints = 0;
                currentCombo = new Combo();
            
                do{
                    sure = true;
                    System.out.println("\nEnter combo\n\tEnter move number and press Enter\n"
                                + "\tRepeat for each move, Enter 0 to finish: ");
                    
                    while(usedStrikePoints < player.getStrikePoints()){
                        System.out.print("Enter move: ");
                        String temp = input.nextLine(); 
                        if(temp.matches("0"))
                            break;
                        else if(temp.matches("[1-" + MeleeAttack.availableAttacks.size() + "]")){
                            currentCombo.addMove(MeleeAttack.availableAttacks.get(Integer.parseInt(temp) - 1));   
                            usedStrikePoints++;                         
                        }
                        else
                            System.out.println("Use only numbers of recognized moves..");
                    }
                    if(usedStrikePoints != player.getStrikePoints())
                        sure = Util.continueQuestion("You still have " 
                        + (player.getStrikePoints() - usedStrikePoints) 
                        + " left, are you sure you want to continue");
                }while(!sure);
                System.out.printf("\ncurrent combo: \n%s",currentCombo.toString());
                cont = Util.continueQuestion("\n\nWould you like to continue with this combo");
            }while(!cont);


            
            player.setCurrentCombo(currentCombo);
        }
    }

    /**
     * displays current stats of match
     */
    public void displayStats(){
        
        System.out.println(Util.printLine(Util.STD_WIDTH) + "\nROUND: " + round + "\t| " 
            + ((matchOver)? "!GAMEOVER!" : (playerOne.isTurn()? playerOne.getName() : playerTwo.getName())) 
            + "'s Turn <---");
        System.out.println(Util.printLine(Util.STD_WIDTH)  + "\n"
                + playerInfo(playerOne) + "\n"  
                + playerInfo(playerTwo) + "\n"
                + Util.printLine(Util.STD_WIDTH));
        
    }
    /**
     * player specific info
     * @returns formated String with players name, character type, weapon health and strikepoints 
     */
    public String playerInfo(Player player){
        return String.format("%-8s : The %s With The %s %s HEALTH: %s STRIKEPOINTS: %s\n", player.getName(), 
           player.getCharacterClassType(),player.getWeaponType(), Util.printLine(5), 
           (player.isAlive())? player.getHealth() : "!DEAD!", player.getStrikePoints());
    }
    /**
     * preforms players turn , takes in combo choice checks for bonus moves, and 
     * inflicts damage on opponent
     */
    public void takeTurn(Player player){
        Player opponent;

            if(player.equals(playerOne))
                opponent = playerTwo;
            else
                opponent = playerOne;
            

            
            System.out.println(player.getName() +"'s moves: " );
            
            
            getCombo(player);
           
            if(round != 1){
                if(Util.useChance(player.getPlayersCharacter().DOUBLE_STRIKE_CHANCE)){
                    try{
                        System.out.println("DOUBLE FIRST STRIKE!");
                        opponent.takeDamage(player.attack((MeleeAttack)player.getCurrentCombo().getDoubleFirstMove()));
                    }catch(EmptyQueueException ex){
                        ex.printStackTrace();
                    }
                }
              
            }
            while(player.getCurrentCombo().getNumberOfMoves() > 0){
                try{
                    opponent.takeDamage(player.attack((MeleeAttack)player.getCurrentCombo().useMove()));
                }catch(EmptyQueueException ex){
                    ex.printStackTrace();
                }
            }
            player.setTurn(false);
    }
    /**
     * displays a combined ascii art image based on individual players characters
     * and add a "vs" at the bottom
     */
    public void displayPlayers(){
        LinkedQueue<String> vsText = AsciiArt.vsText();
        System.out.println(Game.mergeImage(
            playerOne.getPlayersCharacter().getCharImage(), 
            playerTwo.getPlayersCharacter().getCharImage()).toString());
        System.out.println(Util.printLine(Util.STD_WIDTH));
        try{
            while(!vsText.isEmpty())
                System.out.printf("\t\t\t\t%s\n", vsText.dequeue());
        }catch (EmptyQueueException ex){
            ex.printStackTrace();
        }

    }

    
}
