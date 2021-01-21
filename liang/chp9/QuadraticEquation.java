/** ===================
 *      UML Diagram
 *  ===================
 *   QuadraticEquation
 *  -------------------
 *  - double a
 *  - double b
 *  - double c
 *  -------------------
 *  + QuadraticEquation(a : double, b : double, c : double)
 *  + getA() : double
 *  + getB() : double
 *  + getC() : double
 *  + getDiscriminants() : double
 *  + getRoot1() : double
 *  + getRoot2() : double
 *  --------------------
 */

 public class QuadraticEquation{
     private double a;
     private double b;
     private double c;

     public QuadraticEquation(double a, double b, double c){
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public double getA(){
         return a;
     }
     public double getB(){
         return b;
     }
     public double getC(){
         return c;
     }
     public double getDiscriminant(){
         return Math.pow(b, 2) - (4 * a * c );
     }
     public double getRoot1(){
         return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
     }
     public double getRoot2(){
         return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
     }

 }