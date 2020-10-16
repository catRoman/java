import java.util.Scanner;

public class Exercise5_32{
    public static void main(String[] args){

       
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = (int)(Math.random() * 100) / 10;
        int lotteryDigit2 = (int)(Math.random() * 100) / 10;
        while(lotteryDigit2 == lotteryDigit1){
         lotteryDigit2 = (int)(Math.random() * 10);
        }
        int lottery = (lotteryDigit1 * 10) + lotteryDigit2;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
      
        if (guess == lottery)
            System.out.println("Exact match: you win $10000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
                System.out.println("Match all digits: you win $3000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
                System.out.println("Match one digit: you win $1000");
        else
            System.out.println("Sorry, no match");
    }
}