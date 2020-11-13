/** UML Class Diagram
 * 
 * --------------------------
 *          Rectangle
 * --------------------------
 *  width : double
 *  height : double
 * --------------------------
 *  + Rectangle()
 *  + Rectangle(width : double , height : double)
 *  + getArea() : double
 *  + getPerimeter : double
 * 
 * --------------------------
 */

public class Rectangle{

    double width = 1;
    double height = 1;

    public Rectangle(){
  
    }

    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }

}