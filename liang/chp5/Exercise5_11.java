public class Exercise5_11{
    public static void main(String[] args){
        int number =0;
        for(int i = 100; i < 200; i++)
                if(i % 6 == 0 ^ i % 5 ==0){
                    number += 1;
                    System.out.print((i) + " ");
                if(number % 10 ==0)
                    System.out.print("\n");
    }
    System.out.println();
    System.out.println("number --> " + number);

}
}