/*  (Occurrence of max numbers) Write a program that reads 
    integers, finds the largest of them, and counts its 
    occurrences. Assume that the input ends with number 0 .
    Suppose that you entered 3 5 2 5 5 5 0 ; the program 
    finds that the largest is 5 and the occurrence count 
    for 5 is 4 .
*/
public class Exercise5_41{
    public static void main(String[] args){
    
        java.util.Scanner input = new java.util.Scanner(System.in);

      System.out.println("Enter integers followed by 0 to end sequence: ");
    int number = -1;
    int max = 0;
    int maxCount =1;

      do{
          if(number > max){
          max = number;
          
          }

          number = input.nextInt();

          if(max == number){
              maxCount++;
          }
          


    }while(number != 0);

        System.out.println("The max number is " + max);
        System.out.println("The occurence count of the largest number is " + maxCount);
    }
}