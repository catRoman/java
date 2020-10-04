import java.util.Scanner;

public class Exercise3_26 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter an integer: ");
        int choice = input.nextInt();

        System.out.println("Is " + choice + " divisible by 5 and 6? " + (choice%5 == 0 && choice%6 == 0));
        System.out.println("Is " + choice + " divisible by 5 or 6? " + (choice%5 == 0 || choice%6 ==0));
        System.out.println("Is " + choice + " divisible by 5 or 6, but not both? " + (choice%5 == 0 ^ choice%6 == 0));
    }
}