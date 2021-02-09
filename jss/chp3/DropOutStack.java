import java.util.Arrays;

public class DropOutStack<T> 
    implements StackADT<T>{
        private int max;
        T[] stack;
        private int top=0;

        private static final int DEFAULT_CAPICTY = 10;

        public DropOutStack(){
            this(10, DEFAULT_CAPICTY);
        }
        @SuppressWarnings("unchecked")
        public DropOutStack(int max, int capacity){
            this.max =max;
            stack = (T[])(new Object[capacity]);
        }
        public void push(T element){
            if(size() == stack.length){
                stack = Arrays.copyOf(stack, stack.length * 2);
                
            }
            if(size() != max){
                stack[top] = element;
                top++;
            }else{
                stack[top] = element;
                T[] temp = Arrays.copyOfRange(stack,1,top+1);
                stack = temp;
            }
        }
        public T pop()
            throws EmptyCollectionException{
            if(isEmpty())
                throw new EmptyCollectionException("Drop-Out-Stack");
            T temp = stack[top -1 ];
            stack[top - 1] = null;
            top--;
            return temp;
        }
        public T peek()
            throws EmptyCollectionException{
            if(isEmpty())
                throw new EmptyCollectionException("Drop-Out-Stack");
            
            return stack[top];
        }
        public boolean isEmpty(){
            if(size() == 0)
                return true;
            return false;
        }
        public int size(){
            return top;
        }
        public String toString(){
            String temp = "[ ";
            if(size() == 0){
                return "[ EMPTY ]";
            }
            for(int i = 0; i < size(); i++){
                if(i == size() - 1)
                    temp += stack[i] + " ]";
                else
                    temp += stack[i] + " , ";
            }
            return temp;
        }
    }