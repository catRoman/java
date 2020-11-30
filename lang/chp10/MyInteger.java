/**====================
 *      UML Diagram
 * ====================
 *      MyInteger
 * --------------------
 *  - value : int
 * --------------------
 *  + MyInteger(value : int)
 *  + getValue() : int
 *  + isEven(): boolean
 *  + isEven(value : int): boolean
 *  + isEven(value : MyInteger): boolean
 *  + isOdd(): boolean
 *  + isOdd(value : int): boolean
 *  + isOdd(object : MyInteger): boolean
 *  + isPrime(): boolean
 *  + isPrime(value : int): boolean
 *  + isPrime(object : MyInteger): boolean
 *  + equals(value : int): boolean
 *  + equals(object : MyInteger): boolean
 *  + parseInt(charArray : char[]): int
 *  + parseInt(numString : String): String
 */
public class MyInteger{
    private int value;
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        return isEven(value);
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isEven(MyInteger myInt){
        return isEven(myInt.getValue());
    }
    public boolean isOdd(){
        return isOdd(value);
    }
    public static boolean isOdd(int value){
        return !isEven(value);
    }
    public static boolean isOdd(MyInteger myInt){
        return isOdd(myInt.getValue());
    }
    public boolean isPrime(){
        return isPrime(value);
    }
    public static boolean isPrime(int value){
        for(int i = 2; i < value; i++){
            if (value % i != 0)
                continue;
            else
                return false;
        }
        return true;
    }
    public static boolean isPrime(MyInteger myInt){
        return isPrime(myInt.getValue());
    }
    public boolean equals(int value){
        return value == this.value;
    }
    public boolean equals(MyInteger myInt){
        return equals(myInt.getValue());
    } 
    public static int parseInt(char[] myChar){
        int temp = 0;
        for(int i = 0; i < myChar.length; i++){
            temp += Character.getNumericValue(myChar[i]) * (Math.pow(10,myChar.length - (i+1)));
        }
        return temp;
    }
    public static int parseInt(String numString){
        int temp = 0;
        for(int i = 0; i < numString.length(); i++){
            temp += Character.getNumericValue(numString.charAt(i)) * Math.pow(10, (numString.length() - (i + 1)));
        }
        return temp;
        }
    }

