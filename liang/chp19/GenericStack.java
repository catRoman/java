public interface GenericStack<T>{

    public T peek() throws EmptyCollectionException;
    public T pop() throws EmptyCollectionException;
    public void push(T o);
    public boolean isEmpty();
    public int size();
    public String toString();
}