/**==========================
 *      UML Diagram
 * ==========================
 *         MyRectangle2D
 * --------------------------
 *  - double x
 *  - double y
 *  - double width
 *  - double height
 *  + MyRectangle2D()
 *  + MyRectangle2D(x : double, y :double, width : double, height : double)
 *  + getX() : double
 *  + setX(x : double)
 *  + getY() : double
 *  + setY(y : double)
 *  + getWidth() : double
 *  + setWidth(width : double)
 *  + getHeight() : double
 *  + setHeight(height : double)
 *  + getArea() : double
 *  + getPerimeter() : double
 *  + contains(x : double, y : double) : boolean
 *  + conatains(r : MyRectangle2D) : boolean
 *  + overlaps(r : MyRectangle2D) : boolean
 *  
 */

 public class MyRectangle2D{
     private double x;
     private double y;
     private double width;
     private double height;

     public MyRectangle2D(){
         this(0,0,1,1);
     }
     public MyRectangle2D(double x, double y, double width, double height){
         this. x = x;
         this.y = y;
         this.width = width;
         this.height = height;
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
     public void setY(double y){
         this.y = y;
     }
     public double getWidth(){
         return width;
     }
     public void setWidth(double width){
        this.width = width;
     }
     public double getHeight(){
         return height;
     }
     public void setHeight(double height){
         this.height = height;
     }
     public double getArea(){
         return height * width;
     }
     public double getPerimeter(){
         return (2 * width) + (2 * height);
     }
     public boolean contains(double x, double y){
        if((0.5 * height) + this.y > y && this.y - (0.5 * height) < y
            && this.x - (0.5 * width) < x && this.x + (0.5 * width) > x)
            return true;
        else 
            return false;
     }
     public boolean contains(MyRectangle2D r){
         if(this.contains(r.getX()-(0.5 * r.getWidth()), r.getY() + (0.5 * r.getHeight()))
            && this.contains(r.getX()+(0.5 * r.getWidth()), r.getY() + (0.5 * r.getHeight()))
            && this.contains(r.getX()+(0.5 * r.getWidth()), r.getY() - (0.5 * r.getHeight()))
            && this.contains(r.getX()-(0.5 * r.getWidth()), r.getY() - (0.5 * r.getHeight())))
            return true;
        else   
            return false;
     }
     public boolean overlaps(MyRectangle2D r){
        double this_R_minX = this.getX() - (0.5 * this.getWidth());
        double this_R_maxX = this.getX() + (0.5 * this.getWidth());
        double r_minX = r.getX() - (0.5 * r.getWidth());
        double r_maxX = r.getX() + (0.5 * r.getWidth());

        double this_R_minY = this.getY() - (0.5 * this.getHeight());
        double this_R_maxY = this.getY() + (0.5 * this.getHeight());
        double r_minY = r.getY() - (0.5 * r.getHeight());
        double r_maxY = r.getY() + (0.5 * r.getHeight());


        // not working will return and debug
      if(this_R_minX >= r_maxX || r_minX >= this_R_maxX){
        return false;
      }else if(this_R_maxY <= r_minY || r_maxY <= this_R_minY){
          return false;
      }
      return true;
     }
 }