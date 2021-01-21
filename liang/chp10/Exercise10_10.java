public class Exercise10_10{
    public static void main(String[] args){
        Queue myQue = new Queue(8);

        for(int i =1; i <= 20; i++){
            myQue.enqueue(i);
            System.out.println("Size: " + myQue.getSize());
            
        }
        while(!myQue.empty()){
            System.out.println("dequeue: " + myQue.dequeue());
            System.out.println("Size: " + myQue.getSize());
        }
    }
}