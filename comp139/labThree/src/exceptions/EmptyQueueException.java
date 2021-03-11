package exceptions;
/**
 * EmptyQueueException allows for exceptions
 * with possible unique debugging message
 * 
 * @author Cat Roman 01/03/2021
 */
public class EmptyQueueException extends Exception{
    public EmptyQueueException(){
    }
    public EmptyQueueException(String message){
        super(message);
    }
    
}
