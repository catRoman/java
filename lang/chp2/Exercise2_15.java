import java.util.Scanner;

public class Exercise2_15 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double changeInXSq = Math.pow(x2 - x1,2);
        double changeInYSq = Math.pow(y2 - y1,2);
        double distance = Math.pow(changeInXSq + changeInYSq, 0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}