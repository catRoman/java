package chp3;

/** An exception for Collection underflow 
 * 
 * java software structures and lewis and chase
 * 
 * @see PP3_1
*/
public class EmptyCollectionException
    extends RuntimeException{

        public EmptyCollectionException(String collection){
            super("The " + collection + " is empty.");
        }
}