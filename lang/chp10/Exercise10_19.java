import java.math.BigInteger;
import java.math.BigDecimal;
public class Exercise10_19{
    public static void main(String[] args){
        int p = 2;
        System.out.println("test");
        while(p <= 100){
          
            BigInteger num = new BigInteger("2");
            num = num.pow(p).subtract(BigInteger.ONE);
            // System.out.println(p + ": " + num);
            if(isPrime(num)){
                System.out.printf("%d\t\t%s\n", p,num.toString());
            }else if(!isPrime(num)){
                System.out.println(p + ":\t\tskipped");
            }
            p++;
        }
    }
        public static boolean isPrime(BigInteger bigNum){
            if(bigNum.compareTo(BigInteger.ONE) <= 0){
                return false;
            }
            BigInteger i = new BigInteger("2");

            while(i.compareTo(bigNum) == -1 ){
                if(bigNum.remainder(i).compareTo(BigInteger.ZERO) == 0)
                    return false;

                i = i.add(BigInteger.ONE);
            }
            return true;

           
        }         
     
}