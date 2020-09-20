import java.util.Scanner;
 
class Exercise2_4{

    static public void main(String[] args){
        final double poundsToKilo = 0.454;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
double kilos = pounds * poundsToKilo;
        System.out.println(pounds + " pounts is " + kilos + " kilograms");
    }

}