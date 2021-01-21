import java.util.Scanner;

public class Exercise5_16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int i = 2;
        System.out.print("The factors of " + number + " are ");
        
        while(number / i != 1){
        if(number % i == 0){
            System.out.print(i + ", ");
            number = number / i;
    
        }else 
            i++;
        
        
        
        }
        System.out.println(number + ".");
    }
}