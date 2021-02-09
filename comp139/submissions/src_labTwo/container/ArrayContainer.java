package container;

import java.util.NoSuchElementException;
import exceptions.EmptyContainerException;

/** A generic bag container based apon an array.
 * 
 * @author Catlin Roman -08/02/21
 * 
 * @exception NoSuchElementException
 * @exception IllegalArgumentException
 * @exception EmptyContainerException
 * 
 */
public class ArrayContainer<T> 
    implements ContainerADT<T> {
        private T[] container;
        private int nextIndex;

        /** Maximum Capacity of container for length expansion */
        private static final int MAX_CAPACITY = Integer.MAX_VALUE;
        /**Default capicty set with no parameter constructor */
        private static final int DEFAULT_CAPACITY = 100;
        private int currentCapacity;
        /**Default constructor set to 
         * default capacity
         */
        public ArrayContainer(){
            this(DEFAULT_CAPACITY);
        }

        /**Constructor with client set capacity  
         * @param capacity sets the initial capacity of the container
         * @throws IllegalArgumentException if initial capacity is set below zero
        */
        @SuppressWarnings("unchecked")
        public ArrayContainer(int initialCapacity){
            if(initialCapacity < 0)
                throw new IllegalArgumentException("Must have positive inital capacity");
    
            container = (T[])(new Object[initialCapacity]);
            currentCapacity = initialCapacity;
        }

        /** 
         * Adds an element to the container, expanding the capacity by two
         * if needed until max capacity is reached.
         * @param element element to be added
         */
        @Override
        @SuppressWarnings("unchecked")
        public void add(T element){
            T[] temp;
            if(nextIndex == container.length){
                if(container.length * 2 < MAX_CAPACITY)
                    currentCapacity = container.length*2;
                else
                    currentCapacity = MAX_CAPACITY;

                temp = (T[])(new Object[currentCapacity]);
                
                for(int i = 0; i < container.length; i++){
                    temp[i] = container[i];
                }
                container = temp;
            }
            container[nextIndex] = element;
            nextIndex++;
          
        }

        /**
         * Clears the contents of the container
         */
        @Override
        public void clear(){
            for(int i = nextIndex-1; !isEmpty(); i--)
                remove(container[i]);
        }

        /**
         * Returns true if the container contains the parameter otherwise
         * it returns false. This is based on an iterator search using
         * Object.equals() to check for equality. If elements class has not 
         * overriden Object.equals() only a refrence equality will return
         * true regardless of elements content.
         * @see ContainerArray#indexOf()
         * @param target element
         * @return boolean to specify if the element already exists in the 
         * container 
         */
        @Override
        public boolean contains(T target){
            return indexOf(target) >= 0;
        }

        /**
         * Returns true if this container contains no elements
         * @return true if the element already exists in the container
         */
        @Override
        public boolean isEmpty(){
            return size() == 0;
        }

        /**
         * Returns the maximum size of the container
         * @return the size of the container
         */
        @Override
        public int maxSize(){
            return MAX_CAPACITY;
        }

        /**
         * Removes an occurence of the speccified element from the 
         * container. After ensuring an non-empty array, the method
         * will iterate through current array coping each element to
         * a temporary array not including the element to be removed.
         * The temporay array is then assigned to the original arrays
         * initial reference. The element to be removed is found using 
         * ContainerArray#indexOf(). If no element exists an exception
         * is thrown
         * @param element to be removed from the container
         * @return element from the container specified by the parameter
         * @throws EmptyContainerException when container is empty
         * @throws NoSuchElementException when an element is not found
         */
        @Override
        @SuppressWarnings("unchecked")
        public T remove(T element)
            throws EmptyContainerException, NoSuchElementException{
            if(isEmpty())
                throw new EmptyContainerException("Container is Empty");
            if(contains(element)){
                T removed = container[indexOf(element)];
                T[] tempContainer = (T[])(new Object[currentCapacity]);
                
                //removes element at first element
                if(indexOf(element) == 0)
                    for(int i = 1; i < nextIndex; i++)
                        tempContainer[i-1] = container[i];
                //removes last element
                else if(indexOf(element) == nextIndex)
                    for(int i = 0; i < nextIndex;i++)
                        tempContainer[i] = container[i];
                //removes element in middle of container
                else if(indexOf(element) > 0){
                    for(int i = 0; i < indexOf(element); i++)
                        tempContainer[i] = container[i];
                    for(int k = indexOf(element) + 1; k < nextIndex; k++)
                        tempContainer[k - 1] = container[k];
                }
                container = tempContainer;
                nextIndex--;
                return removed;
            }
            throw new NoSuchElementException("Element does not exist in container");
        }

        /**
         * Removes a random element from the container.
         * 
         * @return element from the bag
         * @throws EmptyContainerException when container is empty
         */
        @Override
        public T removeRandom()
            throws EmptyContainerException{
            if(isEmpty())
                throw new EmptyContainerException("Container is Empty");

            return remove(container[(int)(Math.random() * (size()))]);
        }

        /**
         * Returns the number of elements in the container
         * @return number of elements in the container
         */
        @Override
        public int size(){
         //   if(nextIndex == 0 && container[0]== null)
           //     return 0;
            return nextIndex;
        }

        /**
         * Returns a string representation of the container.
         * Formated as a list as such:
         * 
         *  [ e1.toString() , e2.toStirng() ... eN.toString() ]
         * 
         * If the elements class has not overridden Object.toString()
         * then a string consisting of the name of the class of 
         * which the object is an instance, the at-sign character
         * `@', and the unsigned hexadecimal representation 
         * of the hash code of the object will be represented in 
         * the list.
         * @return String
         */
        @Override
        public String toString(){
            
            if(size() == 0)
                return "[ EMPTY ]";
            String temp = "[ ";
            for(int i = 0; i < size(); i++){
                temp += container[i];
                if(i == size() - 1)
                    temp +=  " ]";
                else
                    temp += " , ";
            }
            return temp;
        }

        /**
         * Returns the index of an element. If it is in the container
         * if it is not it will return -1. If the elements class has
         * not overriden Object.equals() only exact matches to the 
         * same refrence will return true;
         * @param element to search for in container
         * @return index of element if it exists or else -1
         */
        private int indexOf(T element){
            for(int i = 0; i < size(); i++)
                if(container[i].equals(element))
                    return i;
            return -1;
        }

}