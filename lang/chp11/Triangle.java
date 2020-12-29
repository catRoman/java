/**========================
 *      UML Diagram
 * ========================
 *      Triangle
 * ------------------------
 *  -side1: double
 *  -side2: double
 *  -side3: double
 *  +Triangle()
 *  +Triangle(side1 : double, side2 : double, side2 : double)
 *  +getSide1() : double
 *  +getSide2() : double
 *  +getSide3(): double
 *  +setSide1(side1 : double): void
 *  +setSide2(side2: double): void
 *  +setSide3(side3: double): void
 *  +getArea(): double
 *  +getPerimeter(): double
 *  +toString(): String
 */

 public class Triangle extends GeometricObject {
     private double side1;
     private double side2;
     private double side3;

     public Triangle(){
         this(1,1,1);
     }
     public Triangle(double side1, double side2, double side3){
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
     }
     public double getSide1(){
         return side1;
     }
     public double getSide2(){
         return side2;
     }
     public double getSide3(){
         return side3;
     }
     public void setSide1(double side1){
        this.side1 = side1;
     }
     public void setSide2(double side2){
         this.side2 = side2;
     }
     public void setSide3(double side3){
         this.side3 = side3;
     }
     public double getArea(){
         double s = (getSide1() + getSide2() + getSide3()) / 2.0;
         return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
     }
     public double getPerimeter(){
         return getSide1() + getSide2() + getSide3();
     }
     @Override
     public String toString(){
         return "Triangle: side1 = " + side1 + " side2 = "
                + side2 + " side3= " + side3;
     }
 }