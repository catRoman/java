/** Chapter 13 intro to java by Liang
 * 
 * Exercise13_6 - The Comparable Circle class
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see Cirle
 * @see java.lang.Comparable
 */
public class ComparableCircle extends Circle 
    implements Comparable<ComparableCircle>{

        /** Constructs default constructor*/
        public ComparableCircle(){

        }
        /**Constructs class with parent class instantiation*/
        public ComparableCircle(double radius){
            super(radius);
        }

        /**Constructs class with full parent and grandparent instantiation */
        public ComparableCircle(double radius, String color, boolean filled){
            super(radius, color, filled);
        }

        /** comparison based on area
         * 
         * @see java.lang.Comparable
         * @return less than zero is smaller, zero if equal, greater than zero if larger
        */
        public int compareTo(ComparableCircle o){
            if(this.getArea() > o.getArea())
                return 1;
            else if(this.getArea() < o.getArea())
                return -1;
            else
                return 0;
        }
        /**{@inheritDoc} */
        @Override
        public String toString(){
            return "Comparable" + super.toString();
        }

    }