import java.util.NoSuchElementException;


/** An bag container based apon an array
 * 
 * @author Catlin Roman -08/02/21
 */
public class ContainerArray<T> 
    implements ContainerADT<T> {
        private T[] container;
        private int currentIndex;
        private static final int MAX_CAPACITY = Integer.MAX_VALUE;
        private static final int DEFAULT_CAPACITY = 100;

        /**Default constructor set to 
         * default capacity
         */
        public ContainerArray(){
            this(DEFAULT_CAPACITY);
        }

        /**Constructor with client set capacity  
         * @param capacity sets the initial capacity
         * of the container
        */
        public ContainerArray(int initialCapacity){
            if(initialCapacity < 0)
                throw new IllegalArgumentException("Must have positive inital capacity");
            else
                container = (T[])(new Object[initialCapacity]);
        }

        /** 
         * {@inheritDoc}
         */
        public T add(T element){
            if(index == container.length){
                T[] temp = (T[])(new Object[container.length * 2]);
                for(int i = 0; i < container.length; i++){
                    temp[i] = container[i];
                }
                container = temp;
            }
            container[++currentIndex] = element;
        }

        /**
         * {@inheritDoc}
         */
        public void clear(){
            for(int i = currentIndex; !isEmpty(); i--)
                remove(container[i]);
        }

        /**
         * {@inheritDoc}
         */
        public boolean contains(T element){
            return indexOf(element) >= 0;
        }

        /**
         * {@inheritDoc}
         */
        public boolean isEmpty(){
            return size() == 0;
        }

        /**
         * {@inheritDoc}
         */
        public int maxSize(){
            return MAX_CAPACITY;
        }

        /**
         *  {@inheritDoc}
         */
        public T remove(T element)
            throws EmptyContainerException, NoSuchElementException{
            if(isEmpty())
                throw new EmptyContainerException();
            if(contains(element)){
                T removed = container[indexOf(element)];
                T[] tempContainer = (T[])(new Object[container.length - 1]);
                
                if(indexOf(element) == 0)
                    for(int i = 1; i < size(); i++)
                        tempContainer[i-1] = container[i];
                else if(indexOf(element) == currentIndex)
                    for(int i = 0; i < currentIndex;i++)
                        tempContainer[i] = container[i];
                else if(indexOf(element) > 0){
                    for(int i = 0; i < indexOf(element); i++)
                        tempContainer[i] = container[i];
                    for(int i = indexOf(element) + 1; i < size(); i++)
                        tempContainer[i] = container[i];
                }
                container = tempContainer;
                currentIndex--;
                return removed;
            }
            throw new NoSuchElementException();
        }

        /**
         * {@inheritDoc}
         */
        public T removeRandom()
            throws EmptyContainerException{
            if(isEmpty())
                throw EmptyCollectionException();

            return remove(container[Math.random() * size()]);
        }

        /**
         * {@inheritDoc}
         */
        public int size(){
            if(currentIndex == 0 && container[0]== null)
                return 0;
            return currentIndex + 1;
        }

        /**
         * {@inheritDoc}
         */
        public String toString(){
            String temp = "[ ";
            for(int i = 0; i < size(); i++){
                temp += container[i].toString();
                if(i == size() - 1)
                    temp +=  " ]";
                else
                    temp += " , ";
            }
        }

        /**returns the index of an element if it is in the container
         * if it is not it will return -1
         * @param element to search for in container
         * @return index of element
         */
        private int indexOf(T element){
            for(int i = 0; i < size(); i++)
                if(container[i].equals(element))
                    return i;
            return -1;
        }

}