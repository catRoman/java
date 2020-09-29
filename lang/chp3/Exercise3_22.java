import java.util.Scanner;

public class Exercise3_22{
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x value: ");
        double x = input.nextInt();
        System.out.print("Enter the points y value: ");
        double y = input.nextInt();
        
        double distanceFromOrigin = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5);

        if (distanceFromOrigin <= 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle");

        } else{
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
}