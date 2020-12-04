/**=======================
 *      UML Diagram
 * =======================
 *      Triangle2D
 * -----------------------
 *  - MyPoint p1
 *  - MyPoint p2
 *  - MyPoint p3
 * -----------------------
 * + Triangle2D()
 *  + Trinagle2D(p1 : MyPoint, p2 : MyPoint, p3 : MyPoint)
 *  + getP1() : MyPoint
 *  + setP1(x : int, y : int)
 *  + getP2() : MyPoint
 *  + setP2(x : int, y : int)
 *  + getP3() : MyPoint
 *  + setP3(int x, int y)
 *  + getArea() : double
 *  + getPreimeter() : double
 *  + contains(p : MyPoint) : boolean
 *  + contains(t : Triangle2D) : boolean
 *  + overlaps(t : Triangle2D) : boolean  
 */

 public class Triangle2D{
     private MyPoint p1;
     private MyPoint p2;
     private MyPoint p3;

     public Triangle2D(){
         this(new MyPoint(0,0),
                new MyPoint(1,1),
                new MyPoint(2,5));
         
     }
     public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
         this.p1 = p1;
         this.p2 = p2;
         this.p3 = p3;

     }
     public MyPoint getP1(){
         return p1;
     }
     public void setP1(MyPoint p1){
         this.p1 = p1;
     }
     public MyPoint getP2(){
         return p2;
     }
     public void setP2(MyPoint p2){
         this.p2 = p2;
     }
     public MyPoint getP3(){
         return p3;
     }
     public void setP3(){
         this.p3 = p3;
     }
     public double getArea(){
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3); 
        double side3 = p3.distance(p1);

        double s = (side1 + side2 + side3)/2;
 
        double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        
        return (int)(area*10)/10.0;
        
     }
     public double getPerimeter(){
         return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);  
     }
     public boolean contains(MyPoint p){
        

 }