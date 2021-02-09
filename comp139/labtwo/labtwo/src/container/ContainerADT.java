package container;
/** Container Abstract Data Type
 * 
 * @author Catlin Roman - 08/02/21
 * 
 */
public interface ContainerADT<T>{

    /**Adds an element to the container, expanding the capacity of the
     * container when necessary
    * @param element element to be added 
    */
    public void add(T element);

    /**
     * Clears the container 
     */
    public void clear();

    /**
     * Returns true if the container contains the parameter otherwise it 
     * returns false 
     * @param target elements
     * @return boolean to specify if the element already exists in the c
     * container
     */
    public boolean contains(T target);

    /**
     * Returns true if this container contains no elements
     * @return boolean value that indicates if container is empty or not 
     */
    public boolean isEmpty();

    /**
     * Returns the maximum size of the container
     * @return the size of the container; 
     */
    public int maxSize();

     /** 
      * Removes an occurence of the specified element from the container
      * @param element to be removed from the container
      * @return element from container specified by parameter
      * @throws EmptyContainerException when container is empty
      * @throws java.util.NosuchElementException when an element is not found
      */
      public T remove(T element);

      /**
       *  Removes a random element from the container
       * @return element from the bag
       * @throws EmptyContainerException when container is empty
       */
      public T removeRandom();

      /**
       *  Returns the number of elements in the container
       * @return number of elements in the container
       */
      public int size();

      /**
       * Returns a string representation of the container
       * @return  String
       */
      public String toString();

}
