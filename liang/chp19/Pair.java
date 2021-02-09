public class Pair<E>{
    private E one;
    private E two;
    public Pair(E one, E two){
        this.one = one;
        this.two = two;
    }
    public E getOne(){
        return one;
    }
    public void setOne(E one){
        this.one = one;
    }
    public E getTwo(){
        return two;
    }
    public void setTwo(E two){
        this.two = two;
    }
    @Override
    public String toString(){
        return "[ " + getOne().toString() + " , "
                + getTwo().toString() + " ]";
    }
}