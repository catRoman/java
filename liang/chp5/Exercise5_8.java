import java.util.Scanner;

public class Exercise5_8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = "";
        String highScoreName = "";
        int highScore = 0;
        int score = 0;

        System.out.print("How many students are there: ");
        int numStudents = input.nextInt();
        input.nextLine();

        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter score: ");
            score = input.nextInt();
            input.nextLine();
            
            if(score > highScore){
                highScoreName = name;
                highScore = score;
            }
        }

        System.out.println();
        System.out.println("The winner is " + highScoreName + " with a total score of " + highScore + "!");
    }
}
