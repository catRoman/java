/**ArrayStack implemntation using an array
 * Java software structures by lewis and chase
 */

 public class ArrayStack<E>{
    private E[] list;
    private int top;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    
    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    } 
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity){
        this.list = (E[])(new Object[capacity]);
        this.capacity = capacity;
    }
    public E pop(){
        if(isEmpty())
            throw new EmptyCollectionException("Stack");

        E temp = list[top -1];
        list[top - 1] = null;
        top--;
        return temp;
        
    }
    @SuppressWarnings("unchecked")
    public void push(E o){
        if(top == capacity){
            E[] temp = (E[])(new Object[capacity * 2]);
            for(int i = 0; i <=  size(); i++){
                temp[i] = list[i];
            }
            list = temp;
        }
        list[top] = o;
        top++;
    }
    public E peek(){
        if(isEmpty())
            throw new EmptyCollectionException("Stack");
        return list[top - 1];
    }
    public boolean isEmpty(){   
        if (top == 0)
            return true;
        return false;
    }
    public int size(){
        return top -1;
    }
    @Override
    public String toString(){
        String temp = "[ ";
        int tempSize = size();
        for(int i = 0; i < size(); i++){
            if(tempSize == 1)
                temp += list[i] + " ]";
            else
                temp += list[i] + " , ";
        tempSize--;
        }
        return temp;
    }

 }