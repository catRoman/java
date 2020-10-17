public class Exercise5_43{
    public static void main(String[] args){

        int count = 0;
        for(int i =1; i<= 7; i++){
            for(int j = 2; j <= 7; j++){
               if(i == j || i == (j + 1) || (j < i)){
                   continue;
               }
                System.out.println(i + " " + j);
                count++;
            }
            
            
        }
        System.out.println("There are a total of " + count + " combinations");
    }
}