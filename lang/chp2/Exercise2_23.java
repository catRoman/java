import java.util.Scanner;

public class Exercise2_23 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / milesPerGallon) * pricePerGallon;
        cost = (int)((cost * 100)+0.5)/100.0;
        System.out.println("The cost of driving is $" + cost);
    }
}