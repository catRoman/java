public class Transition<E1,E2,E3> extends Association<E1,E2>{
    private E3 three;

    public Transition(E1 one, E2 two, E3 three){
        super(one, two);
        this.three = three;
    }
    public E3 getThree(){
        return three;
    }
    public void setThree(E3 three){
        this.three = three;
    }
    @Override
        public String toString(){
            return "[ " + getOne().toString() + " , "
                    + getTwo().toString() + " , " 
                    + getThree().toString() + " ]";
        }
}