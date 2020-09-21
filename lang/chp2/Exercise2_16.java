import java.util.Scanner;

public class Exercise2_16 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (3.0/2) * Math.sqrt(3.0) * Math.pow(side, 2.0);
        area = (int)((area * 10000)+0.5)/10000.0;
        System.out.println("The area of the hexagon is " + area);
    }
}