/** Exercise 11 Chapter 13 Intro to java by Liang
 * 
 * <ol>
 *      <li>Exercise13_11 - The Octagon class
 * </ol>
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see GeometricObject
 * @see java.lang.Comparable
 * @see java.lang.Cloneable
 */
public class Octagon extends GeometricObject   
    implements Comparable<Octagon>, Cloneable {

        private double side;

        /**Constructs default class */
        public Octagon(){

        }

        /**Construct and instantiate all variables */
        public Octagon(double side){
            this.side = side;
        }

        /** Simple Setter 
         * @param side length in meters
        */
        public void setSide(double side){
            this.side = side;
        }

        /** Simple Getter 
         * @return length in meters
        */
        public double getSide(){
            return this.side;
        }

        /** Calculates the area in metrs^2 of the octagon with
         * the formula:
         * 
         * Area = (2 + (4 / sqrt(2))) * side^2
         * @return the area in meters^2 */
        @Override
        public double getArea(){
            return (2 + (4 / Math.sqrt(2))) * Math.pow(this.side, 2);
        }

        /** Calculates the perimeter of the object with the formula
         * 
         * Perimeter = side * 8
         * 
         * @return the perimeter in meters
         */
        @Override
        public double getPerimeter(){
            return side * 8;
        }

        /**{inheritDoc} */
        @Override
        public String simpleString(){
            return "Octagon";
        }

        /**{inheritDoc} */
        @Override
        public String toString(){
            return "Octagon:\nSide: " + this.side + "\n"
                    + super.toString(); 
        }

        /** compares area 
         * @param o Octagon to compared against
         * @return -1 if not less than 
         *          0 if equal
         *          1 if greater than
        */
        public int compareTo(Octagon o){
            if(this.getArea() > o.getArea())
                return 1;
            else if(this.getArea() < o.getArea())
                return -1;
            else
                return 0;
        }

        /** implements a shallow clone as their is no need
         * for a deep clone (no object instaniated in class)
         * @return a shallow copy 
         */
        public Object clone(){
            try{
            return super.clone();
            }catch( CloneNotSupportedException ex){
                return null;
            }
        }


    }