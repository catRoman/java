package collections;

import exceptions.EmptyQueueException;

/**
* LinkedQueue represents a linked implementaion of a queue
*
*@author Cat Roman - 01/03/2021
*
*/
public class LinkedQueue<T> implements QueueADT<T> {
    
    LinearNode<T> head, tail;

    public LinkedQueue(){
        head = tail = null;
    }

    /**
     *{@inheritDoc} 
     */
    @Override
    public T dequeue() throws EmptyQueueException {
        if(isEmpty())
            throw new EmptyQueueException();

        T result = head.getElement();
        head = head.getNext();

        if(isEmpty())
            tail = null;

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<>(element);

        if(isEmpty())  
            head = node;
        else
            tail.setNext(node);

        tail = node;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T first() throws EmptyQueueException {
        if(!isEmpty())
            return head.getElement();
        
        throw new EmptyQueueException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if(size() == 0)
            return true;
        
        return false;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        int size = 1;
        LinearNode<T> temp = head;
        if(temp == null)
            return 0;
        else{
            while(temp.getNext() != null){
                temp = temp.getNext();
                size++;
            }
        return size;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        LinearNode<T> temp = head;
        String rep = "[ ";
        if(isEmpty())
            rep += "QUEUE EMPTY";
        else{
            rep += temp.getElement().toString();
            for(int i = 0; i < size() - 1; i++ ){
                temp = temp.getNext();
                rep += ", " + temp.getElement().toString();
            }
        }
        return rep += " ]";
    }
}
