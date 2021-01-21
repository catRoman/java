/**==========================
 *      UML Diagram
 * ==========================
 *          Circle2D
 * --------------------------
 *  - double x
 *  - double y
 *  - double radius
 *  + Circle2D()
 *  + Circle2D(x : double, y : double, radius : double)
 *  + getX() : double
 *  + getY() : double
 *  + getRadius() : double
 *  + getArea() : double
 *  + getPerimeter() : double
 *  + contains(x : double, y : double) : boolean
 *  + contains(circle : Circle2D) : boolean
 *  + overlaps(circle : Circle2D) : boolean
 */

 public class Circle2D{
     private double x;
     private double y;
     private double radius;

     public Circle2D(){
         this(0, 0, 1);
     }
     public Circle2D(double x, double y, double radius){
         this.x = x;
         this.y = y;
         this.radius = radius;
     }
     public double getX(){
         return x;
     }
     public double getY(){
         return y;
     }
     public double getRadius(){
         return radius;
     }
     public double getArea(){
         return Math.PI * Math.pow(radius, 2);
     }
     public double getPerimeter(){
         return 2 * Math.PI * radius;
     }
     public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x,2)+Math.pow(this.y - y,2)); 
        if(distance > radius)
            return false;
        else
            return true;
     }
     public boolean contains(Circle2D myCircle){
        double distance = Math.sqrt(Math.pow(this.x - myCircle.getX(),2) + Math.pow(this.y - myCircle.getY(),2)); 
        if(distance + myCircle.getRadius() > this.radius)
            return false;
        else
            return true;
        
     }
     public boolean overlaps(Circle2D myCircle){
        double distance = Math.sqrt(Math.pow(this.x - myCircle.getX(),2) + Math.pow(this.y - myCircle.getY(),2)); 
        if(this.radius + myCircle.getRadius() < distance)
            return false;
        else
            return true;
     }
 }