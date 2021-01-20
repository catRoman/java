public class Exercise5_15{
    public static void main(String[] args){
      
        for(int i = (int)'!',j = 0; i < (int)'~'; i++){
            System.out.print((char)i + " ");
            j++;
            if(j % 10 == 0)
                System.out.print("\n");

        }
        System.out.print("\n");
    }

}