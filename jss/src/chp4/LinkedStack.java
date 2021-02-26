package chp4;
import exceptions.*;
import interfaces.*;

/**
 * Represents a linked implementation of a stack.
 * @see PP4_2 create a dummy node for top
 */

 public class LinkedStack<T> implements StackADT<T>{
    private int count;
    private LinearNode<T> top;

    public LinkedStack(){
        count = 0;
        top = new LinearNode<T>();
    }
    /**
     * Adds the sopecified element to the top of the this stack
     * @param element element to be pushed on stack.
     */
    public void push(T element){
        LinearNode<T> temp = new LinearNode<T>(element);
        temp.setNext(top.getNext());
        top.setNext(temp);
        count++;
    }
    /** Removes the element at the top of this stack and returns a
     * reference to it.
     * @return element from top of stack
     * @throws exceptions.EmptyCollectionExceptio if the stack is empty.
     */
    public T pop()
        throws EmptyCollectionException{
        if(count > 0){
            T temp = top.getElement();
            top = top.getNext();
            count--;
            return temp;
        }else
            throw new EmptyCollectionException("LinearStack");
    }
    public T peek(){
      return top.getElement();  
    }
    public boolean isEmpty(){
        if(count == 0)  
            return true;
        
        return false;
    }
    public int size(){
        return count;
    }
    public String toString(){
        String output = "[";
        if(isEmpty()){
            LinearNode<T> temp = new LinearNode<T>(top.getElement());
            while(!temp.getNext().equals(null)){ 
                    output += temp.toString() + " , ";
                    temp = temp.getNext();
                }
            output += "]";
            }
        return output;
    }
}