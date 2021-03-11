package application.gameObjects;

import application.util.Helper;

public class Battle {
    private int round = 1;
    private Player startingPlayer;
    private Player opponent;
    private Combo lastCombo;

    public Battle(Player startingPlayer, Player opponent){
        this.startingPlayer = startingPlayer;
        this.opponent = opponent;
    }
    public void match(){
        //while(startingPlayer.getHealth() > 0 | opponent.getHealth() > 0){ //game loop
            
            displayStats();
            Helper.wait(5);
        //}
    }
    public void displayStats(){
        Helper.printLine();
        System.out.print("ROUND: " + round);
        Helper.printLine();
        System.out.print(  ""
            + startingPlayer.getName() + " : The " + startingPlayer.getDefaultName()
            + " ------------------------ HEALTH: " + startingPlayer.getHealth()
            + " STRIKEPOINTS: " + startingPlayer.getStrikePoints());
        Helper.printLine();
        System.out.print(  ""
            + opponent.getName() + " : The " + startingPlayer.getDefaultName()
            + " ------------------------ HEALTH: " + opponent.getHealth()
            + " STRIKEPOINTS: " + opponent.getStrikePoints());
        Helper.printLine();
    }

    
}
