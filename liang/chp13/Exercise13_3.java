import java.util.ArrayList;
import java.math.BigInteger;
import java.math.BigDecimal;

/** Exercise 3 Chapter 13 Intro to java by Liang
 * 
 * Sort ArrayList
 *  @author Cat Roman 2020-01-20
 */
public class Exercise13_3{
    /** Test method main */
    public static void main(String[] args){
        ArrayList<Number> myList = new ArrayList<>();
        
        BigInteger bigInt = new BigInteger("284709748723842039");
        BigDecimal bigDec = new BigDecimal("987434949875398477872.39847984238742974");
        double myDouble = 10.3;
        int myInt = 7;
        float myFloat = 0.7f;
        byte myByte = 25;
        short myShort = 50;
        long myLong = 1398472347;

        myList.add(bigInt);
        myList.add(bigDec);
        myList.add(myDouble);
        myList.add(myInt);
        myList.add(myFloat);
        myList.add(myByte);
        myList.add(myShort);
        myList.add(myLong);

        System.out.println("Prior to sort: " + myList.toString());
        sort(myList);
        System.out.println("After sort: " + myList.toString());

    }
    /** sort of different numeric wrapper objects in a list
     * using bubble sort techique */
    public static void sort(ArrayList<Number> list){

        for(int position = list.size() -1; position >=0; position--){
            for(int scan = 0; scan <= position - 1; scan++){
                if (list.get(scan).doubleValue() > list.get(scan + 1).doubleValue()){
                    Number temp = list.get(scan);
                    list.set(scan,list.get(scan + 1) );
                    list.set(scan + 1, temp);
                }
            }
        }
    }
}