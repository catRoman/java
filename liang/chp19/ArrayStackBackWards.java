public class ArrayStack<T>
    implements GenericStack<T>{
    
        private T[] list;
        private int size = 0;
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
    public T peek(){
        return list[0];
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        T temp = list[0];
        T[] tempList = (T[])(new Object[capacity]);

        for( int i = 1; i < list.length; i++){
            tempList[i - 1] = list[i];
        }
        list = tempList;
        size--;
        return temp;
    }
    @SuppressWarnings("unchecked")
    public void push(T o){
        T[] tempList;
        if(size == capacity){
            tempList = (T[])(new Object[capacity * 2]);
            this.capacity *= 2;
            for(int i = 0; i < list.length; i++){
                tempList[i] = list[i];
            }
            list = tempList;
        }else
            tempList = (T[])(new Object[capacity]);

        tempList[0] = o;
        for(int i = 1; i < list.length; i++){
            tempList[i] = list[i - 1]; 
        }
        list = tempList;
        size++;
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }
    public int size(){
        return this.size;
    }
    public String toString(){
        String temp = "[";
        int tmpSize = size;
        for(int i = 0; i < size; i++){
            if(tmpSize > 1){
                temp += list[i] + ",";
                tmpSize--;
            }else if(tmpSize == 1)
                temp += list[i] + "]";
        }
        return temp;
    }
}