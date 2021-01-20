/**==========================
 *  IllegalTriangleException
 * ==========================
 * -triangle: Triangle
 * +IllegalTriangleException()
 * +IllegalTriangleException(triangle: Triangle)
 * +getTriangle: Triangle

 */

 public class IllegalTriangleException extends Exception{
     private Triangle triangle;

     public IllegalTriangleException(){
     }
     public IllegalTriangleException(Triangle triangle){
         super("side length combination error: (" + triangle.getSide1() + ", " 
                + triangle.getSide2() + ", " + triangle.getSide3() + ")");
         this.triangle = triangle;
     }
     public Triangle getTriangle(){
         return triangle;
     }
 }