/**
 *   (y 1 - y 2 )x - (x 1 - x 2 )y = (y 1 - y 2 )x 1 - (x 1 - x 2 )y 1
     (y 3 - y 4 )x - (x 3 - x 4 )y = (y 3 - y 4 )x 3 - (x 3 - x 4 )y 3
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercise9_12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] listX = new double[4];
        double[] listY = new double[4];

        for(int i = 0; i < listX.length; i++){
            System.out.print("Enter the coordinates (x, y) for point " + (i + 1) + ": ");
            listX[i] = input.nextDouble();
            listY[i] = input.nextDouble();
            System.out.println();
        }
        
        double[][] coefficents = new double[2][2];

       
            for(int i = 0,j = 0 ; j < coefficents[0].length; j++, i += 2){
                coefficents[0][j] = listX[i] - listX[i+1];
              
            }
            for(int i = 0, j = 0; j < coefficents[1].length; j++, i += 2){
                coefficents[1][j] = listY[i] - listY[i + 1];
               
            }


        double e = (listX[0] * coefficents[1][0]) - (listY[0] * coefficents[0][0]);
        double f = (listX[2] * coefficents[1][1]) - (listY[2] * coefficents[0][1]);

          

        LinearEquation myEqn = new LinearEquation(coefficents[1][0], coefficents[0][0], coefficents[1][1], coefficents[0][1], e, f);
           
        System.out.println();
            if(myEqn.isSolvable())
                 System.out.println("The points interesect at: (" + myEqn.getX() + "," + myEqn.getY() + ")" );
             else
                 System.out.println("The lines are parrellel.");
    }
}