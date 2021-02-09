public class Exercise19_7{
    public static void main(String[] args){
        Transition<Integer,Double,java.math.BigInteger> transOne;
        transOne = new Transition<>(9,4.6,new java.math.BigInteger("73450"));
      

        System.out.println("sum:");
        System.out.println(sum(transOne));

    }
    public static <E1,E2,E3> double sum(Transition<? extends Number,? extends Number,? extends Number> o){
        return o.getOne().doubleValue()
                + o.getTwo().doubleValue()
                + o.getThree().doubleValue(); 
    }
}