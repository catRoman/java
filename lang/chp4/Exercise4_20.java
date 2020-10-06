import java.util.Scanner;

public class Exercise4_20{

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a string: ");
        String stringLine = input.nextLine();
        
        System.out.printf("The string length is %d and its first character is %c\n", stringLine.length(), stringLine.charAt(0));
    }
}