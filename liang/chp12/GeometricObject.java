/**====================
 *      UML Diagram
 * ====================
 *    GeometricObject
 * --------------------
 *  -color : String
 *  -filled : boolean
 *  -dateCreated : java.util.Date 
 *  +GeometricObject()
 *  +GeometricObject(color: String, filled : boolean)
 *  +getColour(): String
 *  +setColor(color: String): void
 *  +isFilled(): boolean
 *  +setFillled(filled: boolean): void
 *  +getDateCreated(): java.util.Date
 *  +toString(): String
 */

 public class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this.dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor:"
                + color + " and filled: " + filled;

    }
}