import java.util.Scanner;

public class Exercise3_20{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        
        if((temp >= -58 && temp <= 41) && (speed >= 2)){
        double windChill = 35.74 
                         + (0.6215 * temp)
                         - (35.75 * Math.pow(speed, 0.16))
                         + (0.4275 * temp * Math.pow(speed, 0.16));
        
        windChill = (int)((windChill * 100000)-0.5)/100000.0;

        System.out.println("The wind chill index is " + windChill);
    }else{
        System.out.println("The input was invalid");
    }
}
}