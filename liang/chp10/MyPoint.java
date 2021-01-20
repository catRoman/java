/**====================
 *      UML Diagram
 * --------------------
 *      MyPoint
 * --------------------
 *  - x : double
 *  - y : double
 * --------------------
 *  + MyPoint()
 *  + MyPoint(x : double, y :double)
 *  + distance(point1 : MyPoint) : double
 *  + distance(x : double, y : double) : double
 * 
 */

 public class MyPoint{
     private double x = 0;
     private double y = 0;
 public MyPoint(){
 }
 public MyPoint(double x, double y){
    this.x = x;
    this.y = y;
 }
 public double getX(){
     return x;
 }
 public double getY(){
     return y;
 }
 public double distance(MyPoint myPoint1){
     return Math.sqrt(Math.pow(x + myPoint1.getX(), 2) + Math.pow(y + myPoint1.getY(),2));
 }
 public double distance(double x, double y){
     return Math.sqrt(Math.pow(this.x + x, 2) + Math.pow(this.y + y, 2));
 }
    }