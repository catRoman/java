import java.math.BigInteger;

public class Exercise10_19{
    public static void main(String[] args){
        int p = 2;
        while(p <= 100){
          
            BigInteger num = new BigInteger("2");
            num = num.pow(p).subtract(BigInteger.ONE);
            if(isPrime(num)){
                System.out.printf("%d\t\t%s", p,num.toString());
            }
            p++;
        }
    }
        public static boolean isPrime(BigInteger bigNum){
           
   
            BigInteger i = new BigInteger("2");
    
            while(i.compareTo(bigNum.divide(BigInteger.TWO)) <= 0){
                 
                    if(bigNum.remainder(i).compareTo(BigInteger.ZERO) == 0){
                        System.out.println(bigNum);
                        return true;
                        
                    }
                    bigNum = bigNum.add(BigInteger.ONE);
                  
                }
            return false;
    
          
            }
     
}