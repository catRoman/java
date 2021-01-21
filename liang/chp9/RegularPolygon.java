/** ===================
 *      UML Diagram
 *  ===================
 *    RegularPolygon
 *  -------------------
 *  - n : int
 *  - side : double
 *  - x : double
 *  - y : double
 *  -------------------
 *  + RegularPolygon()
 *  + RegularPolygon(n : int, side : double)
 *  + RegularPolygon(n : int, side : double, x : double, y : double)
 *  + getN() : int
 *  + setN()
 *  + getSide() : double
 *  + setSide()
 *  + getX() : double
 *  + setX()
 *  + getY() : double
 *  + setY()
 *  + getPerimeter() : double
 *  + getArea() : double
 * 
 */

 public class RegularPolygon{
     private int n = 3;
     private double side = 1;
     private double x;
     private double y;

     public RegularPolygon(){

     }
     public RegularPolygon(int n, double side){
         this.n = n;
         this.side = side;
         this.x = 0;
         this.y = 0;
     }
     public RegularPolygon(int n, double side, double x, double y){
         this.n = n;
         this.side = side;
         this.x = x;
         this.y = y;
     }
     public int getN(){
         return n;
     }
     public void setN(int n){
         this.n = n;
     }
     public double getSide(){
         return side;
     }
     public void setSide(double side){
         this.side = side;
     }
     public double getX(){
         return x;
     }
     public void setX(double x){
        this.x = x;
     }
     public double getY(){
         return y;
     }
     public void sety(double y){
         this.y = y;
     }
     public double getPerimeter(){
        return n * side;
     }
     public double getArea(){
         return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
     }
 }