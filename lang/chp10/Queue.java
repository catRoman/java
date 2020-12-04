/**===========================
 *          UML Diagram
 * ===========================
 *          Queue
 * ---------------------------
 *  - int[] elements
 *  - int size
 *  --------------------------
 *  + Queue()
 *  + enqueue(int v)
 *  + dequeue() : int
 *  + empty()
 *  + getSize() : int
 * ---------------------------
 */


 public class Queue{
     private int[] elements;
     private int size;
     

     public Queue(int capacity){
         elements = new int[capacity];
     }
     public void enqueue(int v){
        if(elements.length <= size){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
     }
     public int dequeue(){
         int temp = elements[0];
         for(int i = 0; i< elements.length -1; i++){
             elements[i] = elements[i+1];
         }
         size--;
         return temp;
     }
     public boolean empty(){
         if(size != 0)
            return false;
        else
            return true;
     }
     public int getSize(){
         return size;
     }
 }