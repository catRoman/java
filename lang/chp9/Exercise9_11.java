import java.util.Scanner;
public class Exercise9_11{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the values for a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        
        LinearEquation myEqn;
        myEqn = new LinearEquation(a,b,c,d,e,f);

        if(myEqn.isSolvable()){
            System.out.println("x = " + myEqn.getX());
            System.out.println("y = " + myEqn.getY());
        }else
            System.out.println("The equation has no solution");
    }
}