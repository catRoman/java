public class Exercise7_2{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten digits: ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}