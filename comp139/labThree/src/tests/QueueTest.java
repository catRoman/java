package tests;
import collections.LinkedQueue;
import exceptions.EmptyQueueException;

public class QueueTest {
    public static void main(String[] args){
        LinkedQueue<Integer> test = new LinkedQueue<>();

        System.out.println("size(): " + test.size());  
        System.out.println("isEmpty(): " + test.isEmpty());    
        System.out.println("toString: " + test.toString());
        
        try{
            //test exception
            try{
                System.out.println("first: " + test.first());
            }catch(EmptyQueueException ex){
                System.out.println(ex);
            }
            test.enqueue(5);
            test.enqueue(4);
            test.enqueue(3);
            test.enqueue(2);
            test.enqueue(1);
            test.enqueue(0);

            System.out.println("toString: " + test.toString());

            System.out.println("isEmpty(): " + test.isEmpty());    
            System.out.println("size(): " + test.size());    
            
            System.out.println("first: " + test.first());
            test.dequeue();
            System.out.println("first after deque:" + test.first());
            System.out.println("size(): " + test.size());    
            test.dequeue();
            test.dequeue();
            test.dequeue();
            test.dequeue();
            test.dequeue();
            //test exception
            test.dequeue();
        }catch(EmptyQueueException ex){
            System.out.println(ex);
        }
    }
    
}
