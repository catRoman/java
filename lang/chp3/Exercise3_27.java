import java.util.Scanner;

public class Exercise3_27{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if ( (x <= (-2 * y) + 200) && (y <= (-1/2 * x) + 100)){
            System.out.println("The point is in the triangle!");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}