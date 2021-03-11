package exceptions;
/**
 * EmptyQueueException allows for exceptions
 * with possible unique debugging message
 * 
 * @author Cat Roman 01/03/2021
 */
public class EmptyQueueException extends Exception{
    /**
     * simple constructor
     */
    public EmptyQueueException(){
    }
    /**
     * constructor with passed message
     */
    public EmptyQueueException(String message){
        super(message);
    }
    
}
