public class Exercise7_19{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter list: ");

        int num = input.nextInt();
        int[] list = new int[num];
        for(int i =0; i< num; i++){
        list[i] = input.nextInt();
        }
        
        System.out.print("The list is ");
        if(sorted(list))
        System.out.println("already sorted");
        else
        System.out.println("not sorted");
    }

    public static boolean sorted(int[] list){
        boolean sorted = true;
        int count = 0;
        for(int i= 0; i < list.length-1; i++){
            for(int j = 0; j < list.length - i - 1; j++){
                if(list[j] > list[j + 1]){
                    sorted = false;
                    count++;
                
            
        }
    }
}
        return sorted;
      
}
}