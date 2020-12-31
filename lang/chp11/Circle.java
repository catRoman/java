/**=====================
 *          Circle
 * =====================
 * -radius :  double
 * +Circle()
 * +Circle(radius : int)
 * +Circle(radius : int, color : String, filled : boolean)
 * +getRadius() : double
 * +getArea() : double
 * +setRadius(radius : double)
 * +toString(): String
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle\nRadius: " + getRadius()
                + "\n" + super.toString();
    }
}