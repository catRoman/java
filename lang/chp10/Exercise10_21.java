import java.math.BigInteger;
public class Exercise10_21{
    public static void main(String[] args){
        BigInteger bigNum = new BigInteger(Long.toString(Long.MAX_VALUE));

        int count = 1;
        while(count <= 5){
        if(bigNum.remainder(new BigInteger("5")).compareTo(BigInteger.ZERO) == 0){
            System.out.println(count + ": " + bigNum);
            count++;
        }else if(bigNum.remainder(new BigInteger("6")).compareTo(BigInteger.ZERO) == 0){
            System.out.println(count + ": " + bigNum);
            count++;
        }

            bigNum = bigNum.add(BigInteger.ONE);
        
       
    }
}
}