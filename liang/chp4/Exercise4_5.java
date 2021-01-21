import java.util.Scanner;

public class Exercise4_5{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberSides = input.nextInt();
        System.out.print("Enter the side length: ");
        double side = input.nextDouble();

        double area = (numberSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberSides));
         System.out.println("The area of the polygon is " + area);
    }
}