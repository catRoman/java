import java.util.Scanner;

public class Exercise4_11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();


        if(decimalValue <= 9 ){
            char character = (char)(decimalValue + 48);
            System.out.printf("%s %d %s 0%c\n","The hex value for decimal",decimalValue,"is", character);

        }else if(decimalValue > 9 && decimalValue <= 15){
            char character = (char)(decimalValue + 55);
            System.out.printf("%s %d %s 0%c\n","The hex value for decimal",decimalValue,"is", character);
        }else{
            System.out.println(decimalValue + " is an invalid input");
            System.exit(1);
        }
    } 
}