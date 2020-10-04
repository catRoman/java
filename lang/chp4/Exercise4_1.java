import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length fom the center to a vertex: ");
        double radius = input.nextDouble();

        double s = (2 * radius) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("%s %2.2f\n", "The area of the pentagon is", area);
    }
}