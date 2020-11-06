public class Exercise7_16{
    public static void main(String [] args){
        int[] list = new int[10000000];
        
        int key = (int)(Math.random() * 100_000_000);

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < list.length; i++){
            list[i]= (int)(Math.random() * 100_000_000);
        }
        long endTime = System.currentTimeMillis();
        
        long executionTime = endTime - startTime;

        System.out.println("The time taken in milliseconds for the creation list was:");
        System.out.println(executionTime);



        int search;
        startTime = System.currentTimeMillis();
        search = linearSearch(list, key);
        endTime = System.currentTimeMillis();

        executionTime = endTime - startTime;

        System.out.println("The time taken in milliseconds for the linear seach was:");
        System.out.println(executionTime);
        System.out.println(key + " key");
        System.out.println("The position index was " + search);


        startTime = System.currentTimeMillis();
        System.out.println("Test1: " + list[0]);
        java.util.Arrays.sort(list);
        System.out.println("Test2 " + list[0]);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The time taken for the sort is: " + executionTime);


        startTime = System.currentTimeMillis();
        binarySearch(list, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("The time taken in milliseconds for the binary seach was:");
        System.out.println(executionTime);
        System.out.println(key + " key");
        System.out.println("The position index was " + java.util.Arrays.binarySearch(list, key));
        System.out.println("The position index was in my binary search " + binarySearch(list, key));
    }
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i< list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
            return -1;
        }
    

    public static int binarySearch(int[] list, int key){
        int high = list.length-1;
        int low = 0;
        

       while(high >= low){
            int mid = (high + low)/2;
            if(key< list[mid])
                high = mid -1;
            else if (key == list[mid])
                return mid;
            else    
                low = mid + 1;
            
       }
       return -low - 1;
        
    }
}