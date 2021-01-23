/**Chapter 13 Intro to Java by Liang Exercise 1 
 * Creating abstract classes and abstract method implementation
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see Exercise13_1
 * @see GeometricObject
*/
public class Triangle extends GeometricObject{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    /**Constructs a default triangle */
    public Triangle(){
    }
    
    /**Constructs a Triangle with with defined instance variables 
     * 
     * @param sideOne length of triangles side of one in meters
     * @param sideTwo length of triangles side two in meters
     * @param sideThree length of triangles side three in meters
    */
    public Triangle(double sideOne, double sideTwo, double sideThree){
        super();
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    /**Constructs a Triangle with all its super instances set 
     * 
     * @param sideOne length of triangles side one in meters
     * @param sideTwo length of triangles side two in meters
     * @param sideThree length of triangles side three in meters
     * @param color the main color of the Triangle
     * @param filled the state of the color of the Triangle
    */
    public Triangle(double sideOne, double sideTwo, double sideThree,
             String color, boolean filled){
                 super(color, filled);
                 this.sideOne = sideOne;
                 this.sideTwo = sideTwo;
                 this.sideThree = sideThree;
    }

    /** Simple Getter
     * @return the length in meters */
    public double getSideOne(){
        return this.sideOne;
    }

    /** Simple Getter
     * @return the length in meters  */
    public double getSideTwo(){
        return this.sideTwo;
    }

    /** Simple Getter
     * @return the length in meters  */
    public double getSideThree(){
        return this.sideThree;
    }

    /** Simple Setter
     * @param sideOne the length in meters
     */
    public void getSideOne(double sideOne){
        this.sideOne = sideOne;
    }
    
    /** Simple Setter
     * @param sideTwo the length in meters
     */
    public void getSideTwo(double sideTwo){
        this.sideTwo = sideTwo;
    }
    
    /** Simple Setter
     * @param sideThree the length in meters
     */
    public void getSideThree(double sideThree){
        this.sideThree = sideThree;
    } 
    
     /**{@inheritDoc}
    */
    @Override
    public String simpleString(){
        return "Triangle";
    }

    /** 
     *  {@inheritDoc}
     */
    @Override
    public String toString(){
        return "Triangle: \n\tSideOne: " + sideOne + "\n\tSideTwo: " + sideTwo
                + "\n\tSideThree: " + sideThree + "\n" + super.toString();
    }

    /** Compute the area of a triangle via Herons formula
     * 
     *  Area = sqrt(p(p - sideOne)(p - sideTwo)(p - sideThree))
     * where p is equal to half the perimeter
     * p = (sideOne + sideTwo + sideThree) / 2
     * 
     * @see GeometricObject
     * 
     * @return the calculated area in meters sqaured of the Triangle*/
    public double getArea(){
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - this.sideOne) * (p - this.sideTwo) * (p - this.sideThree));
    }

    /** Compute the perimeter of the triangle
     * 
     * perimeter = sideOne + sideTwo + sideThree
     * 
     * @see GeometricObject
     * @return the computed perimeter
     */
    public double getPerimeter(){
        return this.sideOne + this.sideTwo + this.sideThree;
    }
}