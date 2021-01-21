public class Exercise5_33{
    public static void main(String[] args){
        int divisorSum = 0;
        for(int i = 2; i <= 10000; i++){
            for(int j = 1; j < i; j++){
            if(i % j == 0)
            divisorSum += j;
           
            }
            if(divisorSum == i){
            System.out.println(i);
            divisorSum = 0;

            }else
            divisorSum = 0;
           
        }
    }
}