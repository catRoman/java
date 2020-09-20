import java.util.Scanner;
class Exercise2_1{
static public void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.print("Enter a degree in Celsius ");
    double celsius = input.nextDouble();
    double fahrenheit = (celsius * (9.0/5)) + 32;
    
    System.out.println((int)celsius + " Celsius is " + fahrenheit + " Fahrenheit");
}
}