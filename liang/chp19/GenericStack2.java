public class GenericStack2<E> 
    extends java.util.ArrayList<E>{
       public GenericStack2(){

       }
       public int getSize(){
           return super.size();
       }
       public E peek(){
           return super.get(1);
       }
       public E pop(){
           E temp = super.get(super.size() - 1);
           super.remove(super.size() - 1);
           return temp;
       }
       public void push(E o){
           super.add(o);
       }
    }