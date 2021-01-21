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
 *  +checkTriangle(side1: double, side2: double, side3: double): boolean
 */

 public class Triangle extends GeometricObject {
     private double side1;
     private double side2;
     private double side3;

     public Triangle() throws IllegalTriangleException{
         this(1,1,1);
     }
     public Triangle(double side1, double side2, double side3)
        throws IllegalTriangleException{
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            if(!checkTriangle(side1, side2, side3))
                throw new IllegalTriangleException(this);
     }
     public Triangle(double side1, double side2, double side3, String color, boolean filled)
        throws IllegalTriangleException{
        super(color, filled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        if(!checkTriangle(side1, side2, side3))
                throw new IllegalTriangleException(this);
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
         return super.getColor() + " Triangle: [side1] = " + side1 + " [side2] = "
                + side2 + " [side3=] " + side3 + "\n\tCreated on " + super.getDateCreated() + "\n";
     }
     public boolean checkTriangle(double side1, double side2, double side3) {
         if((side1 + side2) < side3)
            return false;
        else if((side2 + side3) < side1)
            return false;
        else if((side1 + side3) < side2)
            return false;
        else
            return true;

        }
 }