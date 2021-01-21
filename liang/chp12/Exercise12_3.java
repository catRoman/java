//import java.util.ArrayIndexOutOfBoundsException;
import java.util.Scanner;

public class Exercise12_3{
    public static void main(String[] args){
        String[] months = {"Jan", 
                        "Feb",
                        "Mar",
                        "Apr",
                        "May",
                        "Jun",
                        "Jul",
                        "Aug",
                        "Sep",
                        "Oct",
                        "Nov",
                        "Dec"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31,
                    31, 30, 31, 30, 31};
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an a number representing an integer: ");
        try{
            int pick = input.nextInt() - 1;
            System.out.println(months[pick] + " has "
                                + dom[pick] + " days." );
                
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong Number");
        }
    }
}