public class Triplet<E> extends Pair<E>{
  
    private E three;
    public Triplet(E one, E two, E three){
       super(one, two);
        this.three = three;
    }
    public E getThree(){
        return this.three;
    }
    public void setThree(E three){
        this.three = three;
    }
    public String toString(){
        return "[" + getOne() + " , " + getTwo() + " , "
                + getThree() + " ] ";
    }
}