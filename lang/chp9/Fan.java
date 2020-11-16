/** =====================
 *      UML Diagram
 *  =====================
 *          Fan
 *  ---------------------
 *  - on : boolean
 *  - radius : double
 *  - color : String
 *  ---------------------
 *  + Fan()
 *  + toString() : String
 *  + getOn() : boolean
 *  + setOn()
 *  + getRadius() : double
 *  + setRadius()
 *  + getColor() : String
 *  + setColor()
 *  =====================
 *  
 */

 public class Fan{
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;

    int speed = LOW;
    boolean on;
    double radius = 5;
    String color = "blue";

    public Fan(){
     
     }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        
        String description = "FanSpeed: " + getSpeed()
                        +   "\nFan Color: " + getColor()
                        +   "\nFan Radius: " + getRadius();
        
        if(getOn()){
            return description;
        }else
            return "fan is off";
    }
    
 }