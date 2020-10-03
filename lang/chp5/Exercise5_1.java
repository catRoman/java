import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int count = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if(number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {
            if (number > 0)
            positive++;
            else
            negative++;

            total += number;
            count++;
            number = input.nextInt();
        }
        double average = total / count;

        System.out.println(
            "The number of positive is " + positive +
            "\nThe number of negatives is " + negative +
            "\nThe total is total " + total +
            "\nThe average is " + average);
        
    }
}