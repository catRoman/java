public class Exercise7_8{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten doubles: ");

        double[] doubles = new double[10];

        for(int i = 0; i < doubles.length; i ++){
            doubles[i] = input.nextDouble();
        }

        System.out.println("The average is " + average(doubles));
    }
    public static int average(int[] array){
        int sum =0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / 10;
    }
    public static double average(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / 10;
    }
}