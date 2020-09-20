import java.util.Scanner;

class Exercise2_3{
static public void main(String[] args){
    final double footToMeter = 0.305;

Scanner input = new Scanner(System.in);

System.out.print("Enter a value for feet: ");
double feet = input.nextDouble();
double meters = feet * footToMeter;
System.out.println(feet + " feet is " + meters);
}
}