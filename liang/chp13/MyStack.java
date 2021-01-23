import java.util.ArrayList;
/** Exercise 8 chapter 13 Intro to Java by Liang 
 * 
 * Exercise13_8 - revise myStack class
 * 
 * @author Cat Roman 2020-01-22 
*/
public class MyStack 
    implements Cloneable, Comparable<MyStack>{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() -1);
    }
    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    /**refernces of instantiated objects are only copied
     *  from original object and still subject to modification 
     * 
     * @see Clonable
     *  @return a shallow copy of stack 
     */
    @Override
    public Object clone(){
        try {
           return super.clone();
        }catch (CloneNotSupportedException ex){
            return null;
        }
    }

    /**all class instances copied
     * and instantiated object within original class are copied
     * as well and reassigned to cloned copy to ensure proper
     * encapsulation  
     *
     * @see Clonable
     * 
     * @return a deep copy of stack 
     */
    public Object deepClone(){
            try{
            MyStack myStackDeepClone = (MyStack)super.clone();        
            myStackDeepClone.list = (ArrayList<Object>)(list.clone());
            return myStackDeepClone;
            }catch(CloneNotSupportedException ex){
                return null;
            }
        }
    
    /**
    * @see the difference in size between stacks
    */
    @Override
    public int compareTo(MyStack o) {
        int equals = 0;

        if(this.getSize() > o.getSize()){
            equals = 1;
        }else if(this.getSize() < o.getSize()){
            equals = -1;
        }
        if(this.getSize() == o.getSize()){
            for(int i = 0; i < this.getSize(); i++){
                if(this.list.get(i) != o.list.get(i)){
                  equals = -1;
                  break;
                }
              
            }
        }
          
          
        return equals;
      }
        
    

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object o){
        
        if(this.compareTo((MyStack)o) == 0){
                return true;
              }
              
        return false;
    }



    
} 
