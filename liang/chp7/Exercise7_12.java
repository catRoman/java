public class Exercise7_12{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int[] numbers =new int[10];

        for (int i  =0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("The reverse of the array is as follows:");
        System.out.println(java.util.Arrays.toString(reverse(numbers)));
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for (int i = 0, j = result.length -1 ;
            i < list.length; i++, j--){
                result[j] = list[i];
            }
            return result;
    }
}