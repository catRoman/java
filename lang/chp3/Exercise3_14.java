import java.util.Scanner;
 public class Exercise3_14{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("What do you geuss heads or tails \n"
                        + "( 0 for heads, 1 for tails): ");
    int geuss = input.nextInt();

    int randomPick = (int)(Math.random() + 0.5);

    if(geuss == randomPick){
        System.out.println("You a weinner HAHAHA");
    } else
    System.out.println("Me soo sorry you a loser!");
 }
}