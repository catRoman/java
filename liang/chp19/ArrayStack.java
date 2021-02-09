public class ArrayStack<T>
    implements GenericStack<T>{
    
        private T[] list;
        private int top = 0;
        private int capacity;
        private final static int DEFAULT_SIZE = 10;


    public ArrayStack(){
        this(DEFAULT_SIZE);
        this.capacity = DEFAULT_SIZE;
    }
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity){
        this.capacity = capacity;
        list = (T[])(new Object[capacity]);
    }
    public T peek() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Empty Stack");
        else
            return list[top -1];
    }
    
    public T pop() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Empty Stack");
        else{
            top--;
            T temp = list[top];
            list[top] = null;
            return temp;
        }
    }
    @SuppressWarnings("unchecked")
    public void push(T o){
       if(size() == capacity){
           T[] tempList = (T[])(new Object[capacity * 2]);
           for(int i = 0; i < size(); i++){
               tempList[i] = list[i];
           }
           list = tempList;
       }
       list[top] = o;
       top++; 
    }

    public boolean isEmpty(){
        if(top == 0)
            return true;
        return false;
    }
    public int size(){
        return top;
    }
    public String toString(){
        String temp = "[";
        int tmpSize = size();
        for(int i = 0; i < size(); i++){
            if(tmpSize > 1){
                temp += list[i] + ",";
                tmpSize--;
            }else if(tmpSize == 1)
                temp += list[i] + "]";
        }
        return temp;
    }
}