/* didnt read the question good enough again wrote a program to display non repeated numbers
* will return to fix... maybe lol
*/

public class Exercise7_5{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int[] numbers = new int[10];

        for(int i =0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int distinct[] = new int[10];
        for(int i = 0; i < numbers.length;i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] == numbers[j])
                distinct[i]++;
            }
        }
        int count = 0;
        for(int i = 0; i < distinct.length; i++){
            if (distinct[i] == 1)
            count++;
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");

        for(int i = 0;i < distinct.length;i++ ){
            if(distinct[i] == 1)
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}