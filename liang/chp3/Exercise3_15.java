import java.util.Scanner;

public class Exercise3_15 {
    public static void main(String[] args){

        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int geuss = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        int geussDigit1 = geuss / 100;
        int geussDigit2 = (geuss / 10) % 10;
        int geussDigit3 = geuss % 10;

        System.out.println("The lottery number is " + lottery);

        if (geuss == lottery)
        System.out.println("Exact match: you win $10,000");
        else if ((geuss != lottery)
                && (geussDigit3 == lotteryDigit1 || geussDigit3 == lotteryDigit2 || geussDigit3 == lotteryDigit3)
                && (geussDigit2 == lotteryDigit1 || geussDigit2 == lotteryDigit3 || geussDigit2 == lotteryDigit2)
                && (geussDigit1 == lotteryDigit3 || geussDigit1 == lotteryDigit2 || geussDigit1 == lotteryDigit1))
        System.out.println("Match all digits: you win $3,000");
        else if (geussDigit1 == lotteryDigit1
                || geussDigit1 == lotteryDigit2
                || geussDigit1 == lotteryDigit3
                || geussDigit2 == lotteryDigit1
                || geussDigit2 == lotteryDigit2
                || geussDigit2 == lotteryDigit3
                || geussDigit3 == lotteryDigit1
                || geussDigit3 == lotteryDigit2
                || geussDigit3 == lotteryDigit3)
                System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
       /** Debugging console prints ---- too much narwl to erase lol
        * System.out.println(geussDigit1 + " " + lotteryDigit1);
        System.out.println(geussDigit2 + " " + lotteryDigit2);
        System.out.println(geussDigit3 + " " + lotteryDigit3);
        System.out.println((geuss != lottery));
         System.out.println("line 1 " + (geussDigit3 == lotteryDigit1) + " " + (geussDigit3 == lotteryDigit2) + " " + (geussDigit3 == lotteryDigit3)
                            + " all togeather: " + (geussDigit3 == lotteryDigit1 || geussDigit3 == lotteryDigit2 || geussDigit3 == lotteryDigit3));
         System.out.println("line 2 " + (geussDigit2 == lotteryDigit1) + " " + (geussDigit2 == lotteryDigit3) + " "  + (geussDigit2 == lotteryDigit2)
                            + " all togeather: " + (geussDigit2 == lotteryDigit1 || geussDigit2 == lotteryDigit3 || geussDigit2 == lotteryDigit2));
         System.out.println("line 3 " + (geussDigit1 == lotteryDigit3) + " " + (geussDigit1 == lotteryDigit2) + " " + (geussDigit1 == lotteryDigit1)
                            + " all togeather: " + (geussDigit1 == lotteryDigit3 || geussDigit1 == lotteryDigit2 || geussDigit1 == lotteryDigit1));
         System.out.println("The whole thing: " + ((geuss != lottery)
         && (geussDigit3 == lotteryDigit1 || geussDigit3 == lotteryDigit2 || geussDigit3 == lotteryDigit3)
         && (geussDigit2 == lotteryDigit1 || geussDigit2 == lotteryDigit3 || geussDigit2 == lotteryDigit2)
         && (geussDigit1 == lotteryDigit3 || geussDigit1 == lotteryDigit2 || geussDigit1 == lotteryDigit1)));*/ 
    }
}