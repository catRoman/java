/*
1) If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2) If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3) If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4) The year is a leap year (it has 366 days).
5) The year is not a leap year (it has 365 days).
*/

public class Exercise5_27{
    public static void main(String[] args){
       
        int leapCount = 0;

        for(int i = 101; i <= 2100; i++){
            if(i % 4 == 0 && i % 100 == 0){
                
                    if(i % 400 == 0){
                        leapCount++;
                        formatFunction(i, leapCount);
                      
                    }else
                        continue;
               
            }else
                continue;
        }
        System.out.println();
        System.out.println("There are " + leapCount + " leap years between 101 and 2100 inclusively");
        System.out.println();
    }
    public static void formatFunction(int year, int leapCount){
        if(leapCount % 10 == 0){
        System.out.printf("%d ", year);
        System.out.println();
        }else
        System.out.printf("%d ", year);
            
    }
}