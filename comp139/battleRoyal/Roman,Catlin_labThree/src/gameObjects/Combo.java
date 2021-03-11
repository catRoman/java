package gameObjects;

import collections.LinkedQueue;
import exceptions.EmptyQueueException;
import moves.Move;
/**
 * Wrapper for linkedQueue<Move> for use in game
 */
public class Combo implements Cloneable{
   private collections.LinkedQueue<Move> moveCombo;
    /**
     * simple constructor
     */
    public Combo(){
        this(new LinkedQueue<Move>());
    }
    /**
     * constructs combo with given linkedQueue<Move>
     * @param LinkedQueue<Move> for creating a combo from an
     *  existing linkedQueue of moves
     */
    public Combo(LinkedQueue<Move> moveCombo){
        this.moveCombo = moveCombo;
    }
    /**
     * adds a move to combo
     * @param Move adds an implementaion of move to combo
     */
    public void addMove(Move move){
        moveCombo.enqueue(move);
    }
    /**
     * returns move from combo and removes it from the combo
     * @return element from combo
     * @throws EmptyQueueException if combo queue is empty
     */
    public Move useMove() throws EmptyQueueException{
        return moveCombo.dequeue();
    }
    /**
     * for more specific Linkedqueue requests
     * @return the combos LinkedQueue
     */
    public LinkedQueue<Move> getQueue(){
        return moveCombo;
    }
    /**
     * the size of combo
     */
    public int getNumberOfMoves(){
        return moveCombo.size();
    }
    /**
     * the first move of the combo is shown and not removed
     * @return the first move of the combo
     */
    public Move getDoubleFirstMove()
        throws EmptyQueueException{
            return moveCombo.first();
        
    }
    /**
     * String representation of combo
     * @return String representaion of combo one move per line
     */
    @Override
    public String toString(){
        return moveCombo.toString();
    }
    /**
     * Takes two LinkedQueue<Move> and combines them into a new combo, 
     * 
     * @return Combo witha pattern such as one move from queueA one 
     * from queueB one from queueA etc.
     */
    public static Combo mergeComboQueue( LinkedQueue<Move> queueA, LinkedQueue<Move> queueB){
        LinkedQueue<Move> newQueue = new LinkedQueue<>();
        
            try{
                while(!queueA.isEmpty() && !queueB.isEmpty()){
                    newQueue.enqueue(queueA.dequeue());
                    newQueue.enqueue(queueB.dequeue());
                }
                if(queueA.isEmpty()){
                    while(!queueB.isEmpty())
                        newQueue.enqueue(queueB.dequeue());
                }else{
                    while(!queueA.isEmpty())
                        newQueue.enqueue(queueA.dequeue());
                }
            }catch(EmptyQueueException ex){
                ex.printStackTrace();
            }
        return new Combo(newQueue);
        }

}
