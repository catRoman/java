import java.util.Scanner;

public class Exercise5_34 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int computerChoice = -1;
        String winLossTie;
        int playersWinCount = 0;
        int compWinCount = 0;
        int playersChoice = -1;
        int round = 0;
        boolean nextRound = true;
        String winner = "";
        do{
            round++;
        System.out.print("Round " + round  + ": scissor (0), rock (1), paper (2): ");
        
        playersChoice = input.nextInt();
        computerChoice = (int)(Math.random() * 3);
       
        if(playersChoice == computerChoice){
            winLossTie = "you Tied, sucker!";
        } else if (playersChoice == computerChoice + 1 || (playersChoice == 0 && computerChoice == 2)) {
            winLossTie = "you did it you son of a bitch you did it!";
            playersWinCount++;
        } else {
            winLossTie = "you lost dumDum";
            compWinCount++;
        }
     
        System.out.println("Round " + round + ": Well you chose " + choiceFunction(playersChoice) + " and the computer chose " + choiceFunction(computerChoice)
                        + "\nwhich means of course " + winLossTie);
        System.out.println("Players Score: " + playersWinCount + "\tComputers Score: " + compWinCount);
        System.out.println();
        if(playersWinCount == compWinCount + 2 ){
            nextRound = false;
            winner = "Player!";
    }else if(compWinCount == playersWinCount + 2){
            nextRound = false;
            winner = "Computer!";
        }
    }while(nextRound);

    System.out.println();
    System.out.println("Congradulations to the winner Mr." + winner);
    System.out.println();
} 


       public static String choiceFunction(int a){
       String b = "test";
        switch(a){
            case 0: b = "Scissors"; break;
            case 1: b = "Rock"; break;
            case 2: b = "Paper"; break;
            default: b = "You screwed up bud";   
        }
        return b;
    }
}

