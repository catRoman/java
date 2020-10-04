import java.util.Scanner;

public class Exercise3_28 {

    public static void main(Sting [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        
        
        if((((-1.0/2.0) * r1Width) + r1X) <=  (((-1.0/2.0) * r2Width) + r1X) && (((1.0/2.0) * r1Width) + r1X) <= ((-1.0/2.0) * r2Width) + r1X) 
            && ((-1.0/2.0) * r1Height) + r1X) <=  (((-1.0/2.0) * r2Height) + r1X) && (((1.0/2.0) * r1Height) + r1X) <= ((-1.0/2.0) * r2Height) + r1X)){
                System.out.println("r1 is inside r2");
            } else{
                System.out.println("r2 is inside r1"):
            }
    } 
}