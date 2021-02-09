public class Exercise19_6{
    public static void main(String[] args){
        Association<Integer,Double> assOne = new Association<>(1, 3.5);
        Transition<Integer,Double,java.math.BigInteger> transOne = new Transition<>(2,45.6, new java.math.BigInteger("987892735987304958309485"));

        
        
        System.out.println("Association test:");
        System.out.println("one: " + assOne.getOne().toString());
        System.out.println("two: " + assOne.getTwo().toString());
        System.out.println("toString: " + assOne.toString());
        System.out.println();
        System.out.println("Transition test:");
        System.out.println("one: " + transOne.getOne().toString());
        System.out.println("two: " + transOne.getTwo().toString());
        System.out.println("three: " + transOne.getThree().toString());
        System.out.println("toString: " + transOne.toString());


       
    }
}