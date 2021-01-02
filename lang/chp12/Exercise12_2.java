
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two digits: ");

        int[] num = new int[2];
        boolean pass = false;
        do{
       
        try{
           
        for(int i = 0; i < 2; i++){
            num[i] = input.nextInt();
            
        }
            
            pass = false;
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input, try again...");
            System.out.println("Try again...");
            pass = true;
            input.nextLine();
        }
        
    }while(pass);

    System.out.println(num[0] + " + " + num[1] + " = "
                         + (num[0]+num[1]));
    }
}