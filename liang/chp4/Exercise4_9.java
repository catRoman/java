import java.util.Scanner;

public class Exercise4_9 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String character = input.next();

        int unicode =(int)(character.charAt(0));
       
        System.out.println("The unicode for the character " + character + " is " + unicode);
    }
}