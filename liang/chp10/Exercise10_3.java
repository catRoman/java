public class Exercise10_3{
    public static void main(String[] args){
        MyInteger myInt1 = new MyInteger(11);
        MyInteger myInt2 = new MyInteger(10);
        
        System.out.println("get value 11: " + myInt1.getValue());
        System.out.println("get value 10: " + myInt2.getValue());

        System.out.println("is even 11: " +  myInt1.isEven());
        System.out.println("is even 10 " +  myInt2.isEven());

        System.out.println("is odd 11: " +  myInt1.isOdd());
        System.out.println("is odd 10: " +  myInt2.isOdd());

        System.out.println("is prime 11: " +  myInt1.isPrime());
        System.out.println("is prime 10: " +  myInt2.isPrime());

        System.out.println("11 is equal 11: " +  myInt1.equals(11));
        System.out.println("10 is equal 8: " +  myInt2.equals(8));
        System.out.println("myInt2 is equal to myInt1" + myInt1.equals(myInt2));

        MyInteger myInt3 = new MyInteger(7);
        MyInteger myInt4 = new MyInteger(2);

        System.out.println("static is even 7: " + MyInteger.isEven(myInt3));
        System.out.println("static is even 2: " + MyInteger.isEven(myInt4));

        System.out.println("static is odd 7: " + MyInteger.isOdd(myInt3));
        System.out.println("static is odd 2: " + MyInteger.isOdd(myInt4));

        System.out.println("static is prime 7: " + MyInteger.isPrime(myInt3));
        System.out.println("static is prime 2: " + MyInteger.isPrime(myInt4));

        char[] myCharArray = {'1', '2', '5', '7'};
        String myString = "10234765";

        System.out.println("static char array convert: " + MyInteger.parseInt(myCharArray));
        System.out.println("static String array convert: " + MyInteger.parseInt(myString));

       
       
    }
}