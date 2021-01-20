import java.util.Scanner;

class Exercise2_2{
    static public void main(String[] args){
        
        Scanner input = new Scanner(System.in);
    
    final double PI = 3.14159;

    System.out.print("Enter the radius and length of a cylinder\n"
    + "(with the values seperated by spaces): ");
    double radius = input.nextDouble();
    double length = input.nextDouble();
   

    double area = (int)(((radius * radius * PI) * 10000) + 0.5)/10000.0;
    System.out.println();
    System.out.println("The area is " + area);
    double volume = (int)(((area * length) * 10) + 0.5)/10.0;

   

    System.out.println("The volume is " + volume);
    }
}