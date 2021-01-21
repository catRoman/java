public class Exercise7_9{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten doubles: ");

        double[] numbers = new double[10];

        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum value of the entered numbers is " + min(numbers));
    }
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min)    
            min = array[i];
            }
            return min;
        }
    }
