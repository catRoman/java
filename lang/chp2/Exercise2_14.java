import java.util.Scanner;

public class Exercise2_14 {

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         final double POUNDTOKILO = 0.45359237;
         final double INCHTOMETER = 0.0254;
         
         System.out.print("Enter weight in pounds: ");
         double weight = input.nextDouble();
         System.out.print("Enter height in inches: ");
         double height = input.nextDouble();
        weight *= POUNDTOKILO;
        height *= INCHTOMETER;

        double bmi = weight/(Math.pow(height, 2));
        bmi = (int)((bmi * 10000)+0.5)/10000.0;
         System.out.println("BMI is " + bmi);
    }
}