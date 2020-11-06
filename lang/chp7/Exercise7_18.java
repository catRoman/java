public class Exercise7_18{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] num = new int[10];
        System.out.println("Enter ten numbers: ");
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }

        System.out.println();
        bubbleSort(num);

        System.out.println("The sorted array loooks like: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] list){
        int temp = 0;
        for(int i =0; i < list.length; i++){
           
            for(int j = i; j < list.length -1; j++){
                if(list[j] < list[i]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                
            }
        }
    }

}