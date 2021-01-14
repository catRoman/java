import java.util.Arrays;
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] test = new int[12][4];

        Lab6.fillSeatsRandomly(test);

        System.out.print("Check for availability: ");
        int seatRow = input.nextInt();
        char seatColumn = input.next().charAt(0);
       
        Lab6.isSeatAvailable(seatRow, seatColumn);

        System.out.println();
        System.out.println();
        Lab6.displaySeats(test);

        System.out.print("Which seat would you like to reserve?: ");
        seatRow = input.nextInt();
        seatColumn = input.next().charAt(0);
       
        Lab6.reserveSeat(seatRow, seatColumn);

        System.out.println();
        System.out.println();

        Lab6.displaySeats(test);

        
    }
}