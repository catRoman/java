public class Exercise5_35{
    public static void main(String[] args){
        double sum = 0;
        for(int i = 1; i <=624; i++)
        sum = (1.0/(Math.pow(i,0.5)+Math.pow(i+1,0.5)));
   
        System.out.println(sum);
    }
    
}