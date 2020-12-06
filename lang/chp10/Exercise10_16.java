import java.math.BigInteger;

public class Exercise10_16{
    public static void main(String[] args){
        
        int count = 0;
        int i = 1;
        String num = "1";
        while(i < 50){
            num += "0";
            i++;
        }
        System.out.println("hi");
        BigInteger bigNum = new BigInteger(num);
        

        while(count < 10){
            if(bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || 
                bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(bigNum);
                System.out.println();
                count++;
                }
                bigNum = bigNum.add(BigInteger.ONE);
            
        }
    }
}