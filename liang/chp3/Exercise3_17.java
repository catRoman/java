import java.util.Scanner;

public class Exercise3_17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int computerChoice = (int)(Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        
        int playersChoice = input.nextInt();
        
        String winLossTie;

        if(playersChoice == computerChoice){
            winLossTie = "you Tied, sucker!";
        } else if (playersChoice == computerChoice + 1 || (playersChoice == 0 && computerChoice == 2)) {
            winLossTie = "you did it you son of a bitch you did it!";
        } else {
            winLossTie = "you lost dumDum";
        }
     
        System.out.println("Well you chose " + choiceFunction(playersChoice) + " and the computer chose " + choiceFunction(computerChoice)
                        + " which means of course " + winLossTie);
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

