import java.util.Scanner;

public class Exercise3_6 {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter weight in pounds: ");
     double weight = input.nextDouble();
    
     System.out.print("Enter height in feet: ");
     double heightInFeet = input.nextDouble();

     System.out.print("Enter inches: ");
     double heightInInches = input.nextDouble();

     final double KILOGRAMS_PER_POUND = 0.45359237;
     final double METERS_PER_INCH = 0.0245;
     double weightInKilograms = weight * KILOGRAMS_PER_POUND;
     double heightInMeters = ((heightInFeet * 12) + heightInInches) * METERS_PER_INCH;
     double bmi = weightInKilograms / (heightInMeters * heightInMeters);

     System.out.println("BMI is " + bmi);
     if(bmi < 18.5)
     System.out.println("underweight");
     else if (bmi < 25)
     System.out.println("Normal");
     else if (bmi < 30)
     System.out.println("Overweight");
     else
     System.out.println("Obese");
 }
}