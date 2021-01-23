/** Exercise 8 Chapter 13 Intro to java by Liang 
 * 
 * Exercise13_8 - Revise myStack class
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see MyStack
*/
public class Exercise13_8{
    /**Test Driver */
    public static void main(String[] args){
        MyStack myStack1 = new MyStack();
        MyStack myStack2 = new MyStack();

        for(int i = 0; i < 5; i++){
            myStack1.push(i);
            myStack2.push(i);
        }
        System.out.println("Two stack initalized the same in a loop:");
        System.out.println("myStack1: " + myStack1.toString());
        System.out.println("myStack2: " + myStack2.toString());
        System.out.println("myStack1 equals myStack2: " + myStack1.equals(myStack2));
        System.out.println("myStack1 == myStack2: " + (myStack1 == myStack2));
        System.out.println("\tAdding on to my stack1...");
        myStack1.push(11);
        System.out.println("\tmyStack1: " + myStack1.toString());
        System.out.println("\tmyStack2: " + myStack2.toString());
        System.out.println("\tmyStack1 equals myStack2: " + myStack1.equals(myStack2));
        System.out.println("\tmyStack1 == myStack2: " + (myStack1 == myStack2));
        System.out.println();

        System.out.println("myStack3 equals reference of myStack2:");
        MyStack myStack3 = myStack2;
        System.out.println("myStack3: " + myStack3.toString());
        System.out.println("myStack2: " + myStack2.toString());
        System.out.println("myStack3 equals myStack2: " + myStack3.equals(myStack2));
        System.out.println("myStack3 == myStack2: " + (myStack3 == myStack2));
        System.out.println("\tAdding on to my stack3...");
        myStack3.push(12);
        System.out.println("\tmyStack3: " + myStack3.toString());
        System.out.println("\tmyStack2: " + myStack2.toString());
        System.out.println("\tmyStack3 equals myStack2: " + myStack3.equals(myStack2));
        System.out.println("\tmyStack3 == myStack2: " + (myStack3 == myStack2));
        System.out.println();

        
        System.out.println("myStack4 = shallow clone of myStack2");
        MyStack myStack4 = (MyStack)myStack2.clone();
        System.out.println("myStack4 equals myStack2: " + myStack4.equals(myStack2));
        System.out.println("myStack4 == myStack2: " + (myStack4 == myStack2));
        System.out.println("\tAdding on to my stack4...");
        myStack4.push(13);
        System.out.println("\tmyStack4: " + myStack3.toString());
        System.out.println("\tmyStack2: " + myStack2.toString());
        System.out.println("\tmyStack4 equals myStack2: " + myStack4.equals(myStack2));
        System.out.println("\tmyStack4 == myStack2: " + (myStack4 == myStack2));
        System.out.println();

        System.out.println("myStack5 = deep clone of myStack2");
        MyStack myStack5 = (MyStack)myStack2.deepClone();
        System.out.println("myStack5 equals myStack2: " + myStack5.equals(myStack2));
        System.out.println("myStack5 == myStack2: " + (myStack5 == myStack2));
        System.out.println("\tAdding on to my stack4...");
        myStack5.push(14);
        System.out.println("\tmyStack5: " + myStack5.toString());
        System.out.println("\tmyStack2: " + myStack2.toString());
        System.out.println("\tmyStack5 equals myStack2: " + myStack5.equals(myStack2));
        System.out.println("\tmyStack5 == myStack2: " + (myStack5 == myStack2));
        System.out.println();
        System.out.println();
        System.out.println("fin..");

    }
}
