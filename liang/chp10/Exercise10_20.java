import java.math.BigDecimal;
import java.math.MathContext;
public class Exercise10_20{
    public static void main(String[] args){
       int i = 100;
       while(i <= 1000){
        System.out.println(i + ": " + eValue(i));
        System.out.println();
    i += 100;   
    }


    }


    
    public static BigDecimal eValue(int j){
        MathContext mc = new MathContext(25);
        BigDecimal bigFactorial = new BigDecimal("0");
       
        int count = 0;

        while(count < j){
            bigFactorial = bigFactorial.add((BigDecimal.ONE).divide(factorial(count), mc));
            count++;
        }
        return bigFactorial;
    }
    public static BigDecimal factorial(int j){
     
        BigDecimal bigFactorial = new BigDecimal("1");
        BigDecimal i = new BigDecimal(j);

        while(i.compareTo(BigDecimal.ZERO) == 1){
            
            bigFactorial = bigFactorial.multiply(i);
            i = i.subtract(BigDecimal.ONE);
          
        }
        return bigFactorial;
    }

}