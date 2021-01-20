public class Exercise7_11{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double[] numbers = new double[10];
        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = input.nextDouble();
        }
        System.out. printf("The mean is %1.2f\nThe standard deviation is %1.5f\n", mean(numbers), deviation(numbers));
    }
    public static double mean(double[] x){
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        double mean = sum / x.length;
        return mean;
    }
    public static double deviation(double[] x){
        double num = 0;
        double dev = 0;

        for(int i = 0; i < x.length; i++){
            num += Math.pow(x[i] - mean(x), 2); 
        }
        dev = Math.pow(num / (x.length - 1), 0.5);
        return dev;
    }
}