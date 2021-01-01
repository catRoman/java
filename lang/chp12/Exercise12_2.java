import java.util.Scanner;

public class Exercise12_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two digits: ");

        int[] number = new int[2];
        boolean pass = false;
        do{
        try{
        for(int i = 0; i < 2; i++){
            num[i] = input.nextInt();
            pass = false;
        }
        catch(InputMismatchException ex){
            System.out.println(num[i] + " is not an integer.");
            System.out.println("Try again...");
            pass = true;
        }
        }
    }while(pass);
    
    }
}