import java.util.Scanner;

public class Exercise3_11 {
    public static void main (String[] args){
         
        Scanner input = new Scanner(System.in);

        System.out.print("enter a three-digit integer: ");
        int isItAPalidrome = input.nextInt();

        System.out.println();
        
        int firstDigit = (isItAPalidrome % 1000)/100;
        int lastDigit = (isItAPalidrome % 10);

        System.out.println(firstDigit);
        System.out.println(lastDigit);

        if(firstDigit == lastDigit){
            System.out.println(isItAPalidrome + " is a palindrome");
        } else {
            System.out.println(isItAPalidrome + " is not a palindrome");
        }
    }
}