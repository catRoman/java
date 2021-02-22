package gameObjects.rooms;

public class LinkedRoom<T> {
   private LinkedRoom<T> forward;
   private  LinkedRoom<T> back; 
   private  LinkedRoom<T> right;
   private  LinkedRoom<T> left;
   private  T current;
  
   
   public LinkedRoom(T current){
       this.current = current;
   }
    
   public T getCurrent() {
        return current;
    }
    public LinkedRoom<T> getRight() {
        return right;
    }
    public LinkedRoom<T> getForward() {
        return forward;
    }
    public LinkedRoom<T> getBack() {
        return back;
    }
    public LinkedRoom<T> getLeft() {
        return left;
    }
    public void setCurrent(T current) {
        this.current = current;
    }
    public void setBack(LinkedRoom<T> back) {
        this.back = back;
    }
    public void setForward(LinkedRoom<T> forward) {
        this.forward = forward;
    }
    public void setLeft(LinkedRoom<T> left) {
        this.left = left;
    }
    public void setRight(LinkedRoom<T> right) {
        this.right = right;
    }
    public T getCurrentRoom(){
        return current;
    }

}
