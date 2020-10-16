public class Exercise5_25{
    public static void main(String[] args){
        System.out.println("The value of pi at 10000: " + piFunction(10000));
        System.out.println();
        System.out.println("The value of pi at 20000: " + piFunction(20000));
        System.out.println();
        System.out.println("The value of pi at 100000: " + piFunction(100000));

    }
    public static double piFunction(int i){
        double comp = 0;
        for(int j = 1; j <= i; j++){
            comp += Math.pow(-1, j + 1) / ((2.0 * j) - 1);
        }
        double pi = 4 * comp;
        return pi;
    }
}