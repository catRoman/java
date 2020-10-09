import java.util.Scanner;

public class Exercise5_9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       
        String highScoreName = "";
        String secondPlaceName = "";
        int highScore = -1;
        int secondPlaceScore = -1;
       

        System.out.print("How many students are there: ");
        int numStudents = input.nextInt();
        input.nextLine();

        for(int i = 0; i < numStudents; i++){
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter score: ");
            int score = input.nextInt();
            input.nextLine();
            
            if(score > highScore){
               
                secondPlaceName = highScoreName;
                secondPlaceScore = highScore; 
                highScoreName = name;
                highScore = score;
            }else if ( score > secondPlaceScore){
                secondPlaceName = name;
                secondPlaceScore = score; 
            } 
        }

           
    
        System.out.println();
        System.out.println("The winner is " + highScoreName + " with a total score of " + highScore + "!");
        System.out.println("The runner up is " + secondPlaceName + " with a score of " + secondPlaceScore + "!");
    }
}
