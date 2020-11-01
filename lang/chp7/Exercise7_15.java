public class Exercise7_15{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        System.out.println("The distinct numbers are: " + java.util.Arrays.toString(eliminateDuplicates(list)));
    }

public static int[] eliminateDuplicates(int[] list){
    
    int key = 0;
   int count =0;
   int totalCount = 0;
    for(int i = 0; i < list.length; i++){
       key = list[i];
        for(int j = 1; j < list.length; j++){
            if(key == list[j])
                count++;
            
            
        }
        if(count == 1)
        totalCount++;
        count = 0;
    }

    int[] newList = new int[totalCount];
int k = 0;
    for(int i = 0; i < list.length; i++){
        key = list[i];
         for(int j = 1; j < list.length; j++){
             if(key == list[j])
                 count++;
             
         } 
         if(count == 1){
            list[j] = newList[k];  
            k++;
         }
     }
     return newList;
}


}