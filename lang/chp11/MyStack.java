/**=======================
 *          MyStack
 * =======================
 * -list: ArrayList<Object>
 * +MyStack()
 * +isEmpty(): boolean
 * +getSize(): int
 * +peek(): Object
 * +pop(): Object
 * +push(0: Object): void
 */

 import java.util.ArrayList;

 public class MyStack extends ArrayList{

    private ArrayList<Object> list;

    public MyStack(){
        this.list = new ArrayList<Object>();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(0);
    }
    public Object pop(){
        Object temp = list.get(0);
        list.remove(0);
        return temp;
    }
    public void push(Object o){
        list.add(0, o);

    }
 }