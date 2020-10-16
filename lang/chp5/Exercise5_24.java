public class Exercise5_24{
    public static void main(String[] args){
        double sum = 0;
        
        for(int i = 1, j = 3; i <= 97; i += 2, j+= 2){
            sum += (double)i / (double)j;
        }

        System.out.println("The sum is " + sum);
    }
}