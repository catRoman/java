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
    int k = -1;
    int key = 0;
   int count =0;
   int totalCount = 0;
   int min = list[0];
   int temp = 0;
   System.out.println(totalCount);
 
   /** 
  for(int i = 0; i < list.length; i++){
    for(int j =1; j < list.length; j++){
    if(list[j] > list[i]){
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
   }
}
   
*/
java.util.Arrays.sort(list);
   System.out.println(java.util.Arrays.toString(list));

    for(int i = 0; i < list.length; i++){
      System.out.print( list[i] +" * ");
        for(int j = 0; j < list.length; j++){
            if(list[j]== k)
                continue;
            else if(list[i] == list[j]){
                System.out.print("!");
                k = list[i];
                count++;
            }
            System.out.print("&" + count + "^ ");
             
            
            }
            if(count == 1){
                //totalCount -= count;
                System.out.print("$");
                totalCount++;   
        }
    count = 0; 
    System.out.println(" " + totalCount);       
    }
    System.out.println(totalCount);
   // int[] newList = new int[totalCount];
  //  return newList;
 
    int[] newList = new int[totalCount];
k = -1;
int l = 0;
    for(int i = 0; i < list.length; i++){
      
         for(int j = 0; j < list.length; j++){
             if(list[j]==k)
             continue;
            if(list[j] == list[i]){
             newList[l] = list[j];  
            k = list[j];  
            l++; 
            }
            
        

             
         } 
    
            
         
     }
     return newList;

    }


}