import java.util.Scanner;

public class Exercise4_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String digitString = input.nextLine();



       
        int ISBN10thDigit = ((int)(digitString.charAt(0) - '0') * 1 
                            + (int)(digitString.charAt(1) - '0') * 2 
                            + (int)(digitString.charAt(2) - '0') * 3
                            + (int)(digitString.charAt(3) - '0') * 4
                            + (int)(digitString.charAt(4) - '0') * 5
                            + (int)(digitString.charAt(5) - '0') * 6
                            + (int)(digitString.charAt(6) - '0') * 7
                            + (int)(digitString.charAt(7) - '0') * 8
                            + (int)(digitString.charAt(8) - '0') * 9) % 11;
        System.out.println();
        System.out.print("The ISBN-10 number is ");

        if (ISBN10thDigit == 10){
            System.out.println(digitString + "X");
        }else{
            System.out.println(digitString + ISBN10thDigit);
        }
        
    }
}