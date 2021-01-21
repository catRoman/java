import java.util.Scanner;

public class Exercise3_23 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double xDistance = Math.pow((0 + Math.pow(x, 2)), 0.5);
        double yDistance = Math.pow((0 + Math.pow(y, 2)), 0.5);
        System.out.println(xDistance);
        System.out.println(yDistance);
        System.out.println();
        if ( ((10.0 / 2) > xDistance) && ((5.0 / 2) > yDistance)){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else{
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}