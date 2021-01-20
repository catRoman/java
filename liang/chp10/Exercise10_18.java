import java.math.BigInteger;
public class Exercise10_18{
    public static void main(String[] args){

        BigInteger bigNum = new BigInteger(Long.toString(Long.MAX_VALUE));
      

        int count = 0;
        BigInteger i = new BigInteger("2");

        while(i.compareTo(bigNum.divide(BigInteger.TWO)) <= 0 && count < 5){
             
                if(bigNum.remainder(i).compareTo(BigInteger.ZERO) == 0){
                    System.out.println(bigNum);
                    count++;
                    
                }
                bigNum = bigNum.add(BigInteger.ONE);
              
            }

      
        }
        

    }
