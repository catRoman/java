/** 
    (Algebra: solve quadratic equations) Write a method for solving a quadratic
    equation using the following header:
    public static int solveQuadratic(double[] eqn, double[] roots)
    The coefficients of a quadratic equation ax^2 + bx + c = 0 are passed to the
    array eqn and the real roots are stored in roots. The method returns the num-
    ber of real roots. See Programming Exercise 3.1 on how to solve a quadratic
    equation.
    Write a program that prompts the user to enter values for a, b, and c and displays
    the number of real roots and all real roots.
*/
import java.util.Scanner;

public class Exercise7_25{

    public static double root;
    
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            double[] eqn = new double[3];
            double[] roots = new double[2];
            
            System.out.print("Enter a, b, c: ");
            
            for(int i = 0; i < eqn.length; i++){
            eqn[i] = input.nextDouble();
            }

            System.out.println("There are " + solveQuadratic(eqn, roots) + " roots.");
            
            switch (solveQuadratic(eqn, roots)){

                case 0: break;
                case 1: System.out.println("Root(s): " + root);
                case 2: {
                    int i = 1;
                    for(double e: roots)
                        System.out.println("Root " + i + " is " + e);
                        i++;
                }
            }
            
               
         
    
        
        }
        
        
    

    public static int solveQuadratic (double[] eqn, double[]roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
   
        double discriminant = (b * b)- (4 * a * c);
        
        roots[0] = (-(b) + Math.pow(discriminant, 0.5)) / (2 * a);
        roots[1] = (-(b) - Math.pow(discriminant, 0.5)) / (2 * a);
        

        if(roots[0] >= 0 || roots[1] <= 0){
            root = roots[0];

        }else
            root = roots[1];


        if (discriminant > 0){
            return 2;
        } else if (discriminant < 0){
            return 0;
        } else{
        return 1;
        }
    }
}