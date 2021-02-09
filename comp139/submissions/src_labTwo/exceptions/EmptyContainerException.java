package exceptions;
/** 
 * Returns the situation in which a container 
 * is empty
 * 
 * @author Catlin Roman - 08/02/21
 */
public class EmptyContainerException 
    extends RuntimeException{
    
        /**
         * Default constructor
         */
        public EmptyContainerException(){

        }
        
        /**
         * Sets up this exception with an appropriate
         * message.
         * @param container the name of the container 
         */
        public EmptyContainerException(String message){
            super(message);
        }
    }