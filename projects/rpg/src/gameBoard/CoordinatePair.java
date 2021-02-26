package gameBoard;

public class CoordinatePair {

  
    private int x;
    private int y;

    
    public CoordinatePair(int x,int y){
            setX(x);
            setY(y);
    }
// getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
//setters
    public void setX(int x) {
     
            this.x = x;
    }
    public void setY(int y) {
            this.y = y;
    }
//Overriden
    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof CoordinatePair)){
            return false;
        }
        CoordinatePair p = (CoordinatePair) o;

        return Integer.compare(this.x, p.x) == 0
            && Integer.compare(this.y, p.y) == 0;
    }
//static

}
