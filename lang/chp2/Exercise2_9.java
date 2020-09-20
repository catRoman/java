import java.util.Scanner;

public class Exercise2_9{

    public static double roundToDecimalPlaces(double num, int decimalPlaces){
        int adjDec = 0;
        for(int i = 1; i <= decimalPlaces; i++){
           adjDec = (int)Math.pow(10, i);
           
        }
        num = (int)((num * adjDec) + 0.5)/(double)adjDec;
        
        return num;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double averageAcceleration = (finalVelocity - initialVelocity)/time;
       
        System.out.println("The average acceleration is " + roundToDecimalPlaces(averageAcceleration, 4));
    
    }
}