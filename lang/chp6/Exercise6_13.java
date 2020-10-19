public class Exercise6_13{
    public static void main(String[] args){
        System.out.printf("%-5s%5s","i","m(i)\n");
        for(int i =1; i <= 20; i++){
            System.out.printf("%-5d%5.4f\n",i , mFunction(i));
        }
    }
    public static double mFunction(int i){
        double m = 0;
       for(int j = 0; j <= i; j++)
            m += (double)(j) / (j + 1);
        
        return m;
    }
}