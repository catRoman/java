package chp3;

import java.util.Arrays;

public class AnotherArrayStack<T> 
    implements StackADT<T>{
        private final static int DEFAULT_CAPACITY = 100;
        private int top;
        private T[] stack;

        public AnotherArrayStack(){
            this(DEFAULT_CAPACITY);
        }
        @SuppressWarnings("unchecked")
        public AnotherArrayStack(int initialCapacity){
            top = 0;
            stack = (T[])(new Object[initialCapacity]);
        }
        public void push(T element){
            if (size() == stack.length)
                expandCapacity();
           if(stack[0] == null){
               stack[0] = element;
           }else
            stack[++top] = element;
        }
        private void expandCapacity(){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        public T pop() 
            throws EmptyCollectionException{
                if (isEmpty())
                    throw new EmptyCollectionException("stack");
                T result = stack[top];
                stack[top]=null;
                if(top != 0)
                    top--;
                return result;
        }
        public T peek()
            throws EmptyCollectionException {
                if (isEmpty())
                    throw new EmptyCollectionException("stack");
                return stack[top];
        }

        public int size(){
            if(top == 0 && stack[0]==null)
                return 0;
            else
                return top + 1;
        }

        public boolean isEmpty(){
            if(stack[top] == null)
                return true;
            return false;
        }
                


}