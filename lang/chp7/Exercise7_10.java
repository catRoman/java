public class Exercise7_10{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double[] numbers =new double[10];

        for(int i =0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        
        System.out.println("The smallest index of the numbers entered is " + indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] array){
        int smallestIndex = 0;
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
            min = array[i];
            smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
}