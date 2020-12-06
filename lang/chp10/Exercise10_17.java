import java.math.BigInteger;

public class Exercise10_17{
    public static void main(String[] args){

        int count = 0;
        long longNum = Math.round(Math.sqrt(Long.MAX_VALUE));
        String num = Long.toString(longNum);
        BigInteger a = new BigInteger(num);

        while(count < 10){
           BigInteger s = a.pow(2);
            if(s.compareTo(new BigInteger(Long.toString(Long.MAX_VALUE))) == 1){
            System.out.println(s);
            count++;
            }
            a = a.add(BigInteger.ONE);
            
           
        }
    }
}