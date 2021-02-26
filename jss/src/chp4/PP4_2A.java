package chp4;

import java.util.Scanner;

public class PP4_2A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers to evalue: ");
        
        String eval = input.nextLine();
        
        PP4_2 evaluator = new PP4_2();
        try{
            System.out.print("The result is: " + evaluator.evaluate(eval));
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
